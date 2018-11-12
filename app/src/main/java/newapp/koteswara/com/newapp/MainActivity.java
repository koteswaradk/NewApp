package newapp.koteswara.com.newapp;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import newapp.koteswara.com.newapp.adapter.ReleasesCustomAdapter;
import newapp.koteswara.com.newapp.viewmodel.ReleasesViewModel;

public class MainActivity extends AppCompatActivity {

    ReleasesViewModel releasesViewModel;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        releasesViewModel=ViewModelProviders.of(MainActivity.this).get(ReleasesViewModel.class);

        releasesViewModel.getArrayListMutableLiveData().observe(this, new Observer<ArrayList<ReleasesViewModel>>() {
            @Override
            public void onChanged(@Nullable ArrayList<ReleasesViewModel> releasesViewModels) {
                ReleasesCustomAdapter adapter=new ReleasesCustomAdapter(MainActivity.this,releasesViewModels);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(adapter);

            }
        });
    }
}
