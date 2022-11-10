package com.bits.template.data.network.models.collection.persons

import com.bits.template.data.local.database.entities.Person
import com.bits.template.data.network.models.base.BaseData

class PersonsData(var matchesResponse: PersonsResponse) : BaseData(matchesResponse){

    fun getMatches() : List<Person>? {
        return matchesResponse.results
    }
}