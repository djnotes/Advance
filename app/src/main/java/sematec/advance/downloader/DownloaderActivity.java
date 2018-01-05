package sematec.advance.downloader;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import sematec.advance.R;
import sematec.advance.utils.BaseActivity;

/**
 * Created by johndoe on 1/5/18.
 */

@EActivity(R.layout.activity_downloader)
public class DownloaderActivity extends BaseActivity{
    private DownloaderContract.Presenter presenter;

    @AfterViews
    void init() {
        presenter = new DownloaderPresenter();
        presenter.attachView(this);
        presenter.attachContext(mContext);
    }


}
