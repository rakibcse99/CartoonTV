package com.rakibstudiohindicartoontv.hindicartoontv.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.rakibstudiohindicartoontv.hindicartoontv.R;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.CetagoryAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.databinding.FragmentSlideshowBinding;
import com.rakibstudiohindicartoontv.hindicartoontv.model.ImageClass;

import java.util.ArrayList;
import java.util.List;

public class Catagory extends Fragment {

    private RecyclerView recyclerView;


    List<ImageClass> imagePojoArrayList;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView=root.findViewById(R.id.imageRecycler);

        gridLIst();


        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm=new GridLayoutManager(getContext(),3);
        CetagoryAdapter imageRVA=new CetagoryAdapter(getContext(),imagePojoArrayList);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(imageRVA);




        return root;
    }


    private void gridLIst() {
        imagePojoArrayList=new ArrayList<>();
        imagePojoArrayList.add(new ImageClass(R.drawable.hindi8,"Hindi Stories"));
        imagePojoArrayList.add(new ImageClass(R.drawable.bhatija5,"Chacha Bhatija"));
        imagePojoArrayList.add(new ImageClass(R.drawable.oggy5,"Oggy"));
        imagePojoArrayList.add(new ImageClass(R.drawable.larva4,"Larva Funny"));
        imagePojoArrayList.add(new ImageClass(R.drawable.bangla4,"Bangla Cartoon"));
        imagePojoArrayList.add(new ImageClass(R.drawable.jan5,"Jan Cartoon "));
        imagePojoArrayList.add(new ImageClass(R.drawable.doraemon4,"Doreamon"));
//7
        imagePojoArrayList.add(new ImageClass(R.drawable.pinl5,"pink Panther"));
        imagePojoArrayList.add(new ImageClass(R.drawable.simba3,"Simba The Lion King"));
        imagePojoArrayList.add(new ImageClass(R.drawable.beam5,"Mr, Beam Animation"));
        imagePojoArrayList.add(new ImageClass(R.drawable.creck4,"Cracke Clamstrap"));
        imagePojoArrayList.add(new ImageClass(R.drawable.looney2,"Looney Touns"));
        imagePojoArrayList.add(new ImageClass(R.drawable.mickey8,"Mickey Mouse"));
        imagePojoArrayList.add(new ImageClass(R.drawable.chhota5,"Chotta Bheem"));
        imagePojoArrayList.add(new ImageClass(R.drawable.book7,"Jungle Book"));
        imagePojoArrayList.add(new ImageClass(R.drawable.vir5,"Vir The Roobt  Boy"));
//16
        imagePojoArrayList.add(new ImageClass(R.drawable.ben3,"Ben 10 "));
        imagePojoArrayList.add(new ImageClass(R.drawable.pokemon5,"pokemon"));


        imagePojoArrayList.add(new ImageClass(R.drawable.moral6,"Hindi Moral Stories"));
        imagePojoArrayList.add(new ImageClass(R.drawable.kisna,"Roll Number 21"));

        imagePojoArrayList.add(new ImageClass(R.drawable.motuhindi4,"Motu Patlu"));
        imagePojoArrayList.add(new ImageClass(R.drawable.masha5,"Masha And Bhear"));
        imagePojoArrayList.add(new ImageClass(R.drawable.oscar3,"Oscar Funny Video"));
        imagePojoArrayList.add(new ImageClass(R.drawable.virbangla3,"Vir Bangla"));
        imagePojoArrayList.add(new ImageClass(R.drawable.tom6,"Tom And Jerry"));
        imagePojoArrayList.add(new ImageClass(R.drawable.baludablu,"Bablu Dablu"));
        imagePojoArrayList.add(new ImageClass(R.drawable.little5,"Little Bheem"));
       //all Active
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}