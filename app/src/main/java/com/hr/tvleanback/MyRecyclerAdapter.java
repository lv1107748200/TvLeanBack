package com.hr.tvleanback;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/*
 * lv   2018/8/20
 */
public class MyRecyclerAdapter  extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
    private List dataList;

    private LayoutInflater layoutInflater;

    public MyRecyclerAdapter(Context context, List dataList) {
        this.dataList = dataList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.item_image, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        GlideUtil.setGlideImage(holder.imageView.getContext()
                , (String) dataList.get(position),holder.imageView,R.drawable.hehe);

        holder.textView.setText("hehe");

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }




    class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;


        MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
