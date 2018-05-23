package com.wavesplatform.wallet.v2.ui.welcome

import android.support.v4.view.ViewPager
import android.view.View
import com.wavesplatform.wallet.R
import kotlinx.android.synthetic.main.item_welcome.view.*
import pers.victor.ext.screenWidth
import timber.log.Timber


class AlphaScalePageTransformer : ViewPager.PageTransformer {
    private val MIN_SCALE = 0.32f
    private val MIN_ALPHA = 0.4f

    override fun transformPage(view: View, position: Float) {
        Timber.i("SCREEN: %s", screenWidth)
        val scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position - 1.32f))
        val alphaFactor = Math.max(MIN_ALPHA, 1 - Math.abs(position - 1.32f))

        view.image_welcome_photo.scaleX = scaleFactor
        view.image_welcome_photo.scaleY = scaleFactor
        view.image_welcome_photo.alpha = alphaFactor


    }
}