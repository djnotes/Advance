package sematec.advance.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import sematec.advance.R;
import sematec.advance.utils.BaseActivity;
@EActivity(R.layout.activity_login)
public class LoginActivity extends BaseActivity {
    @ViewById
    EditText userName;

    @ViewById
    EditText password;

    @ViewById
    EditText mobile;
    private LoginContract.Presenter presenter;

    @AfterViews
    void init() {
        presenter = new LoginPresenter();
    }
}


