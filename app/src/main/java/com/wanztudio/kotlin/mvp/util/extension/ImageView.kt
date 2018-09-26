package com.wanztudio.kotlin.mvp.util.extension

import android.graphics.Bitmap
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.wanztudio.kotlin.mvp.util.GlideApp

/**
 * Created by Ridwan Ismail on 23 September 2018
 * You can contact me at : iwanz@pm.me
 */

internal fun ImageView.loadImage(url: String) {
    GlideApp.with(this.context)
            .load(url)
            .encodeFormat(Bitmap.CompressFormat.JPEG)
            .centerCrop()
            .into(this)
}