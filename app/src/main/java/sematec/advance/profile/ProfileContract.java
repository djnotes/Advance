package sematec.advance.profile;

/**
 * Created by amirhossein on 12/29/17.
 */

public interface ProfileContract {

    interface View {
        void showWelcome(String msg) ;
        void showUserName(String username) ;
    }

    interface Presenter {
        void attachView(View view) ;
        void OnShowUserSelect(String userID) ;
        void onProfileFetched(String username) ;
    }

}
