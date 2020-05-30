package com.regenswersali.photogallery.base.utils.data;

import android.net.Uri;

import com.google.gson.annotations.SerializedName;

public class GalleryItem {
    @SerializedName("title")
    private String mTitle;
    @SerializedName("id")
    private String mId;
    @SerializedName("url_s")
    private String mUrl_s;
    @SerializedName("owner")
    private String mOwner;

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

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public Uri getPhotoPageUri() {
        return Uri.parse("http://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }
}
