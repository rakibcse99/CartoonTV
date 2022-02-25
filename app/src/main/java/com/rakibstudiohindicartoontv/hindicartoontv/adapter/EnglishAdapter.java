package com.rakibstudiohindicartoontv.hindicartoontv.adapter;

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

import com.bumptech.glide.Glide;
import com.rakibstudiohindicartoontv.hindicartoontv.EnglishCartoon;
import com.rakibstudiohindicartoontv.hindicartoontv.R;
import com.rakibstudiohindicartoontv.hindicartoontv.VideoPlayer;
import com.rakibstudiohindicartoontv.hindicartoontv.model.StaticVideoClass;


import java.util.List;

public class EnglishAdapter extends RecyclerView.Adapter <EnglishAdapter.ImageViewHolder>{
    private Context mcontext;
    private List<StaticVideoClass> mUpload;


    public EnglishAdapter(Context mcontext, List<StaticVideoClass> mUpload) {
        this.mcontext = mcontext;
        this.mUpload = mUpload;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.video_itemrow, parent, false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, int position) {
        final StaticVideoClass cureentUpload=mUpload.get(position);








//        holder.catagory.setText(cureentUpload.getCatagory());


    holder.title.setText(cureentUpload.getVideoTitle());
//    holder.time.setText(cureentUpload.getTime());

//    Picasso.get().load(cureentUpload.getImageUrl()).fit().centerCrop().into(holder.imageView);

        Glide.with(holder.itemView)
                .load(cureentUpload.getImageUrl())
                .fitCenter()
                .into(holder.imageView);





//holder.imageView.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        final String image =cureentUpload.getImageUrl()+"";
//        Toast.makeText(mcontext, image, Toast.LENGTH_LONG).show();
//    }
//});


holder.itemView.setOnClickListener(new View.OnClickListener() {




    @Override
    public void onClick(View v) {


        final String videoID =cureentUpload.getVideoID();
        final String title =cureentUpload.getVideoTitle();
        final String catagory =cureentUpload.getCatagory();
//        final String image =cureentUpload.getImageUrl()+"";
        final int image =cureentUpload.getImageUrl();


        Intent intent=new Intent(mcontext, EnglishCartoon.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("videoID",videoID);
        intent.putExtra("title",title);
        intent.putExtra("catagory",catagory);
        intent.putExtra("intVariableName",image);




        mcontext.startActivity(intent);

//        StartAppAd.showAd(mcontext);






    }
});









    }


    @Override
    public int getItemCount() {
        return mUpload.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {

        public TextView title;

        public ImageView imageView;
      private   ProgressBar loadProgress;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
           // loadProgress = itemView.findViewById(R.id.progressBar);
            title=itemView.findViewById(R.id.titlefirebase);
//            time=itemView.findViewById(R.id.timefirebase);
//           serial=itemView.findViewById(R.id.timefirebase);

            imageView=itemView.findViewById(R.id.imagevideo);




        }
    }







    }

