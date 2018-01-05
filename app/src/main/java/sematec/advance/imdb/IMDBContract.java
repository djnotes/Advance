package sematec.advance.imdb;

import sematec.advance.utils.webmodels.WebIMDBModel;

/**
 * Created by amirhossein on 12/29/17.
 */

public interface IMDBContract {

    interface View {
        void onSearchResult(WebIMDBModel model);

        void onWebServiceError();

        void showHideLoading(Boolean show);
    }

    interface Presenter {
        void attachView(View view);

        void search(String word);

        void onSearchResult(WebIMDBModel model);

        void onWebServiceError();
    }
}
