package com.regenswersali.photogallery.Activity;

import androidx.fragment.app.Fragment;

import com.regenswersali.photogallery.Fragment.PhotoGalleryFragment;

public class PhotoGalleryActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
