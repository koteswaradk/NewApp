package newapp.koteswara.com.newapp.remote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("https://jdiregression.juniper.net/reg_testbeds/active_release.php")
    Call<Releaseslist> getReleasesList();
}
