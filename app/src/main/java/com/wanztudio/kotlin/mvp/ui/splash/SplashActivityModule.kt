package com.wanztudio.kotlin.mvp.ui.splash

import com.wanztudio.kotlin.mvp.ui.splash.interactor.SplashInteractor
import com.wanztudio.kotlin.mvp.ui.splash.interactor.SplashMVPInteractor
import com.wanztudio.kotlin.mvp.ui.splash.presenter.SplashMVPPresenter
import com.wanztudio.kotlin.mvp.ui.splash.presenter.SplashPresenter
import com.wanztudio.kotlin.mvp.ui.splash.view.SplashMVPView
import dagger.Module
import dagger.Provides

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashInteractor(splashInteractor: SplashInteractor): SplashMVPInteractor = splashInteractor

    @Provides
    internal fun provideSplashPresenter(splashPresenter: SplashPresenter<SplashMVPView, SplashMVPInteractor>)
            : SplashMVPPresenter<SplashMVPView, SplashMVPInteractor> = splashPresenter
}