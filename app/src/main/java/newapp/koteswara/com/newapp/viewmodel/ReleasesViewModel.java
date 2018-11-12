package newapp.koteswara.com.newapp.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;

import newapp.koteswara.com.newapp.model.Releases;

public class ReleasesViewModel extends ViewModel {
    public String release;
    public String overallpass;
    public String firstrunpass;
    public String blocker;
    MutableLiveData<ArrayList<ReleasesViewModel>>releasesViewModelsList=new MutableLiveData<>();
    public ReleasesViewModel(){

    }
    public ReleasesViewModel(Releases releases) {
        this.release=releases.rn;
        this.overallpass = releases.op;
        this.firstrunpass = releases.fr;
        this.blocker = releases.bl;
    }
     ArrayList<ReleasesViewModel> arraylist;

    public MutableLiveData<ArrayList<ReleasesViewModel>> getArrayListMutableLiveData() {
        arraylist=new ArrayList<>();
        Releases releases=new Releases("18.4-THR-FULL","81","61","8");
        ReleasesViewModel releasesViewModel=new ReleasesViewModel(releases);
        arraylist.add(releasesViewModel);
        releasesViewModelsList.setValue(arraylist);

        return releasesViewModelsList;
    }

}
