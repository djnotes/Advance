package sematec.advance.utils;

/**
 * Created by amirhossein on 12/29/17.
 */

public class Constants {

    public static String BASE_URL = "http://www.omdbapi.com" ;

    public static String OMDB_ApiKey = "70ad462a" ;
    public static WebServiceInterface webInterface = RetrofitGenerator.create(WebServiceInterface.class);
}
