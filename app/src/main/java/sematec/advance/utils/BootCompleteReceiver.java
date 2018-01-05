package sematec.advance.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import sematec.advance.DownloaderService;

/**
 * Created by johndoe on 1/5/18.
 */

public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //We want to restart service on boot
        Intent dlIntent = new Intent(context, DownloaderService.class);

    }
}
