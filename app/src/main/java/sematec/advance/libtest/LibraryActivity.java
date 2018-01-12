package sematec.advance.libtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import sematec.advance.R;
import sematec.advance.utils.BaseActivity;
import sematec.advance.utils.PublicMethods;
import sematec.mehdi.advancedlibrary.Al;

@EActivity(R.layout.activity_library)
public class LibraryActivity extends BaseActivity {

    @AfterViews
    void init() {
        PublicMethods.showToast(mContext, Al.getName());
    }
}
