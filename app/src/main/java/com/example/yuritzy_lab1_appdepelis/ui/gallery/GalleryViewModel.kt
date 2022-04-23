package com.example.yuritzy_lab1_appdepelis.ui.gallery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    val password: MutableLiveData<String> = MutableLiveData()
    val showError: MutableLiveData<Boolean> = MutableLiveData()

    fun register() {
        showError.value = !"^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$".toRegex().containsMatchIn(password.value?: "")
    }

}