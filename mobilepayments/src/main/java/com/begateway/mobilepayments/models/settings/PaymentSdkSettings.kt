package com.begateway.mobilepayments.models.settings

internal data class PaymentSdkSettings(
    var endpoint: String = "",
    var isDebugMode: Boolean = false,
    var publicKey: String = "",
    var samsungPayServiceId: String = "",
    var isCardNumberFieldVisible: Boolean = true,
    var isCardHolderFieldVisible: Boolean = true,
    var isCardDateFieldVisible: Boolean = true,
    var isCardCVCFieldVisible: Boolean = true,
)