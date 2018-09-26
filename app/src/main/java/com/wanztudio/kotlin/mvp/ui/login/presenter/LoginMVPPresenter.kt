package com.wanztudio.kotlin.mvp.ui.login.presenter

import com.wanztudio.framework.mvp.ui.login.view.LoginMVPView
import com.wanztudio.kotlin.mvp.ui.base.presenter.MVPPresenter
import com.wanztudio.kotlin.mvp.ui.login.interactor.LoginMVPInteractor

/**
 * Created by Ridwan Ismail on 23/September/2018
 * You can contact me at : iwanz@pm.me
 */

interface LoginMVPPresenter<V : LoginMVPView, I : LoginMVPInteractor> : MVPPresenter<V, I> {

    fun onServerLoginClicked(email: String, password: String)
}