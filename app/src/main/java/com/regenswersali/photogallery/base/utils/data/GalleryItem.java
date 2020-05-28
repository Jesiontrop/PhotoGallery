package com.regenswersali.photogallery.base.utils.data;

import com.google.gson.annotations.SerializedName;

public class GalleryItem {
    @SerializedName("title")
    private String mTitle;
    @SerializedName("id")
    private String mId;
    @SerializedName("url_s")
    private String mUrl_s;

    @Override
    public String toString() {
        return mTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl_s() {
        return mUrl_s;
    }

    public void setUrl_s(String url_s) {
        mUrl_s = url_s;
    }
}
