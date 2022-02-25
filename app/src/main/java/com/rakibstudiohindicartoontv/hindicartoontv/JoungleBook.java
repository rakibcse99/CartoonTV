package com.rakibstudiohindicartoontv.hindicartoontv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.rakibstudiohindicartoontv.hindicartoontv.Retrifit.RetrofitCached;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.VideoAdapterplaylist;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.VideoAdapterplaylistH;
import com.rakibstudiohindicartoontv.hindicartoontv.apiModel.GetDataService;
import com.rakibstudiohindicartoontv.hindicartoontv.apiModel.Item;
import com.rakibstudiohindicartoontv.hindicartoontv.apiModel.Playitemlist;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class JoungleBook extends Fragment {

    private RecyclerView recyclerView;
    private Apiclass api;
    private VideoAdapterplaylistH videoAdapter;
    private ProgressBar progress;

    public JoungleBook() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View root=inflater.inflate(R.layout.fragment_joungle_book, container, false);

        progress=root.findViewById(R.id.jungleprogress);
        recyclerView =root.findViewById(R.id.junglefg);
        return root;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GetDataService dataService = RetrofitCached.getCacheEnabledRetrofit(requireContext()).create(GetDataService.class);

        Call<Playitemlist> videoDetailsRequset =
                (Call<Playitemlist>) dataService.getVideoPlaylist("snippet",api.junglebook , "50",
                        api.playerApiKey);



        videoDetailsRequset.enqueue(new Callback<Playitemlist>() {
            @Override
            public void onResponse(@NonNull Call<Playitemlist> call, @NonNull Response<Playitemlist> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {

//                         progressDoalog.dismiss();
                        progress.setVisibility(View.GONE);
//                        Log.e(TAG, "Requset Susccesful");
//                        Toast.makeText(getActivity(), "Loading plass ", Toast.LENGTH_LONG).show();
                        setUpRecyclerView(response.body().getItems());
                    }
                }

            }

            @Override
            public void onFailure(@NonNull Call<Playitemlist> call, @NonNull Throwable t) {

//                Log.e(TAG.concat("API REQUST"), t.getMessage());
//                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_LONG).show();
//                Toast.makeText(requireActivity(),"Poor Internet Connection", Toast.LENGTH_LONG).show();

            }
        });

    }
    private void setUpRecyclerView(List<Item> items) {
        videoAdapter = new VideoAdapterplaylistH(getContext(),items);
        RecyclerView.LayoutManager llm = new LinearLayoutManager(getContext());
        recyclerView.setItemViewCacheSize(50);
        recyclerView.setHasFixedSize(true);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setLayoutManager(llm);

        recyclerView.setAdapter(videoAdapter);


    }
}