package com.bits.template.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bits.template.data.local.database.AppDatabase
import com.bits.template.data.local.database.entities.Person
import com.bits.template.data.local.preference.AppPreference
import com.bits.template.data.network.Api
import com.bits.template.data.network.models.collection.persons.PersonsRequest
import com.bits.template.data.network.utils.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

//private val MINIMUM_INTERVAL = 6

class AuthRepository @Inject constructor(private val api: Api, private val appPreference: AppPreference, private val appDatabase: AppDatabase) : NetworkCall() {

}