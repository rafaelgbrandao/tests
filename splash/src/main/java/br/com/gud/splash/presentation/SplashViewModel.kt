package br.com.gud.splash.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.gud.splash.BuildConfig
import br.com.gud.splash.repository.SplashRepository

class SplashViewModel(private val splashRepository: SplashRepository) : ViewModel() {

    fun showAppUpdateDialog(): LiveData<Unit> = lvLastVersionNumber
    private val lvLastVersionNumber = MutableLiveData<Unit>()

    fun appUpToDate(): LiveData<Unit> = lvAppUpToDate
    private val lvAppUpToDate = MutableLiveData<Unit>()

    fun updateProgressValue(): LiveData<Unit> = lvUpdateValues
    private val lvUpdateValues = MutableLiveData<Unit>()

    fun noUpdateFound(): LiveData<Unit> = lvUpdateNotFound
    private val lvUpdateNotFound = MutableLiveData<Unit>()

    fun onSearchForUpdate() {
        when {
            splashRepository.onSearchForUpdates() -> lvUpdateValues.value = Unit
            else -> lvUpdateNotFound.value = Unit
        }
    }

    fun onAppSuggestedVersionCheck() {
        when {
            BuildConfig.VERSION_CODE < splashRepository.onSearchForUpdateVersionNumber() ->
                lvLastVersionNumber.value = Unit
            else -> lvAppUpToDate.value = Unit

        }
    }
}