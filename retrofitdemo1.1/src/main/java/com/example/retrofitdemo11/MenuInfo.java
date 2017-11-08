package com.example.retrofitdemo11;

import java.util.List;

/**
 * Created by xujin on 2017/11/7.
 */

public class MenuInfo {

    /**
     * date : 20171107
     * stories : [{"title":"业内人士怎么评价《英雄联盟》的原画水平？","ga_prefix":"110719","images":["https://pic3.zhimg.com/v2-a47c8eef4bdc87d862eb8682cbbfaa36.jpg"],"multipic":true,"type":0,"id":9655793},{"images":["https://pic1.zhimg.com/v2-fc835201edd6217a8b58c0e6b7100a04.jpg"],"type":0,"id":9655509,"ga_prefix":"110718","title":"一首曲子为什么「听着舒服」，其实不是光靠「感觉」的"},{"images":["https://pic3.zhimg.com/v2-c6671b7701f5f946b551f67f92b598ba.jpg"],"type":0,"id":9655803,"ga_prefix":"110717","title":"索尔为什么换发型？浩克又为何缺席内战？让我们从头说起"},{"images":["https://pic4.zhimg.com/v2-10280d2b04d832e93a3be77ce309fe73.jpg"],"type":0,"id":9655790,"ga_prefix":"110716","title":"150 分钟独家对话贾跃亭：赴美这四个月，我想了些什么"},{"images":["https://pic3.zhimg.com/v2-50df0853cc5594686a49beecfbde04b2.jpg"],"type":0,"id":9655548,"ga_prefix":"110715","title":"父母当着孩子的面吵架，真的就是「天塌了」的大事吗？"},{"images":["https://pic2.zhimg.com/v2-dd81c243983ff83b4c58578de4e2fd55.jpg"],"type":0,"id":9655556,"ga_prefix":"110714","title":"普通美国人一年花多少钱在医疗上？"},{"images":["https://pic4.zhimg.com/v2-bf02929bd8266987bc19a02a41e11357.jpg"],"type":0,"id":9655746,"ga_prefix":"110713","title":"猎头胡歌的美好生活让人眼馋，现实的「猎场」其实很残酷"},{"images":["https://pic3.zhimg.com/v2-4a53108fb6415bf8b4eeb791c19093e6.jpg"],"type":0,"id":9655192,"ga_prefix":"110712","title":"大误 · 虐蚊子的奇技淫巧"},{"title":"世界最辣的辣椒们：正常人才不会去尝，堪比「核武器」","ga_prefix":"110711","images":["https://pic4.zhimg.com/v2-58cca3d6dbf3318d5039dce712514c13.jpg"],"multipic":true,"type":0,"id":9655708},{"images":["https://pic3.zhimg.com/v2-056e9adcb4a2df99e25ffba243dc8d82.jpg"],"type":0,"id":9655491,"ga_prefix":"110710","title":"简单的几招，每个健身小白都能当识破教练的「预言家」"},{"images":["https://pic4.zhimg.com/v2-53710a63de07752df14d24bf119a90cb.jpg"],"type":0,"id":9655173,"ga_prefix":"110709","title":"「看，那个少年犯」：这样对待校园暴力，可能会让问题更严重"},{"images":["https://pic2.zhimg.com/v2-976bdf3b12bb7b183664c31050b26e5d.jpg"],"type":0,"id":9655494,"ga_prefix":"110708","title":"批量生产之前，汽车零件们都要走这么一遭"},{"images":["https://pic3.zhimg.com/v2-f9adedfd465a997fa215b67abda3c332.jpg"],"type":0,"id":9655595,"ga_prefix":"110707","title":"想开一家具有特色和知名度的民宿，你需要这么准备"},{"title":"《魔兽世界》推出了官方怀旧服和新资料片，你会选哪个？","ga_prefix":"110707","images":["https://pic2.zhimg.com/v2-b7f681e5d498706748c9f46705e3e075.jpg"],"multipic":true,"type":0,"id":9655726},{"images":["https://pic4.zhimg.com/v2-f02e2805622f27a0ce32a53947971713.jpg"],"type":0,"id":9655611,"ga_prefix":"110707","title":"为拿一年 45 万的奖学金，再复读两年进清华值不值？"},{"images":["https://pic4.zhimg.com/v2-e372106883041e0496ce1f48ae64d837.jpg"],"type":0,"id":9655435,"ga_prefix":"110706","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic4.zhimg.com/v2-983763e70a8315ba6787f6e3aae0aa5b.jpg","type":0,"id":9655793,"ga_prefix":"110719","title":"业内人士怎么评价《英雄联盟》的原画水平？"},{"image":"https://pic2.zhimg.com/v2-dbff2012900ab47ea82c01f4ab4cecd1.jpg","type":0,"id":9655803,"ga_prefix":"110717","title":"索尔为什么换发型？浩克又为何缺席内战？让我们从头说起"},{"image":"https://pic1.zhimg.com/v2-7c395bf97a8ff67bde2acd64ff18cda0.jpg","type":0,"id":9655790,"ga_prefix":"110716","title":"150 分钟独家对话贾跃亭：赴美这四个月，我想了些什么"},{"image":"https://pic2.zhimg.com/v2-6b4e928e0dcca5931fd9a0a3adc15569.jpg","type":0,"id":9655746,"ga_prefix":"110713","title":"猎头胡歌的美好生活让人眼馋，现实的「猎场」其实很残酷"},{"image":"https://pic2.zhimg.com/v2-ce7f7b7afb0d1947b1260d43d46be3c5.jpg","type":0,"id":9655708,"ga_prefix":"110711","title":"世界最辣的辣椒们：正常人才不会去尝，堪比「核武器」"}]
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
         * title : 业内人士怎么评价《英雄联盟》的原画水平？
         * ga_prefix : 110719
         * images : ["https://pic3.zhimg.com/v2-a47c8eef4bdc87d862eb8682cbbfaa36.jpg"]
         * multipic : true
         * type : 0
         * id : 9655793
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
         * image : https://pic4.zhimg.com/v2-983763e70a8315ba6787f6e3aae0aa5b.jpg
         * type : 0
         * id : 9655793
         * ga_prefix : 110719
         * title : 业内人士怎么评价《英雄联盟》的原画水平？
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
