package sematec.advance.downloader;

import android.content.Context;
import android.content.Intent;

import sematec.advance.DownloaderService;

/**
 * Created by johndoe on 1/5/18.
 */

public class DownloaderModel {
    DownloaderContract.Presenter presenter;

    public DownloaderModel(DownloaderContract.Presenter presenter) {
        this.presenter = presenter;
    }

    public void download(Context context, String url) {
        Intent intent = new Intent(context, DownloaderService.class);
        intent.putExtra("URL",  url);
        context.startService(intent);

    }
}
