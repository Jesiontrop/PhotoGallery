package com.regenswersali.photogallery.feature.search;

import androidx.fragment.app.Fragment;

import com.regenswersali.photogallery.feature.search.PhotoGalleryFragment;
import com.regenswersali.photogallery.base.core_ui.SingleFragmentActivity;

public class PhotoGalleryActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
