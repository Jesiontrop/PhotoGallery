package com.regenswersali.photogallery.feature.search;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.regenswersali.photogallery.feature.search.PhotoGalleryFragment;
import com.regenswersali.photogallery.base.core_ui.SingleFragmentActivity;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, PhotoGalleryActivity.class);
    }

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
