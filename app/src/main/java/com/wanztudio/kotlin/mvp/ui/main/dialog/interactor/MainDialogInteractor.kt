package com.wanztudio.kotlin.mvp.ui.main.dialog.interactor

import com.wanztudio.kotlin.mvp.data.network.ApiHelper
import com.wanztudio.kotlin.mvp.data.preferences.PreferenceHelper
import com.wanztudio.kotlin.mvp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

class MainDialogInteractor @Inject internal constructor(apiHelper: ApiHelper, preferenceHelper: PreferenceHelper) : BaseInteractor(apiHelper = apiHelper, preferenceHelper = preferenceHelper), MainDialogMVPInterator {

}