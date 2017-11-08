package com.example.dailynewsdemo10.Bean;

import java.util.List;

/**
 * Created by xujin on 2017/11/3.
 */

public class MenuInfo02 {

    /**
     * date : 20171103
     * stories : [{"images":["https://pic2.zhimg.com/v2-692379eef7b60ee2339aa4aaf154f3b9.jpg"],"type":0,"id":9654879,"ga_prefix":"110308","title":"用上这些方法，我们找到了不少人类的未来家园"},{"images":["https://pic1.zhimg.com/v2-85a9a856e16dda69da186746a80ca704.jpg"],"type":0,"id":9654809,"ga_prefix":"110307","title":"一个研究了上百年的问题：「水泥」为什么会硬？"},{"images":["https://pic3.zhimg.com/v2-ac6d988e8eeaeacccda4627067c866de.jpg"],"type":0,"id":9655055,"ga_prefix":"110307","title":"害怕错过人工智能的年轻人：有人进速成班，有人忙着开公司，博士们跑着进BAT"},{"images":["https://pic3.zhimg.com/v2-c85e6c2a0527d2e382e63975160f27a2.jpg"],"type":0,"id":9654729,"ga_prefix":"110307","title":"那个在东京开「兰州拉面」的日本人"},{"images":["https://pic4.zhimg.com/v2-27a9664362ce1c20d5d679d451beb473.jpg"],"type":0,"id":9544893,"ga_prefix":"110306","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic4.zhimg.com/v2-73c51f5c469f73a05aa3f7d676d5960f.jpg","type":0,"id":9654729,"ga_prefix":"110307","title":"那个在东京开「兰州拉面」的日本人"},{"image":"https://pic1.zhimg.com/v2-e726590263fb85ed9586c8fc5692b42c.jpg","type":0,"id":9655055,"ga_prefix":"110307","title":"害怕错过人工智能的年轻人：有人进速成班，有人忙着开公司，博士们跑着进BAT"},{"image":"https://pic3.zhimg.com/v2-c7e231370c29b3324e4ae766bc8d5466.jpg","type":0,"id":9654952,"ga_prefix":"110214","title":"薛之谦新专辑的封面是不是抄袭了国外摄影师的作品，我的答案是\u2026\u2026"},{"image":"https://pic4.zhimg.com/v2-b0541a52263ebbedce82325755e64557.jpg","type":0,"id":9653385,"ga_prefix":"110216","title":"第一次见面就让你觉得有魅力，这些人是如何做到的？"},{"image":"https://pic3.zhimg.com/v2-950b384a4771a76092e4e93886b9a472.jpg","type":0,"id":9654801,"ga_prefix":"110207","title":"花 1 亿元买下鹿晗 60 天"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic2.zhimg.com/v2-692379eef7b60ee2339aa4aaf154f3b9.jpg"]
         * type : 0
         * id : 9654879
         * ga_prefix : 110308
         * title : 用上这些方法，我们找到了不少人类的未来家园
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic4.zhimg.com/v2-73c51f5c469f73a05aa3f7d676d5960f.jpg
         * type : 0
         * id : 9654729
         * ga_prefix : 110307
         * title : 那个在东京开「兰州拉面」的日本人
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
