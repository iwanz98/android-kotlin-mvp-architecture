package com.wanztudio.kotlin.mvp.ui.main.first.presenter

import com.wanztudio.kotlin.mvp.ui.base.presenter.MVPPresenter
import com.wanztudio.kotlin.mvp.ui.main.first.interactor.FirstMVPInteractor
import com.wanztudio.kotlin.mvp.ui.main.first.view.FirstMVPView

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

interface FirstMVPPresenter<V : FirstMVPView, I : FirstMVPInteractor> : MVPPresenter<V, I> {

    fun onViewPrepared()
}