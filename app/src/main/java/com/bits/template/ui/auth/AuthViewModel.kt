package com.bits.template.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bits.template.data.local.database.entities.Person
import com.bits.template.data.network.models.collection.persons.PersonsRequest
import com.bits.template.data.network.utils.NetworkCallListener
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val repository: AuthRepository) : ViewModel() {

    //------------------------------------------- NETWORK ------------------------------------------//
    var networkCallListener : NetworkCallListener? =null

}