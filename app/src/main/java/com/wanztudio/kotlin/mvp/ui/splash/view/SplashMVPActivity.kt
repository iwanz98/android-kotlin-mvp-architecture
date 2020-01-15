package com.wanztudio.kotlin.mvp.ui.splash.view

import android.content.Intent
import android.os.Bundle
import com.wanztudio.kotlin.mvp.R
import com.wanztudio.kotlin.mvp.ui.base.view.BaseActivity
import com.wanztudio.kotlin.mvp.ui.register.view.RegisterActivity
import com.wanztudio.kotlin.mvp.ui.main.view.MainActivity
import com.wanztudio.kotlin.mvp.ui.splash.interactor.SplashMVPInteractor
import com.wanztudio.kotlin.mvp.ui.splash.presenter.SplashMVPPresenter
import javax.inject.Inject

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    @Inject
    lateinit var presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openLoginActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }
}
