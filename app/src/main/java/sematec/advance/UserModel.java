package sematec.advance;

import sematec.advance.profile.ProfileContract;

/**
 * Created by amirhossein on 12/29/17.
 */

public class UserModel {

    public static String wm = "Hi how are you!" ;


    ProfileContract.Presenter presenter ;

    public UserModel(ProfileContract.Presenter presenter) {
        this.presenter = presenter;
    }

    public void getUserModel(String userID){
        String result ="";
        if(userID.equalsIgnoreCase("1"))
            result = "Amirhosein" ;
        else if (userID.equalsIgnoreCase("2"))
            result = "Mohammad" ;
        presenter.onProfileFetched(result);
    }

}
