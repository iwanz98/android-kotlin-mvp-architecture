package com.wanztudio.kotlin.mvp.ui.splash.interactor

import android.content.Context
import com.wanztudio.kotlin.mvp.data.database.repository.user.UserRepo
import com.wanztudio.kotlin.mvp.data.network.ApiHelper
import com.wanztudio.kotlin.mvp.data.preferences.PreferenceHelper
import com.wanztudio.kotlin.mvp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

class SplashInteractor @Inject constructor(private val context: Context, private val userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), SplashMVPInteractor {

}