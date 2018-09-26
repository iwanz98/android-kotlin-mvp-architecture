package com.wanztudio.kotlin.mvp.ui.base.interactor

/**
 * Created by Ridwan Ismail on 23/September/2018
 * You can contact me at : iwanz@pm.me
 */

interface MVPInteractor {

    fun isUserLoggedIn(): Boolean

    fun performUserLogout()

}