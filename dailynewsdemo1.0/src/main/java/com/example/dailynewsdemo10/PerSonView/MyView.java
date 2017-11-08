package com.example.dailynewsdemo10.PerSonView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by xujin on 2017/11/6.
 */

public class MyView extends View {
    private int mCenterX; //圆心X
    private int mCenterY;//圆心Y
    private Paint mPaint;//画笔


    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint=new Paint();
        mPaint.setAntiAlias(true);//去掉锯齿
        mCenterX=getWidth()/2;
        mCenterY=getHeight()/2;
        canvas.drawCircle(mCenterX,mCenterY,100,mPaint);

    }
}
