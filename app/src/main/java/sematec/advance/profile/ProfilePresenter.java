package sematec.advance.profile;

import sematec.advance.UserModel;

/**
 * Created by amirhossein on 12/29/17.
 */

public class ProfilePresenter implements ProfileContract.Presenter{


    private ProfileContract.View view;
    private UserModel model ;
    @Override
    public void attachView(ProfileContract.View view) {
        this.view = view;
        view.showWelcome(UserModel.wm);
        model = new UserModel(this) ;
    }

    @Override
    public void OnShowUserSelect(String userID) {
        model.getUserModel(userID);
    }

    @Override
    public void onProfileFetched(String username) {
        view.showUserName(username);
    }


}
