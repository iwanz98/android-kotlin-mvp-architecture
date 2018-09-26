package com.wanztudio.kotlin.mvp.ui.main.first.presenter

import com.wanztudio.kotlin.mvp.ui.base.presenter.BasePresenter
import com.wanztudio.kotlin.mvp.ui.main.first.interactor.FirstMVPInteractor
import com.wanztudio.kotlin.mvp.ui.main.first.view.FirstMVPView
import com.wanztudio.kotlin.mvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

class FirstPresenter<V : FirstMVPView, I : FirstMVPInteractor> @Inject constructor(interactor: I, schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = compositeDisposable), FirstMVPPresenter<V, I> {

    override fun onViewPrepared() {

    }
}