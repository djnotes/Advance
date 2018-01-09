package sematec.advance.downloader;

import android.content.Context;

/**
 * Created by johndoe on 1/5/18.
 */

public interface DownloaderContract {
    public interface  Presenter {
        void attachContext(Context mContext);

        public void attachView(DownloaderActivity downloaderActivity);
        public void download(String url);
    }
}
