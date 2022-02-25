package com.rakibstudiohindicartoontv.hindicartoontv.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.bumptech.glide.Glide;
import com.rakibstudiohindicartoontv.hindicartoontv.BanglaCartoon;
import com.rakibstudiohindicartoontv.hindicartoontv.HindiBestActivity;
import com.rakibstudiohindicartoontv.hindicartoontv.R;
import com.rakibstudiohindicartoontv.hindicartoontv.apiModel.Item;


import java.util.List;


public class VideoAdapterplaylistHB extends RecyclerView.Adapter<VideoAdapterplaylistHB.videodetalsViewHolder> {
    private Context context;
    private List<Item> videoDetailsClassList;
    private String convert_date;


    public VideoAdapterplaylistHB(Context context, List<Item> videoDetailsClassList) {
        this.context = context;
        this.videoDetailsClassList = videoDetailsClassList;

    }


    @NonNull
    @Override
    public videodetalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_rownew, parent, false);
     //   view.setOnClickListener(listener,);
        return new videodetalsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final videodetalsViewHolder holder, @SuppressLint("RecyclerView") final int position) {



    //   holder.textViewDate.setText( setUpDateTime(videoDetailsClassList.get(position).getSnippet().getPublishedAt()));


if (videoDetailsClassList.get(position).getSnippet().getThumbnails().getMedium() ==null){
  holder.loadProgress.setVisibility(View.GONE);
    holder.textViewDescrip.setText("loding problem");
    holder.catagory.setText("loding problem");
//    holder.textViewTitle.setText("sdfaa");
//    Picasso.get().load(R.drawable.ic_menu_gallery).placeholder(R.drawable.ic_menu_gallery).into(holder.ImageThumb);
    Glide.with(holder.itemView)
            .load(R.mipmap.icone)
            .placeholder(R.mipmap.icone)
            .fitCenter()
            .into(holder.ImageThumb);


}else {
    holder.loadProgress.setVisibility(View.VISIBLE);

    holder.textViewDescrip.setText(videoDetailsClassList.get(position).getSnippet().getTitle());
    holder.catagory.setText(videoDetailsClassList.get(position).getSnippet().getChannelTitle());

    Glide.with(holder.itemView)
            .load(videoDetailsClassList.get(position).getSnippet().getThumbnails()
                    .getMedium().getUrl())
            .fitCenter()
            .into(holder.ImageThumb);


    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Item item=new Item();

            Intent intent=new Intent(context, HindiBestActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("videoID",videoDetailsClassList.get(position).getSnippet().getResourceId().getVideoId());
            intent.putExtra("title",videoDetailsClassList.get(position).getSnippet().getTitle());
            intent.putExtra("catagory",videoDetailsClassList.get(position).getSnippet().getChannelTitle());
            intent.putExtra("image",videoDetailsClassList.get(position).getSnippet().getThumbnails()
                    .getMedium().getUrl());
            //  intent.putExtra("id",item);


            context.startActivity(intent);

//            StartAppAd.showAd(context);
        }

    });


}









    }



    @Override
    public int getItemCount() {
        if (this.videoDetailsClassList!=null){
            return videoDetailsClassList.size();
        }

        else
            return 0;
    }


    public static class videodetalsViewHolder extends ViewHolder {
        TextView textViewTitle,catagory;
        TextView textViewDescrip;
        TextView textViewDate;
        ImageView ImageThumb;
        ProgressBar loadProgress;

        public videodetalsViewHolder(@NonNull View itemView) {
            super(itemView);
            loadProgress = itemView.findViewById(R.id.progressBar1);
//            textViewTitle = (TextView) itemView.findViewById(R.id.Title);
            textViewDescrip = (TextView) itemView.findViewById(R.id.description);
//            textViewDate = (TextView) itemView.findViewById(R.id.date);
            ImageThumb = (ImageView) itemView.findViewById(R.id.thumbrail);
            catagory=(TextView)itemView.findViewById(R.id.catagory);


        }


    }

    public void removeAt(int position) {
        videoDetailsClassList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, videoDetailsClassList.size());
    }


}
