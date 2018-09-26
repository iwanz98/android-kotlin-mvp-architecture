package com.wanztudio.kotlin.mvp.ui.base.interactor

import com.wanztudio.kotlin.mvp.data.network.ApiHelper
import com.wanztudio.kotlin.mvp.data.preferences.PreferenceHelper
import com.wanztudio.kotlin.mvp.util.Constants

/**
 * Created by Ridwan Ismail on 23/September/2018
 * You can contact me at : iwanz@pm.me
 */

open class BaseInteractor() : MVPInteractor {

    protected lateinit var preferenceHelper: PreferenceHelper
    protected lateinit var apiHelper: ApiHelper

    constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : this() {
        this.preferenceHelper = preferenceHelper
        this.apiHelper = apiHelper
    }

    override fun isUserLoggedIn() = this.preferenceHelper.getCurrentUserLoggedInMode() != Constants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.type

    override fun performUserLogout() = preferenceHelper.let {
        it.setCurrentUserId(null)
        it.setAccessToken(null)
        it.setCurrentUserEmail(null)
        it.setCurrentUserLoggedInMode(Constants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT)
    }

}