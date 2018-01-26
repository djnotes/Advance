package sematec.advance.transition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebStorage;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import sematec.advance.R;
import sematec.advance.utils.BaseActivity;

//TODO: Jan 26 2018 Session 6 Part 1: , Making a transition
//todo: Library RX binding, adds subscription to typical views
//TODO: RxView.clicks(search).subscribe(aVoid -> showToast());
//TODO: Proguard used to obfuscate code. proguard-rules.pro


@EActivity(R.layout.activity_origin)
public class OriginActivity extends BaseActivity {

    @ViewById
    Button rxBtn;




    @ViewById
    ImageView image;

    @Click(R.id.image)
    void send() {

    }

    @AfterViews
    void init() {
        rxBtn.setOnClickListener(v-> Toast.makeText(mContext, "Search", Toast.LENGTH_SHORT).show());
    }

}
