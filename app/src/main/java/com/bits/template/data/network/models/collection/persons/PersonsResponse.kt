package com.bits.template.data.network.models.collection.persons
import com.bits.template.data.local.database.entities.Person
import com.bits.template.data.network.models.base.BaseResponse
import com.google.gson.annotations.SerializedName

data class PersonsResponse(
    @SerializedName("results") var results: List<Person>? = null,
) : BaseResponse()