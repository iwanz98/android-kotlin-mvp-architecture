package com.wanztudio.kotlin.mvp.ui.login.interactor

import com.wanztudio.kotlin.mvp.data.network.LoginResponse
import com.wanztudio.kotlin.mvp.ui.base.interactor.MVPInteractor
import com.wanztudio.kotlin.mvp.util.Constants
import io.reactivex.Observable

/**
 * Created by Ridwan Ismail on 23/September/2018
 * You can contact me at : iwanz@pm.me
 */

interface LoginMVPInteractor : MVPInteractor {

    fun doServerLoginApiCall(email: String, password: String): Observable<LoginResponse>

    fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: Constants.LoggedInMode)

}