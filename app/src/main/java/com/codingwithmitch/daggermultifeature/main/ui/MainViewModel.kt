package com.codingwithmitch.daggermultifeature.main.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codingwithmitch.daggermultifeature.main.di.MainFragmentScope
import com.codingwithmitch.daggermultifeature.main.repository.MainRepository
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import javax.inject.Inject

@MainFragmentScope
class MainViewModel
@Inject
constructor(
    private val homeRepository: MainRepository
) : ViewModel(){

    private val _homeString: MutableLiveData<String> = MutableLiveData()

    val homeString: LiveData<String> get() = _homeString

    fun retrieveHomeString(){
        viewModelScope.launch {
            val homeString = homeRepository.getHomeString()
            _homeString.value = homeString
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}


