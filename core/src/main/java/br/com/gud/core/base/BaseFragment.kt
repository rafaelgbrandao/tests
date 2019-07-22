package br.com.gud.core.base

import androidx.fragment.app.Fragment

open class BaseFragment: Fragment() {

    private val baseActivity: BaseActivity?
        get() = activity as? BaseActivity

    fun setActionBarVisible(isVisible: Boolean) = baseActivity?.setActionBarVisible(isVisible)

    fun setBackButtonEnable() = baseActivity?.setBackButtonEnable(true)

    fun showSimpleDialog(
        title: String?,
        message: String?,
        positiveButtonText: String?,
        positiveButtonListener: () -> Unit,
        negativeButtonText: String?,
        negativeButtonListener: () -> Unit,
        isCancelable: Boolean = true
    ) {
        baseActivity?.showSimpleDialog(
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