package sematec.mehdi.advancedlibrary;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by johndoe on 1/12/18.
 */

public class Al {
    public static String getName() {
        return "Sematec Advanced";
    }

    public static void loadImage(Context context,String url, ImageView imageView) {
        Glide.with(context).load(url).into(imageView);
    }
}
