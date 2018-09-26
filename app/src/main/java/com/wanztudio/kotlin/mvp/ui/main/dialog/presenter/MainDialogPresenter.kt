package com.wanztudio.kotlin.mvp.ui.main.dialog.presenter

import com.wanztudio.kotlin.mvp.ui.base.presenter.BasePresenter
import com.wanztudio.kotlin.mvp.ui.main.dialog.interactor.MainDialogMVPInterator
import com.wanztudio.kotlin.mvp.ui.main.dialog.view.MainDialogMVPView
import com.wanztudio.kotlin.mvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

class MainDialogPresenter<V : MainDialogMVPView, I : MainDialogMVPInterator> @Inject internal constructor(interator: I, schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interator, schedulerProvider = schedulerProvider, compositeDisposable = compositeDisposable), MainDialogMVPPresenter<V, I> {

    override fun onLaterOptionClicked() = getView()?.let { it.dismissDialog() }

    override fun onSubmitOptionClicked() = interactor?.let {
        getView()?.let {
            it.showSuccessMessage()
            it.dismissDialog()
        }
    }
}
