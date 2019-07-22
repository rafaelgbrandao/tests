package br.com.gud.splash.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.gud.localrepository.user.LocalUserRepository
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

    fun navigateToHomeScreen(): LiveData<Unit> = lvUserValid
    private val lvUserValid = MutableLiveData<Unit>()

    fun navigateToLoginScreen(): LiveData<Unit> = lvUserInvalid
    private val lvUserInvalid = MutableLiveData<Unit>()

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

    fun onValidateUser(deviceId: String, appVersion: String) {
        when {
            splashRepository.isUserValid(appVersion = appVersion, deviceId = deviceId) ->
                lvUserValid.postValue(Unit)
            else -> lvUserInvalid.postValue(Unit)
        }
    }
}