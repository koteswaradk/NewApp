package newapp.koteswara.com.newapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Releases {
    @SerializedName("rn")
    @Expose
    public String rn;
    @SerializedName("op")
    @Expose
    public String op;
    @SerializedName("fr")
    @Expose
    public String fr;
    @SerializedName("bl")
    @Expose
    public String bl;

    public Releases(String release, String overallpass, String firstrunpass, String blocker) {
        this.rn = release;
        this.op = overallpass;
        this.fr = firstrunpass;
        this.bl = blocker;
    }


}
