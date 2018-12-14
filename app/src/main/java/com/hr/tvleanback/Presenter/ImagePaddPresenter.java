package com.hr.tvleanback.Presenter;


import android.graphics.drawable.StateListDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hr.tvleanback.GlideUtil;
import com.hr.tvleanback.R;
import com.hr.tvleanback.cus.BorderDrawable;
import com.hr.tvleanbacklibrary.widget.Presenter;

/*
 * lv   2018/8/15
 */
public class ImagePaddPresenter extends Presenter {
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image_padd,
                null ,false);

        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_focused},new BorderDrawable(1,ContextCompat.getColor(parent.getContext(),R.color.colorAccent)));
        stateListDrawable.addState(new int[]{},new BorderDrawable(1,ContextCompat.getColor(parent.getContext(),android.R.color.transparent)));


        view.setBackground(stateListDrawable);

        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,300));
        return new ImagePresenterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {

        ImagePresenterViewHolder imagePresenterViewHolder = (ImagePresenterViewHolder) viewHolder;

        GlideUtil.setGlideImage(imagePresenterViewHolder.imageView.getContext()
        , (String) item,imagePresenterViewHolder.imageView,R.drawable.hehe);

        imagePresenterViewHolder.textView.setText("hehe");
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {

    }


   public   class ImagePresenterViewHolder extends ViewHolder{

        public ImageView imageView;
        public TextView textView;

        public ImagePresenterViewHolder(View view) {
            super(view);

            imageView = view.findViewById(R.id.image);
            textView = view.findViewById(R.id.tv);

        }
    }

}
