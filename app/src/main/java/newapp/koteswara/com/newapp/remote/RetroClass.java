package newapp.koteswara.com.newapp.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClass {
    private static final String BASE_URL="https://jdiregression.juniper.net/reg_testbeds/active_release.php";
    private static Retrofit getretroInstance(){

        Gson gson= new GsonBuilder().setLenient().create();
        return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
    }
    public static ApiService getAPIService(){
        return getretroInstance().create(ApiService.class);
    }
}
