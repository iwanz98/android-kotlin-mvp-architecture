package com.wanztudio.kotlin.mvp.ui.register.presenter

import com.wanztudio.framework.mvp.ui.register.view.RegisterMVPView
import com.wanztudio.kotlin.mvp.ui.base.presenter.MVPPresenter
import com.wanztudio.kotlin.mvp.ui.register.interactor.RegisterMVPInteractor

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

interface RegisterMVPPresenter<V : RegisterMVPView, I : RegisterMVPInteractor> : MVPPresenter<V, I> {

}