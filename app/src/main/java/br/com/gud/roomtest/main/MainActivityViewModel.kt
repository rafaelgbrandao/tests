package br.com.gud.roomtest.main

import androidx.lifecycle.ViewModel
import br.com.gud.navigation.Router

class MainActivityViewModel(private val router: Router): ViewModel() {

    fun navigationToScreen() = router.lvSelectedScreen
}