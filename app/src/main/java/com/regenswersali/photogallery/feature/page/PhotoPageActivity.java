package com.regenswersali.photogallery.feature.page;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.fragment.app.Fragment;

import com.regenswersali.photogallery.base.core_ui.SingleFragmentActivity;
import com.regenswersali.photogallery.base.repo.page.IOnBackPressed;


public class PhotoPageActivity extends SingleFragmentActivity {
    private static final String TAG = "PhotoPageActivity";
    private Fragment mFragment;

    public static Intent newIntent(Context context, Uri photoPageUri) {
        Intent i = new Intent(context, PhotoPageActivity.class);
        i.setData(photoPageUri);
        return i;
    }

    @Override
    protected Fragment createFragment() {
        mFragment = PhotoPageFragment.newInstance(getIntent().getData());
        return mFragment;
    }

    @Override
    public void onBackPressed() {

        if (!(mFragment instanceof IOnBackPressed) || !((IOnBackPressed) mFragment).onBackPressed()){
            super.onBackPressed();
        }
    }
}
