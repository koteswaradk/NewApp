package newapp.koteswara.com.newapp.remote;

import android.arch.lifecycle.MutableLiveData;

import java.util.ArrayList;

import newapp.koteswara.com.newapp.viewmodel.ReleasesViewModel;

public class ReleaseRepo {

    public MutableLiveData<ArrayList<ReleasesViewModel>> arrayListMutableLiveData=new MutableLiveData<>();
    public ReleaseRepo(){

    }
}
