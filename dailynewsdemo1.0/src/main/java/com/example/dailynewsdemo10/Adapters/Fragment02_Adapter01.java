package com.example.dailynewsdemo10.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dailynewsdemo10.Bean.MenuInfo02;
import com.example.dailynewsdemo10.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by xujin on 2017/11/3.
 */

public class Fragment02_Adapter01 extends BaseAdapter {
    private List<MenuInfo02.StoriesBean> list;
    private Context context;

    public Fragment02_Adapter01(List<MenuInfo02.StoriesBean> list, Context context) {
        this.list = list;
        this.context = context;
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
            view=View.inflate(context, R.layout.fragment02_item01,null);
            holder.myContent=view.findViewById(R.id.fragment02_content);
            holder.myIcon=view.findViewById(R.id.fragment02_img);
            view.setTag(holder);
        }else{
          holder= (ViewHolder) view.getTag();
        }
        holder.myContent.setText(list.get(i).getTitle());
        DraweeController controller=Fresco.newDraweeControllerBuilder()
                .setUri(list.get(i).getImages().get(0)) //设置资源
               // .setAutoPlayAnimations(true)//
                .build();
        holder.myIcon.setController(controller);
        return view;
    }
    class ViewHolder{
        TextView myContent;
        SimpleDraweeView myIcon;
    }
}
