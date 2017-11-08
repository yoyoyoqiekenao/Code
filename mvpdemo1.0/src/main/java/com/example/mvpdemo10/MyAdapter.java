package com.example.mvpdemo10;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

/**
 * Created by xujin on 2017/11/2.
 */

public class MyAdapter extends BaseAdapter {
    private List<MenuInfo.StoriesBean> list;
    private Context context;

    public MyAdapter(List<MenuInfo.StoriesBean> list, Context context) {
        this.list = list;
        this.context = context;
        ImageLoaderConfiguration configuration=new ImageLoaderConfiguration.Builder(context).build();
        ImageLoader.getInstance().init(configuration);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            holder=new ViewHolder();
            view=View.inflate(context,R.layout.item,null);
            holder.myContent=view.findViewById(R.id.myContent);
            holder.myIcon=view.findViewById(R.id.myIcon);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();
        }
        holder.myContent.setText(list.get(i).getTitle());
        //holder.myIcon.setImageResource(R.mipmap.ic_launcher);
        DisplayImageOptions options=new DisplayImageOptions.Builder()
                .showImageOnFail(R.mipmap.ic_launcher)
                .showImageOnLoading(R.mipmap.ic_launcher)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .build();
        ImageLoader.getInstance().displayImage(list.get(i).getImages().get(0),holder.myIcon,options);
        return view;
    }
    class ViewHolder{
        TextView myContent;
        ImageView myIcon;

    }
}
