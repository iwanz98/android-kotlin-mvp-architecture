package com.wanztudio.kotlin.mvp.ui.login.interactor

import com.wanztudio.kotlin.mvp.data.network.ApiHelper
import com.wanztudio.kotlin.mvp.data.network.LoginRequest
import com.wanztudio.kotlin.mvp.data.network.LoginResponse
import com.wanztudio.kotlin.mvp.data.preferences.PreferenceHelper
import com.wanztudio.kotlin.mvp.ui.base.interactor.BaseInteractor
import com.wanztudio.kotlin.mvp.util.Constants
import javax.inject.Inject

/**
 * Created by Ridwan Ismail on 23/September/2018
 * You can contact me at : iwanz@pm.me
 */

class LoginInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), LoginMVPInteractor {

    override fun doServerLoginApiCall(email: String, password: String) =
            apiHelper.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))


    override fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: Constants.LoggedInMode) =
            preferenceHelper.let {
                it.setCurrentUserId(loginResponse.userId)
                it.setAccessToken(loginResponse.accessToken)
                it.setCurrentUserLoggedInMode(loggedInMode)
            }
}