package com.xy.android.photogallery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;

/**
 * Created by yang on 18-1-4.
 */

public class PhotoPageActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context,Uri photoPageUri){
        Intent i = new Intent(context,PhotoPageActivity.class);
        i.setData(photoPageUri);
        return i;
    }

    @Override
    protected Fragment creatFragment() {
        return PhotoPageFragment.newInstance(getIntent().getData());
    }
}
