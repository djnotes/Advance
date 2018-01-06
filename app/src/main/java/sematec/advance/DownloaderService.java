package sematec.advance;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.FileAsyncHttpResponseHandler;

import java.io.File;

import cz.msebera.android.httpclient.Header;

/**
 * Created by johndoe on 1/5/18.
 */

public class DownloaderService extends Service {
    public final String LOG_TAG = DownloaderService.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    /*
    This method is run every time you call startService (IMPORTANT)
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String url = intent.getStringExtra("URL");
        download(url);
        Toast.makeText(this, "onStartCommand", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void download(String url) {
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new FileAsyncHttpResponseHandler(this) {
            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, File file) {
                Log.i(LOG_TAG, "failure");
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, File file) {
                Log.i(LOG_TAG, "Success");
            }

            @Override
            public void onProgress(long bytesWritten, long totalSize) {
                super.onProgress(bytesWritten, totalSize);
                int percentage = (int) (bytesWritten * 100.0 / totalSize + 0.5);
                Log.d(LOG_TAG, "downloading");


            }
        });
    }
}
