package com.regenswersali.photogallery;

import android.graphics.Bitmap;
import android.util.LruCache;

public class IconCache extends LruCache<String, Bitmap> {
    public IconCache(int maxSize) {
        super(maxSize);
    }

    public Bitmap getBitmapFromMemory(String key) {
        return this.get(key);
    }

    public void setBitmapToMemory(String key, Bitmap bitmap) {
        if (getBitmapFromMemory(key) == null) {
            this.put(key, bitmap);
        }
    }
}
