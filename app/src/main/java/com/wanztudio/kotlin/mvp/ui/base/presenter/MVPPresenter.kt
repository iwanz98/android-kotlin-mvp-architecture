package com.wanztudio.kotlin.mvp.ui.base.presenter

import com.wanztudio.kotlin.mvp.ui.base.interactor.MVPInteractor
import com.wanztudio.kotlin.mvp.ui.base.view.MVPView

/**
 * Created by Ridwan Ismail on 23/September/2018
 * You can contact me at : iwanz@pm.me
 */

interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

}