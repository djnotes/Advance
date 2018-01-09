package sematec.advance.downloader;

import android.content.Context;
import android.content.Intent;

/**
 * Created by johndoe on 1/5/18.
 */

public class DownloaderPresenter implements DownloaderContract.Presenter {

    DownloaderModel model = new DownloaderModel(this);
    private Context mContext ;


    @Override
    public void attachContext(Context context) {
        mContext = context;
    }

    @Override
    public void attachView(DownloaderActivity downloaderActivity) {
    }

    @Override
    public void download(String url) {
        model.download(mContext, url);
    }
}
