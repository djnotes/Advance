package sematec.advance.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.OptionsMenuItem;
import org.androidannotations.annotations.ViewById;

import sematec.advance.R;
import sematec.advance.downloader.DownloaderActivity;
import sematec.advance.downloader.DownloaderActivity_;
import sematec.advance.utils.BaseActivity;
import sematec.advance.utils.PublicMethods;

@EActivity(R.layout.activity_profile)
@OptionsMenu(R.menu.menu)
public class ProfileActivity extends BaseActivity implements ProfileContract.View {

    ProfileContract.Presenter presenter;


    @ViewById
    EditText user_id ;
    @ViewById
    TextView result ;

    @AfterViews
    void init() {
        presenter = new ProfilePresenter();
        presenter.attachView(this);
    }

@OptionsMenuItem
void downloader(MenuItem downloader) {
        Intent intent = new Intent(this, DownloaderActivity_.class);
        startActivity(intent);
}




    @Override
    public void showWelcome(String msg) {
        PublicMethods.showToast(mContext, msg);
    }

    @Override
    public void showUserName(String username) {
        result.setText(username);
    }

    @Click
    void show_user(){
        presenter.OnShowUserSelect(user_id.getText().toString());
    }


}
