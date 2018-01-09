package sematec.advance.downloader;

import android.widget.EditText;
import android.widget.ProgressBar;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import sematec.advance.R;
import sematec.advance.utils.BaseActivity;
import sematec.advance.utils.DownloadEntity;

/**
 * Created by johndoe on 1/5/18.
 */

@EActivity(R.layout.activity_downloader)
public class DownloaderActivity extends BaseActivity{
    private DownloaderContract.Presenter mPresenter;

    @ViewById
    EditText url;

    @ViewById
    ProgressBar progressBar;

    @AfterViews
    void init() {
        mPresenter = new DownloaderPresenter();
        mPresenter.attachView(this);
        mPresenter.attachContext(mContext);
    }

    @Click
    void download() {
        mPresenter.download(url.getText().toString());
    }

    @Subscribe
    public void onDownloading (DownloadEntity entity) {
        progressBar.setProgress(entity.getPercent());
    }

    @Override
    protected void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(mContext);
    }

    @Override
    protected void onResume() {
        super.onResume();
        EventBus.getDefault().register(mContext);
    }
}
