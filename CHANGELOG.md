# 1.0.14
* Fixed type cast in the `makeDeferredPurchase` method
# 1.0.13
* Upgraded with iOS SDK version 1.17.7 and Android SDK version 1.11.0

# 1.0.12
* [Android] fixed localized properties

# 1.0.11
* Support for Flutter 3.0

# 1.0.10
* Ability to use Adapty-Info.plist for storing initialization parameters

# 1.0.9
* The `getPromo` method now works for Android [Issue 34](https://github.com/adaptyteam/AdaptySDK-Flutter/issues/34)
* Fixed typo in word "deferred" [Issue 35](https://github.com/adaptyteam/AdaptySDK-Flutter/issues/35)

# 1.0.8
* Updated `PurchaserInfoModel` property `profileId` access level to public

# 1.0.7
* [iOS] Added support for disabling IDFA collection
* [Android] Improved handling clicks on push notifications

# 1.0.6
* [iOS] Added support for AdServices attribution tracking
* [Android] internal sdk improvements

# 1.0.5
* [Android] added logLevel ALL, logLevel VERBOSE doesn't include analytical logs, but ALL does
* changed example for updating custom attribution
* various improvements

# 1.0.4

* added toString for `AdaptyAccessLevelInfo`, `AdaptySubscriptionInfo`, `AdaptyNonSubscriptionInfo` models

# 1.0.3

* Added new log level "all"
* Fallback paywalls offline work
* [iOS] Added optional `offerId` parameter to `makePurchase` method

# 1.0.2

* [iOS] Updated AdaptyProfileParameterBuilder to work with ATTrackingManager.AuthorizationStatus
* Removed usage of dart ffi
* Made receipt validation api method private

# 1.0.1

* [Android] Added support for fallback paywalls

# 1.0.0

* Graduate package to a stable release. See pre-releases prior to this version for changelog entries.

# 1.0.0-nullsafety.0

* Enable null safety
* Require Dart 2.12 or greater.

# 0.3.6

* [Android] fixed localizedTitle in product

# 0.3.5

* [iOS] Added `isFamilyShareable` property to product for iOS 14+.
* [iOS] Added `.presentCodeRedemptionSheet()` to public SDK API

# 0.3.4

* [Android] Small fix in requests

# 0.3.3

* [iOS] Added retry for `createProfile` request in case of poor connection or if server is down.
* [Android] Added gzip support
* Removed unnecessary event channel invocations for `.getPaywalls()` and `.getPurchaserInfo()` methods

# 0.3.2

* Fixed `.getPaywalls()` callback without an internet connection (Android only)

# 0.3.1

* Added `.setFacebookAnonymousId` method to `AdaptyProfileParameterBuilder`
* Added `freeTrialPeriod` property of `AdaptyProduct` model (Android only)

# 0.3.0

* Added ability to connect observer mode purchase with a paywall it was made from using `.setTransactionVariationId` method
* Added ability to opt-out from external analytics services using `.setExternalAnalyticsEnabled` method
* Added public `abTestName` and `name` properties to `AdaptyPaywall` and to nested products array.
* Paywall views must be reported using `.logShowPaywall(paywall)` method from now on, otherwise, views will not be collected.

# 0.2.0

* Plugin initialization scheme changed to prevent missing transaction on iOS.
* Added `.logShowPaywall(paywall)` to manually record paywall show event.
* Added `apnsTokenString` to public properties.
* Removed `state` from `.getPurchaserInfo()` callback. Added `forceUpdate` as an optional request parameter.
* Removed `state` from `.getPaywalls()` callback. Added `forceUpdate` as an optional request parameter.

# 0.1.2

* empty string custom payload fixed
* `updateAttribution()` fixed on Android
* `getPurchaserInfo()` stability improved
* `verbose logLevel` removed as default

# 0.1.1

* `customPayloadString` added to Paywall
* birthday fix in `updateProfile`

# 0.1.0

* Initial release