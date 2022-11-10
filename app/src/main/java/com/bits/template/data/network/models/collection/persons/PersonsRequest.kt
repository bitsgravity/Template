package com.bits.template.data.network.models.collection.persons

import com.bits.template.data.network.utils.CallCode
import com.bits.template.data.network.models.base.BaseRequest

data class PersonsRequest(
    var callCode: CallCode = CallCode.SUGGESTIONS
) : BaseRequest()