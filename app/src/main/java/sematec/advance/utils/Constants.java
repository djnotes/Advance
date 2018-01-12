package sematec.advance.utils;

import com.loopj.android.http.LogInterface;

import sematec.advance.webmodels.LocalInterface;

/**
 * Created by amirhossein on 12/29/17.
 */

public class Constants {

    public static String BASE_URL = "http://www.omdbapi.com" ;
    public static String BASE_API_URL = "196.168.1.100/api/index.php" ;


    public static String OMDB_ApiKey = "70ad462a" ;
    public static WebServiceInterface webInterface = RetrofitGenerator.create(WebServiceInterface.class);
    public static LocalInterface localInterface = RetrofitGenerator.create(LocalInterface.class);
    
}
