package com.indialone.databindingdemo1.databinding

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.indialone.databindingdemo1.R

object GlideBindingAdapters {

    @JvmStatic
    @BindingAdapter("imageResource")
    fun setImageResource(view: ImageView, imageUrl: Int) {
        val context: Context = view.context
        val option = RequestOptions()
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_foreground)

        Glide.with(context)
            .setDefaultRequestOptions(option)
            .load(imageUrl)
            .into(view)
    }

    @JvmStatic
    @BindingAdapter("imageResource")
    fun setImageResource(view: ImageView, imageUrl: String) {
        val context: Context = view.context
        val option = RequestOptions()
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_foreground)

        Glide.with(context)
            .setDefaultRequestOptions(option)
            .load(imageUrl)
            .into(view)
    }

}