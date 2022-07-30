package com.adapty.flutter.serialization

import com.adapty.errors.AdaptyError
import com.adapty.errors.AdaptyErrorCode
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class AdaptyErrorSerializer : JsonSerializer<AdaptyError> {

    companion object {
        const val ADAPTY_CODE = "adaptyCode"
        const val MESSAGE = "message"
    }

    override fun serialize(
        src: AdaptyError,
        typeOfSrc: Type,
        context: JsonSerializationContext
    ): JsonElement {
        return JsonObject().apply {
            addProperty(ADAPTY_CODE, intFromErrorCode(src.adaptyErrorCode))
            addProperty(MESSAGE, src.message.orEmpty())
        }
    }

    private fun intFromErrorCode(code: AdaptyErrorCode): Int = when (code) {
        AdaptyErrorCode.UNKNOWN -> 0
        AdaptyErrorCode.USER_CANCELED -> 2
        AdaptyErrorCode.ITEM_UNAVAILABLE -> 5
        AdaptyErrorCode.ADAPTY_NOT_INITIALIZED -> 20
        AdaptyErrorCode.PAYWALL_NOT_FOUND -> 21
        AdaptyErrorCode.PRODUCT_NOT_FOUND -> 22
        AdaptyErrorCode.INVALID_JSON -> 23
        AdaptyErrorCode.CURRENT_SUBSCRIPTION_TO_UPDATE_NOT_FOUND_IN_HISTORY -> 24
        AdaptyErrorCode.PENDING_PURCHASE -> 25
        AdaptyErrorCode.BILLING_SERVICE_TIMEOUT -> 97
        AdaptyErrorCode.FEATURE_NOT_SUPPORTED -> 98
        AdaptyErrorCode.BILLING_SERVICE_DISCONNECTED -> 99
        AdaptyErrorCode.BILLING_SERVICE_UNAVAILABLE -> 102
        AdaptyErrorCode.BILLING_UNAVAILABLE -> 103
        AdaptyErrorCode.DEVELOPER_ERROR -> 105
        AdaptyErrorCode.BILLING_ERROR -> 106
        AdaptyErrorCode.ITEM_ALREADY_OWNED -> 107
        AdaptyErrorCode.ITEM_NOT_OWNED -> 108
        AdaptyErrorCode.NO_PURCHASES_TO_RESTORE -> 1004
        AdaptyErrorCode.FALLBACK_PAYWALLS_NOT_REQUIRED -> 1008
        AdaptyErrorCode.AUTHENTICATION_ERROR -> 2002
        AdaptyErrorCode.BAD_REQUEST -> 2003
        AdaptyErrorCode.SERVER_ERROR -> 2004
        AdaptyErrorCode.REQUEST_FAILED -> 2005
        AdaptyErrorCode.MISSING_PARAMETER -> 2007
    }
}