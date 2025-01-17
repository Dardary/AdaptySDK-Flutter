import 'dart:io';

import 'package:adapty_flutter/adapty_flutter.dart';

import 'package:flutter_apns/flutter_apns.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:uuid/uuid.dart';

class Service {
  static final PushConnector? _connector = Platform.isIOS ? createPushConnector() : null;

  static Future<void> initializePushes() async {
    if (!Platform.isIOS) return;

    _connector!.configure(
      onLaunch: (message) => Adapty.handlePushNotification(message.data),
      onResume: (message) => Adapty.handlePushNotification(message.data),
      onMessage: (message) => Adapty.handlePushNotification(message.data),
      onBackgroundMessage: (message) => Adapty.handlePushNotification(message.data),
    );
    _connector!.token.addListener(() => Adapty.setApnsToken(_connector!.token.value!));
    _connector!.requestNotificationPermissions();

    if (_connector is ApnsPushConnector) {
      final apnsConnector = _connector as ApnsPushConnector;
      apnsConnector.shouldPresent = (x) => Future.value(true);
    }
  }

  static Future<String> getOrCreateInstallId() async {
    final prefs = await SharedPreferences.getInstance();
    String installId;
    if (prefs.containsKey('install_id')) {
      installId = prefs.getString('install_id')!;
    } else {
      installId = Uuid().v4();
      prefs.setString('install_id', installId);
    }

    return installId;
  }
}
