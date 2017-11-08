package com.example.xujin.myapplication;

/**
 * Created by xujin on 2017/11/2.
 */

public class MenuInfo {
    private String text_left;
    private int  img;

    public String getText_left() {
        return text_left;
    }

    public void setText_left(String text_left) {
        this.text_left = text_left;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public MenuInfo(String text_left, int img) {
        this.text_left = text_left;
        this.img = img;
    }
}
