package com.bits.template.data.network.models.base

open class BaseData(var baseResponse: BaseResponse){
    fun isOk(): Boolean {
//        return baseResponse.status == 200
        return true
    }

    fun isSuccess() : Boolean {
//        return baseResponse.errors==false
        return true
    }

    fun getMessage() : String{
        return ""
    }
}