package newapp.koteswara.com.newapp.remote;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import newapp.koteswara.com.newapp.model.Releases;

class Releaseslist {

    public ArrayList<Releases> getReleases() {
        return releases;
    }

    public void setReleases(ArrayList<Releases> releases) {
        this.releases = releases;
    }

    @SerializedName("data")
    @Expose
    ArrayList<Releases> releases=new ArrayList<>();
}
