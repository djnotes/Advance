package sematec.advance.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import sematec.advance.R;
import sematec.advance.profile.ProfileActivity_;
import sematec.advance.utils.BaseActivity;
@EActivity(R.layout.activity_login)
public class LoginActivity extends BaseActivity implements LoginContract.View {
    LoginContract.Presenter mPresenter;

    @AfterViews
    void init() {
        mPresenter = new LoginPresenter();
        mPresenter.attachView(this);

    }

    @ViewById
    EditText userName;

    @ViewById
    EditText password;

    @ViewById
    EditText mobile;

    @ViewById
    Button skip;

    @Click
    void register() {

    }

    @Click
    void skip() {
        Intent intent = new Intent(this, ProfileActivity_.class);
        startActivity(intent);
    }




}


