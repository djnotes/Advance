package sematec.advance.login;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Created by johndoe on 1/12/18.
 */

class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View  mView; //Presenter has a view instance
    private LoginModel mLoginModel; //Presenter has a model too

    @Override
    public void onRegisterSuccess() {

    }

    @Override
    public void onRegisterWrong() {

    }

    @Override
    public void onLoginSuccess() {

    }

    @Override
    public void onLoginFailed() {

    }

    @Override
    public void attachView(LoginActivity activity) {
        mView = activity;
    }

    @Override
    public void attachContext(Context context) {

    }

    @Override
    public void onUserLogin(@NonNull String email, @NonNull String password) {

    }

    @Override
    public void onUserRegister(@NonNull String email, @NonNull String password) {
        mLoginModel.onRegister(email, password);
    }

}
