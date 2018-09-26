package com.wanztudio.kotlin.mvp.ui.base.view

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wanztudio.kotlin.mvp.util.CommonUtil
import dagger.android.AndroidInjection

/**
 * Created by Ridwan Ismail on 23/September/2018
 * You can contact me at : iwanz@pm.me
 */

abstract class BaseActivity : AppCompatActivity(), MVPView, BaseFragment.CallBack {

    private var progressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDI()
    }

    override fun hideProgress() {
        progressDialog?.let { if (it.isShowing) it.cancel() }
    }

    override fun showProgress() {
        hideProgress()
        progressDialog = CommonUtil.showLoadingDialog(this)
    }

    private fun performDI() = AndroidInjection.inject(this)

}