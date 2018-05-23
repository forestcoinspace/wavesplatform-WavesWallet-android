package com.wavesplatform.wallet.v2.data.manager

import com.wavesplatform.wallet.v2.data.local.PreferencesHelper
import com.wavesplatform.wallet.v2.data.model.remote.request.Posts
import com.wavesplatform.wallet.v2.data.remote.AppService
import io.reactivex.Observable
import javax.inject.Inject

class DataManager @Inject constructor(val mAppService: AppService, val mPreferencesHelper: PreferencesHelper){

}