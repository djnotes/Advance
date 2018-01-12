import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by johndoe on 1/12/18.
 */

public class BaseApplication extends Application {
    public static Typeface mTypeFace;

    @Override
    public void onCreate() {
        super.onCreate();
        mTypeFace = Typeface.createFromAsset(getAssets(), "fonts/myfont.ttf");
    }
}
