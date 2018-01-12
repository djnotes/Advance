package sematec.advance.login;

import android.content.Context;

/**
 * Created by johndoe on 1/12/18.
 */

public interface LoginContract {
    interface Presenter {
        void attachContext(Context context);
        void register(String username, String password, String mobile);
        void onRegisterSuccess();
        void onRegisterWrong();

        void onLoginSuccess();
        void onLoginFailed();

    }
    interface View {

    }

}
