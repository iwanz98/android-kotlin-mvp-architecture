package com.wanztudio.kotlin.mvp.ui.base.presenter

import com.wanztudio.kotlin.mvp.ui.base.interactor.MVPInteractor
import com.wanztudio.kotlin.mvp.ui.base.view.MVPView
import com.wanztudio.kotlin.mvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Ridwan Ismail on 23/September/2018
 * You can contact me at : iwanz@pm.me
 */

abstract class BasePresenter<V : MVPView, I : MVPInteractor> internal constructor(protected var interactor: I?, protected val schedulerProvider: SchedulerProvider, protected val compositeDisposable: CompositeDisposable) : MVPPresenter<V, I> {

    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null

    override fun onAttach(view: V?) {
        this.view = view
    }

    override fun getView(): V? = view

    override fun onDetach() {
        compositeDisposable.dispose()
        view = null
        interactor = null
    }

}