package com.wanztudio.kotlin.mvp.di.builder

import com.wanztudio.kotlin.mvp.ui.login.LoginActivityModule
import com.wanztudio.kotlin.mvp.ui.login.view.LoginActivity
import com.wanztudio.kotlin.mvp.ui.login.view.RegisterActivity
import com.wanztudio.kotlin.mvp.ui.main.dialog.MainDialogProvider
import com.wanztudio.kotlin.mvp.ui.main.first.FirstFragmentModule
import com.wanztudio.kotlin.mvp.ui.main.first.FirstFragmentProvider
import com.wanztudio.kotlin.mvp.ui.main.second.SecondFragmentProvider
import com.wanztudio.kotlin.mvp.ui.main.view.MainActivity
import com.wanztudio.kotlin.mvp.ui.register.RegisterActivityModule
import com.wanztudio.kotlin.mvp.ui.splash.SplashActivityModule
import com.wanztudio.kotlin.mvp.ui.splash.view.SplashMVPActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Ridwan Ismail on 23/September/2018
 * You can contact me at : iwanz@pm.me
 */

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashMVPActivity

    @ContributesAndroidInjector(modules = [(LoginActivityModule::class)])
    abstract fun bindLoginActivity(): LoginActivity
    
    @ContributesAndroidInjector(modules = [(RegisterActivityModule::class)])
    abstract fun bindRegisterActivity(): RegisterActivity

    @ContributesAndroidInjector(modules = [(MainDialogProvider::class), (FirstFragmentProvider::class), (SecondFragmentProvider::class)])
    abstract fun bindMainActivity(): MainActivity

}