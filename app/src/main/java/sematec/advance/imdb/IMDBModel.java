package sematec.advance.imdb;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sematec.advance.utils.Constants;
import sematec.advance.utils.webmodels.WebIMDBModel;

/**
 * Created by amirhossein on 12/29/17.
 */

public class IMDBModel {
    IMDBContract.Presenter presenter;

    public IMDBModel(IMDBContract.Presenter presenter) {
        this.presenter = presenter;
    }


    public void getWordDetail(String word) {
//        try{
//            WebIMDBModel model  = Constants.webInterface.searchWord(word , Constants.OMDB_ApiKey ).execute().body() ;
//        }catch (Exception e){
//
//        }

        Constants.webInterface.searchWord(word, Constants.OMDB_ApiKey).
                subscribeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onResponse, this::onError, this::onComplete);
//                .enqueue(new Callback<WebIMDBModel>() {
//                    @Override
//                    public void onResponse(Call<WebIMDBModel> call, Response<WebIMDBModel> response) {
//                        presenter.onSearchResult(response.body());
//                    }
//
//                    @Override
//                    public void onFailure(Call<WebIMDBModel> call, Throwable t) {
//                        presenter.onWebServiceError();
//                    }
//                });
//        Constants.webInterface.createUser()
    }

    private void onComplete() {
    }

    private void onError(Throwable throwable) {
    }

    private void onResponse(WebIMDBModel webIMDBModel) {
        presenter.onSearchResult(webIMDBModel);
    }
}
