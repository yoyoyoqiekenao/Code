package com.example.xujin.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xujin on 2017/11/2.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<MenuInfo> list;
    private Context context;

    public MyAdapter(List<MenuInfo> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        if(position%2==0){
            return 0;
        }else{
            return 1;
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=null;
        ViewHolder holder=null;
        switch (viewType){
            case 0:
                view= LayoutInflater.from(context).inflate(R.layout.item01,parent,false);
                holder=new ViewHolder(view);
                break;
            case 1:
                view=LayoutInflater.from(context).inflate(R.layout.item02,parent,false);
               // holder=new ViewHolder02(view);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int typeView=getItemViewType(position);
        switch (typeView){
            case 0:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

     class ViewHolder extends RecyclerView.ViewHolder {
        TextView myContent;
        ImageView myIcon01;
        public ViewHolder(View itemView) {
            super(itemView);
            myContent=itemView.findViewById(R.id.myContent);
            myIcon01=itemView.findViewById(R.id.myIcon);
        }
    }
     class ViewHolder02 extends RecyclerView.ViewHolder{
        TextView myContent02;
        ImageView myIcon02;
        public ViewHolder02(View itemView) {
            super(itemView);
            myContent02=itemView.findViewById(R.id.myContent02);
            myIcon02=itemView.findViewById(R.id.myIcon02);
        }
    }


}
