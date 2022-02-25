package com.rakibstudiohindicartoontv.hindicartoontv.model;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rakibstudiohindicartoontv.hindicartoontv.R;
import com.rakibstudiohindicartoontv.hindicartoontv.VideoPlayer;
import com.smarteist.autoimageslider.SliderViewAdapter;


import java.util.ArrayList;
import java.util.List;

public class SliderAdapterExample extends
        SliderViewAdapter<SliderAdapterExample.SliderAdapterVH> {

    private Context context;
    private List<SliderItem> mSliderItems = new ArrayList<>();

    public SliderAdapterExample(Context context) {
        this.context = context;
    }

    public void renewItems(List<SliderItem> sliderItems) {
        this.mSliderItems = sliderItems;
        notifyDataSetChanged();
    }

    public void deleteItem(int position) {
        this.mSliderItems.remove(position);
        notifyDataSetChanged();
    }

    public void addItem(SliderItem sliderItem) {
        this.mSliderItems.add(sliderItem);
        notifyDataSetChanged();
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, final int position) {

        SliderItem sliderItem = mSliderItems.get(position);
       viewHolder.textViewDescription.setText(sliderItem.getDescription());



        Glide.with(viewHolder.itemView)
                .load(sliderItem.getImageUrl())
               .fitCenter().placeholder(R.drawable.bangla8)



                .into(viewHolder.imageViewBackground);







        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {





            @Override
            public void onClick(View v) {
//                StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);
//
////                    StartAppSDK.init(context, "211348097", false);
//                StartAppAd.showAd(context);
//
                if (position==0){


                    final String videoID ="HrYkdS8L7lA";
                    final String title ="JADUR JHOLA /- THAKURMAR JHULI | Comedy Story";
                    final String catagory ="kids favorite Show";


                    Intent intent=new Intent(context, VideoPlayer.class);
                    intent.putExtra("videoID",videoID);
                    intent.putExtra("discription",title);
                    intent.putExtra("title",catagory);


                }else {

                    SliderItem sliderItem = mSliderItems.get(position);

                    final String videoID =sliderItem.getId();
                    final String title =sliderItem.getDescription();
                    final String catagory ="kids favorite Show";


                    Intent intent=new Intent(context, VideoPlayer.class);
                    intent.putExtra("videoID",videoID);
                    intent.putExtra("discription",title);
                    intent.putExtra("title",catagory);
//                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                    StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);

//                    StartAppSDK.init(context, "211348097", false);

                    context.startActivity(intent);

                }



            }
        });


        viewHolder.bt.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {
                if (position==0){


//                    SliderItem sliderItem = mSliderItems.get(position);

                    final String videoID ="HrYkdS8L7lA";
                    final String title ="JADUR JHOLA /- THAKURMAR JHULI | Comedy Story";
                    final String catagory ="kids favorite Show";


                    Intent intent=new Intent(context, VideoPlayer.class);
                    intent.putExtra("videoID",videoID);
                    intent.putExtra("discription",title);
                    intent.putExtra("title",catagory);

//                    StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);

//                    StartAppSDK.init(context, "211348097", false);
//                    StartAppAd.showAd(context);


                }else {

                    SliderItem sliderItem = mSliderItems.get(position);

                    final String videoID =sliderItem.getId();
                    final String title =sliderItem.getDescription();
                    final String catagory ="kids favorite Show";


                    Intent intent=new Intent(context, VideoPlayer.class);
                    intent.putExtra("videoID",videoID);
                    intent.putExtra("discription",title);
                    intent.putExtra("title",catagory);
//                    StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);

//                    StartAppSDK.init(context, "211348097", false);

                    context.startActivity(intent);




                }



            }
        });

    }

    @Override
    public int getCount() {

        return mSliderItems.size();
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder  {

        View itemView;
        ImageView imageViewBackground;
        ImageView imageGifContainer;
        ImageButton bt;
     TextView textViewDescription;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            bt = itemView.findViewById(R.id.btt);
            textViewDescription = itemView.findViewById(R.id.slidertext);
            this.itemView = itemView;
        }
    }

}
