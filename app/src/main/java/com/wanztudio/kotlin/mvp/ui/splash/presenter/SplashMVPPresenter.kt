package com.wanztudio.kotlin.mvp.ui.splash.presenter

import com.wanztudio.kotlin.mvp.ui.base.presenter.MVPPresenter
import com.wanztudio.kotlin.mvp.ui.splash.interactor.SplashMVPInteractor
import com.wanztudio.kotlin.mvp.ui.splash.view.SplashMVPView

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

interface SplashMVPPresenter<V : SplashMVPView, I : SplashMVPInteractor> : MVPPresenter<V,I>