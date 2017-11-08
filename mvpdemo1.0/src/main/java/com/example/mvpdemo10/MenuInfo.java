package com.example.mvpdemo10;

import java.util.List;

/**
 * Created by xujin on 2017/11/2.
 */

public class MenuInfo {

    /**
     * date : 20171102
     * stories : [{"title":"吃饭的时候看看这些书，连大白馒头也变得更好吃了","ga_prefix":"110215","images":["https://pic4.zhimg.com/v2-444b8714ccd63da40276992cf44f26d7.jpg"],"multipic":true,"type":0,"id":9654888},{"images":["https://pic2.zhimg.com/v2-32a0050de8821cdcdd317d358bfc289d.jpg"],"type":0,"id":9654952,"ga_prefix":"110214","title":"薛之谦新专辑的封面是不是抄袭了国外摄影师的作品，我的答案是\u2026\u2026"},{"images":["https://pic3.zhimg.com/v2-d956a66fc3de0b6cac8259879556f62a.jpg"],"type":0,"id":9654813,"ga_prefix":"110213","title":"爸妈年纪大了，担心痴呆找上门来，提早帮他们掏掏耳朵"},{"images":["https://pic4.zhimg.com/v2-62df0b6a9faa4a34de8477afc5a86ff7.jpg"],"type":0,"id":9654878,"ga_prefix":"110212","title":"大误 · 战国七雄 vs 七大王国"},{"images":["https://pic1.zhimg.com/v2-4640a98fa03f7b7a20d9b9a2b2ba7d40.jpg"],"type":0,"id":9654057,"ga_prefix":"110211","title":"你看它们，慢慢慢慢就朝地球中央陷下去了\u2026\u2026"},{"images":["https://pic1.zhimg.com/v2-4d103ac2e2a2e2cc20277dd06da82400.jpg"],"type":0,"id":9654614,"ga_prefix":"110210","title":"稀里糊涂吃钙片，没补到骨头里不说，还会适得其反"},{"images":["https://pic2.zhimg.com/v2-f95b3a8b2d2ca41b23755abe7dd51c71.jpg"],"type":0,"id":9653558,"ga_prefix":"110209","title":"光想着用洗衣粉去对付变黄了的白衣服，难怪老也洗不白"},{"images":["https://pic3.zhimg.com/v2-7dd64d09394752a6926ec0598015ae2a.jpg"],"type":0,"id":9654803,"ga_prefix":"110208","title":"听起来像个地铁站，「宋城路」接的都是跑火车的活"},{"images":["https://pic2.zhimg.com/v2-2fe0f3cf38550399960a290622a03021.jpg"],"type":0,"id":9654820,"ga_prefix":"110207","title":"「车越贵越安全」，可能并不是随便说说"},{"images":["https://pic1.zhimg.com/v2-b82b53db5bc2e90850d975cea8c05ffc.jpg"],"type":0,"id":9654801,"ga_prefix":"110207","title":"花 1 亿元买下鹿晗 60 天"},{"images":["https://pic3.zhimg.com/v2-0eee4429513b67ef8c42398930c24c32.jpg"],"type":0,"id":9654828,"ga_prefix":"110207","title":"- 我这么伤心都是因为你\r\n- 明明是怪你好吗\u2026\u2026"},{"images":["https://pic4.zhimg.com/v2-a2f980b7f665274404760f87df0d8f3f.jpg"],"type":0,"id":9653677,"ga_prefix":"110206","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic3.zhimg.com/v2-c7e231370c29b3324e4ae766bc8d5466.jpg","type":0,"id":9654952,"ga_prefix":"110214","title":"薛之谦新专辑的封面是不是抄袭了国外摄影师的作品，我的答案是\u2026\u2026"},{"image":"https://pic3.zhimg.com/v2-950b384a4771a76092e4e93886b9a472.jpg","type":0,"id":9654801,"ga_prefix":"110207","title":"花 1 亿元买下鹿晗 60 天"},{"image":"https://pic1.zhimg.com/v2-9e00f75b8afdc388451b60c8d735708c.jpg","type":0,"id":9654707,"ga_prefix":"110119","title":"这些世界名画，让人不得不赞叹巧妙的构图"},{"image":"https://pic1.zhimg.com/v2-e3138fd96b9e83bafcf863bc0dd87f1c.jpg","type":0,"id":9654851,"ga_prefix":"110116","title":"八旬老母含泪杀死儿子，一个「养儿怕老」的无奈悲剧"},{"image":"https://pic4.zhimg.com/v2-0bba587bf16f883bcd29038ee7f92d97.jpg","type":0,"id":9654835,"ga_prefix":"110117","title":"最初两个中学生的奇妙幻想，成长为耀眼的商业奇迹"}]
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
         * title : 吃饭的时候看看这些书，连大白馒头也变得更好吃了
         * ga_prefix : 110215
         * images : ["https://pic4.zhimg.com/v2-444b8714ccd63da40276992cf44f26d7.jpg"]
         * multipic : true
         * type : 0
         * id : 9654888
         */

        private String title;
        private String ga_prefix;
        private boolean multipic;
        private int type;
        private int id;
        private List<String> images;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
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

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic3.zhimg.com/v2-c7e231370c29b3324e4ae766bc8d5466.jpg
         * type : 0
         * id : 9654952
         * ga_prefix : 110214
         * title : 薛之谦新专辑的封面是不是抄袭了国外摄影师的作品，我的答案是……
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
