package com.hr.tvleanback;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by 吕 on 2017/12/4.
 */

public class GlideUtil {
    public static void setGlideImage(Context context, String url, ImageView imageView){
        Glide.with(context)
                .load(url)//
                .into(imageView);
    }
    public static void setGlideImage(Context context, int url, ImageView imageView){
        Glide.with(context)
                .load(url)//
                .into(imageView);
    }
    public static void setGlideImage(Context context, String url, ImageView imageView, int id){
        RequestOptions options = new RequestOptions()
                .skipMemoryCache(false)
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                .fitCenter()
                .placeholder(id)
                .error(0)
                .priority(Priority.HIGH);
        Glide.with(context)
                .load(url)//
                .apply(options)
                .into(imageView);
    }

}
