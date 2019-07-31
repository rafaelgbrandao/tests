package br.com.gud.core.helpers

import android.annotation.SuppressLint
import android.content.Context
import android.provider.Settings

object DeviceHelper {

    fun versionName(context: Context?) : String {
        return context?.packageManager?.getPackageInfo(context.packageName, 0)?.versionName
            ?: "0"
    }

    @SuppressLint("HardwareIds")
    fun deviceId(context: Context?): String {
        return context?.let {
            Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
        } ?: ""
    }
}