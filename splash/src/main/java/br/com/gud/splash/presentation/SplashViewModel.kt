package br.com.gud.splash.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.gud.core.base.BaseNavigation
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

    suspend fun onSearchForUpdate() {
        when {
            splashRepository.onSearchForUpdates() -> lvUpdateValues.postValue(Unit)
            else -> lvUpdateNotFound.postValue(Unit)
        }
    }

    fun onAppSuggestedVersionCheck() {
        when {
            BuildConfig.VERSION_CODE < splashRepository.onSearchForUpdateVersionNumber() ->
                lvLastVersionNumber.postValue(Unit)
            else -> lvAppUpToDate.postValue(Unit)

        }
    }

    fun onValidateUser(className: String, deviceId: String, appVersion: String) {
        BaseNavigation.lvNextFlow.postValue(
            Pair(
                className,
                splashRepository.isUserValid(
                    appVersion = appVersion,
                    deviceId = deviceId
                )
            )
        )
    }
}