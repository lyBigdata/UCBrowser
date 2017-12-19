package com.zibuyuqing.ucbrowser.model.bean.favorite;

import android.graphics.Bitmap;

/**
 * Created by Xijun.Wang on 2017/12/19.
 */

public class ItemInfo {
    protected Bitmap icon;
    protected String description;
    protected String url;
    protected int cellX;
    protected int cellY;

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCellX() {
        return cellX;
    }

    public void setCellX(int cellX) {
        this.cellX = cellX;
    }

    public int getCellY() {
        return cellY;
    }

    public void setCellY(int cellY) {
        this.cellY = cellY;
    }
}
