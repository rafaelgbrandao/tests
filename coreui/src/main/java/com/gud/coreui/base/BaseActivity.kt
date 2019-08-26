package br.com.gud.core.base

import androidx.appcompat.app.AppCompatActivity
import br.com.gud.core.helpers.simpleAlertDialog

open class BaseActivity: AppCompatActivity() {

    fun setActionBarVisible(isVisible: Boolean) {
        when {
            isVisible -> supportActionBar?.show()
            else -> supportActionBar?.hide()
        }
    }

    fun setBackButtonEnable( isEnabled: Boolean) {
        supportActionBar?.apply {
            setHomeButtonEnabled(isEnabled)
            setDisplayHomeAsUpEnabled(isEnabled)
        }
    }

    fun showSimpleDialog(
        title: String?,
        message: String?,
        positiveButtonText: String?,
        positiveButtonListener: () -> Unit,
        negativeButtonText: String?,
        negativeButtonListener: () -> Unit,
        isCancelable: Boolean = true
    ) {
        simpleAlertDialog(
            context = this,
            title = title,
            message = message,
            positiveButtonText = positiveButtonText,
            positiveButtonListener = positiveButtonListener,
            negativeButtonText = negativeButtonText,
            negativeButtonListener = negativeButtonListener,
            isCancelable = isCancelable
        )
    }
}