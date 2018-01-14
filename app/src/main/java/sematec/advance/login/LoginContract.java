package sematec.advance.login;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Created by johndoe on 1/12/18.
 */

public interface LoginContract {
    interface Presenter {
        void attachContext(Context context);
        void onUserLogin(@NonNull String email, @NonNull String password);
        void onUserRegister(@NonNull String email, @NonNull String password);
        void onRegisterSuccess();
        void onRegisterWrong();

        void onLoginSuccess();
        void onLoginFailed();

        void attachView(LoginActivity loginActivity);
    }
    interface View {

    }

}
