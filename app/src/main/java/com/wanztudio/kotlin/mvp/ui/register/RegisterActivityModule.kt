package com.wanztudio.kotlin.mvp.ui.register

import com.wanztudio.framework.mvp.ui.register.view.RegisterMVPView
import com.wanztudio.kotlin.mvp.ui.register.interactor.RegisterInteractor
import com.wanztudio.kotlin.mvp.ui.register.interactor.RegisterMVPInteractor
import com.wanztudio.kotlin.mvp.ui.register.presenter.RegisterMVPPresenter
import com.wanztudio.kotlin.mvp.ui.register.presenter.RegisterPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

@Module
class RegisterActivityModule {

    @Provides
    internal fun provideRegisterInteractor(interactor: RegisterInteractor): RegisterMVPInteractor = interactor

    @Provides
    internal fun provideRegisterPresenter(presenter: RegisterPresenter<RegisterMVPView, RegisterMVPInteractor>)
            : RegisterMVPPresenter<RegisterMVPView, RegisterMVPInteractor> = presenter

}