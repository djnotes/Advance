package sematec.advance.login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by johndoe on 1/12/18.
 */

public class LoginModel {
    LoginContract.Presenter presenter;

    public LoginModel() {
        this.presenter = presenter;
    }


    public void onRegister(String email, String password) {
        //Call service here

    }
}
