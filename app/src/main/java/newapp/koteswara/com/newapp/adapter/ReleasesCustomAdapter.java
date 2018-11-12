package newapp.koteswara.com.newapp.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import newapp.koteswara.com.newapp.R;
import newapp.koteswara.com.newapp.databinding.ReleasesBinding;
import newapp.koteswara.com.newapp.viewmodel.ReleasesViewModel;

public class ReleasesCustomAdapter extends RecyclerView.Adapter<ReleasesCustomAdapter.ReleaseCustomView>{

    ArrayList<ReleasesViewModel>releasesViewModels;
    Context context;
    LayoutInflater inflater;
    public ReleasesCustomAdapter(Context context, ArrayList<ReleasesViewModel>releasesViewModels){

        this.context=context;
        this.releasesViewModels=releasesViewModels;
    }
    @NonNull
    @Override
    public ReleaseCustomView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        if (inflater==null){
            inflater=LayoutInflater.from(parent.getContext());
        }
        ReleasesBinding releasesBinding=DataBindingUtil.inflate(inflater,R.layout.innerlayout,parent,false);
        return new ReleaseCustomView(releasesBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ReleaseCustomView holder, int position) {

        ReleasesViewModel releasesViewModel=releasesViewModels.get(position);
        holder.bind(releasesViewModel);
    }

    @Override
    public int getItemCount() {
        return releasesViewModels.size();
    }

    class ReleaseCustomView extends RecyclerView.ViewHolder {
        ReleasesBinding releasesBinding;
        public ReleaseCustomView(ReleasesBinding releasesBinding) {
            super(releasesBinding.getRoot());
            this.releasesBinding=releasesBinding;
        }
        public void bind(ReleasesViewModel releasesViewModel){

            this.releasesBinding.setReleasesmodel(releasesViewModel);
            releasesBinding.executePendingBindings();
        }
        public ReleasesBinding getReleasesBinding(){
            return releasesBinding;
        }
    }

}
