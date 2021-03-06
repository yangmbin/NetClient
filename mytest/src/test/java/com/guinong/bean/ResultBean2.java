package com.guinong.bean;

import java.util.List;

/**
 * @author csn
 * @date 2017/7/26 0026 16:55
 * @content
 */
public class ResultBean2 {

    private int id;
    private int pageId;
    private String name;
    private String layoutType;
    private String title;
    private String floorDesc;
    private int sortId;
    private String titleImage;
    private String bottomImage;
    private List<ItemsBean> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFloorDesc() {
        return floorDesc;
    }

    public void setFloorDesc(String floorDesc) {
        this.floorDesc = floorDesc;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public String getBottomImage() {
        return bottomImage;
    }

    public void setBottomImage(String bottomImage) {
        this.bottomImage = bottomImage;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        /**
         * name : 店铺
         * floorId : 7
         * openType : 2
         * sortId : 1
         * value : 17
         * text : 亚龙食品有限公司
         * imagePath : http://img.guinong.com/temp/201705231855249052330.png
         * url : null
         * params : null
         * stringExtend1 : null
         * stringExtend2 : null
         * moneyExtend1 : null
         * moneyExtend2 : null
         * activityType : 0
         * longExtend1 : null
         * longExtend2 : null
         * stateExtend1 : null
         * stateExtend2 : null
         * doubleExtend1 : null
         * doubleExtend2 : null
         */

        private String name;
        private int floorId;
        private int openType;
        private int sortId;
        private String value;
        private String text;
        private String imagePath;
        private String url;
        private String params;
        private String stringExtend1;
        private String stringExtend2;
        private double moneyExtend1;
        private double moneyExtend2;
        private int activityType;
        private double longExtend1;
        private double longExtend2;
        private String stateExtend1;  //是否有奖励
        private String stateExtend2;  //是否有折扣
        private double doubleExtend1;
        private double doubleExtend2;
        private String stateExtend3;  //是否包邮
        private String stateExtend4;  //商品秒杀开始与否

        public String getStateExtend4() {
            return stateExtend4;
        }

        public void setStateExtend4(String stateExtend4) {
            this.stateExtend4 = stateExtend4;
        }

        public String getStateExtend3() {
            return stateExtend3;
        }

        public void setStateExtend3(String stateExtend3) {
            this.stateExtend3 = stateExtend3;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getFloorId() {
            return floorId;
        }

        public void setFloorId(int floorId) {
            this.floorId = floorId;
        }

        public int getOpenType() {
            return openType;
        }

        public void setOpenType(int openType) {
            this.openType = openType;
        }

        public int getSortId() {
            return sortId;
        }

        public void setSortId(int sortId) {
            this.sortId = sortId;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getParams() {
            return params;
        }

        public void setParams(String params) {
            this.params = params;
        }

        public String getStringExtend1() {
            return stringExtend1;
        }

        public void setStringExtend1(String stringExtend1) {
            this.stringExtend1 = stringExtend1;
        }

        public String getStringExtend2() {
            return stringExtend2;
        }

        public void setStringExtend2(String stringExtend2) {
            this.stringExtend2 = stringExtend2;
        }

        public double getMoneyExtend1() {
            return moneyExtend1;
        }

        public void setMoneyExtend1(double moneyExtend1) {
            this.moneyExtend1 = moneyExtend1;
        }

        public double getMoneyExtend2() {
            return moneyExtend2;
        }

        public void setMoneyExtend2(double moneyExtend2) {
            this.moneyExtend2 = moneyExtend2;
        }

        public int getActivityType() {
            return activityType;
        }

        public void setActivityType(int activityType) {
            this.activityType = activityType;
        }

        public double getLongExtend1() {
            return longExtend1;
        }

        public void setLongExtend1(double longExtend1) {
            this.longExtend1 = longExtend1;
        }

        public double getLongExtend2() {
            return longExtend2;
        }

        public void setLongExtend2(double longExtend2) {
            this.longExtend2 = longExtend2;
        }

        public String getStateExtend1() {
            return stateExtend1;
        }

        public void setStateExtend1(String stateExtend1) {
            this.stateExtend1 = stateExtend1;
        }

        public String getStateExtend2() {
            return stateExtend2;
        }

        public void setStateExtend2(String stateExtend2) {
            this.stateExtend2 = stateExtend2;
        }

        public double getDoubleExtend1() {
            return doubleExtend1;
        }

        public void setDoubleExtend1(double doubleExtend1) {
            this.doubleExtend1 = doubleExtend1;
        }

        public double getDoubleExtend2() {
            return doubleExtend2;
        }

        public void setDoubleExtend2(double doubleExtend2) {
            this.doubleExtend2 = doubleExtend2;
        }
    }
}
