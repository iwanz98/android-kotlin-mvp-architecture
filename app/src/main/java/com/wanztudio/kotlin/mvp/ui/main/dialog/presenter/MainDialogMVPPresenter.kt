package com.wanztudio.kotlin.mvp.ui.main.dialog.presenter

import com.wanztudio.kotlin.mvp.ui.base.presenter.MVPPresenter
import com.wanztudio.kotlin.mvp.ui.main.dialog.interactor.MainDialogMVPInterator
import com.wanztudio.kotlin.mvp.ui.main.dialog.view.MainDialogMVPView

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

interface MainDialogMVPPresenter<V : MainDialogMVPView, I : MainDialogMVPInterator> : MVPPresenter<V, I> {

    fun onLaterOptionClicked() : Unit?
    fun onSubmitOptionClicked() : Unit?
}