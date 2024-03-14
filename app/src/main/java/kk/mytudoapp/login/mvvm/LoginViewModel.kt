package kk.mytudoapp.login.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginViewModel @Inject constructor() : ViewModel() {

    private val mutableLiveData = MutableLiveData<String>()

    val getLoginStatus : LiveData<String>
        get() = mutableLiveData


    fun getCheckUserPassword(name : String, password: String ){
        if (name == "kanhai" && password == "kanhai123") {
            mutableLiveData.value = "success"
        } else {
            mutableLiveData.value = "failure"
        }
    }

}