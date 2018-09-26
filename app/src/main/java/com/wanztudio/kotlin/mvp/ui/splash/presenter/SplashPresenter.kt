package com.wanztudio.kotlin.mvp.ui.splash.presenter

import com.wanztudio.kotlin.mvp.ui.base.presenter.BasePresenter
import com.wanztudio.kotlin.mvp.ui.splash.interactor.SplashMVPInteractor
import com.wanztudio.kotlin.mvp.ui.splash.view.SplashMVPView
import com.wanztudio.kotlin.mvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

class SplashPresenter<V : SplashMVPView, I : SplashMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), SplashMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)

        decideActivityToOpen()
    }

    private fun decideActivityToOpen() = getView()?.let {
        if (isUserLoggedIn())
            it.openMainActivity()
        else
            it.openLoginActivity()
    }

    private fun isUserLoggedIn(): Boolean {
        interactor?.let { return it.isUserLoggedIn() }
        return false
    }

}