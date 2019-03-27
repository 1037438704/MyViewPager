package com.example.ninetaildemonfox.myviewpager;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by NineTailDemonFox on 2019/3/13.
 */

public class GlideUtils {
    public static void glidFillet(Context me, String url, ImageView imageView){
        Glide
                .with(me)
                .load(url)
                .circleCrop()
                .placeholder(R.mipmap.ic_launcher)//没有加载出来之前显示的图片
                .fallback(R.mipmap.ic_launcher)//没加载出来时
                .error(R.mipmap.ic_launcher)//加载错误时
                .into(imageView);
    }
    public static void glideOriginal(Context me, String url, ImageView imageView){
        RoundedCorners roundedCorners = new RoundedCorners(10);
//通过RequestOptions扩展功能,override:采样率,因为ImageView就这么大,可以压缩图片,降低内存消耗
        RequestOptions options= RequestOptions.bitmapTransform(roundedCorners).override(300, 300);
        Glide
                .with(me)
                .load(url)
                .apply(options)
                .placeholder(R.mipmap.ic_launcher)//没有加载出来之前显示的图片
                .fallback(R.mipmap.ic_launcher)//没加载出来时
                .error(R.mipmap.ic_launcher)//加载错误时
                .into(imageView);
    }
    public static void glideOriginal(Context me, int url, ImageView imageView){
        RoundedCorners roundedCorners = new RoundedCorners(20);
//通过RequestOptions扩展功能,override:采样率,因为ImageView就这么大,可以压缩图片,降低内存消耗
        RequestOptions options= RequestOptions.bitmapTransform(roundedCorners).override(300, 300);
        Glide
                .with(me)
                .load(url)
                .apply(options)
                .placeholder(R.mipmap.ic_launcher)//没有加载出来之前显示的图片
                .fallback(R.mipmap.ic_launcher)//没加载出来时
                .error(R.mipmap.ic_launcher)//加载错误时
                .into(imageView);
    }

    public static void glideOriginal2(Context me, String url, ImageView imageView){
//通过RequestOptions扩展功能,override:采样率,因为ImageView就这么大,可以压缩图片,降低内存消耗
        Glide
                .with(me)
                .load(url)
                .placeholder(R.mipmap.ic_launcher)//没有加载出来之前显示的图片
                .fallback(R.mipmap.ic_launcher)//没加载出来时
                .error(R.mipmap.ic_launcher)//加载错误时
                .into(imageView);
    }
}
