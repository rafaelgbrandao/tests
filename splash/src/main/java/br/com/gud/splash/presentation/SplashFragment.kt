package br.com.gud.splash.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.com.gud.core.base.BaseFragment
import br.com.gud.core.extensions.observe
import br.com.gud.core.helpers.DeviceHelper
import br.com.gud.splash.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashFragment: BaseFragment() {

    private val viewModel by viewModel<SplashViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setActionBarVisible(false)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startObservers()
        viewModel.onAppSuggestedVersionCheck()
    }

    private fun startObservers() {

        viewModel.showUpdateProgress().observe(this) {
            Toast.makeText(context, "Show Progress Update", Toast.LENGTH_LONG).show()
        }

        viewModel.showAppUpdateDialog().observe(this) {
            showSimpleDialog(
                title = "Nova versão disponível",
                message = "Deseja atualizar?",
                positiveButtonText = "Sim",
                positiveButtonListener = { Toast.makeText(context, "Positive Click", Toast.LENGTH_LONG).show() },
                negativeButtonText = "Não",
                negativeButtonListener = { searchForUpdates() }
            )
        }

        viewModel.appUpToDate().observe(this) {
            searchForUpdates()
        }

        viewModel.noUpdateFound().observe(this) {
            validateUser()
        }
    }

    private fun searchForUpdates() {
        GlobalScope.launch { viewModel.onSearchForUpdate() }
    }

    private fun validateUser() {
        viewModel.onValidateUser(
            deviceId = DeviceHelper.deviceId(context),
            appVersion = DeviceHelper.versionName(context)
        )
    }
}