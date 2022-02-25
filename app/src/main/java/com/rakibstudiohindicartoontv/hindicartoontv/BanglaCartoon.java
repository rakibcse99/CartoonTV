package com.rakibstudiohindicartoontv.hindicartoontv;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.BanglaAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.model.StaticVideoClass;

import java.util.ArrayList;
import java.util.List;

public class BanglaCartoon extends AppCompatActivity {
    private ImageButton imageButton, imageVbt;
    private TextView title, cotagory, sharebt;
    private RecyclerView recyclerView1,recyclerView2;


    private List<StaticVideoClass>video1;
    private List<StaticVideoClass>Videoclass25;

    String videoID;
    String catgoryid;
    String titleid;
    int imageid;
    String images=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_cartoon);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        checkConnectivity();
        // Get the Main relative layout of the entire activity
        RelativeLayout mainLayoutb = (RelativeLayout)findViewById(R.id.banglabanner);
// Define StartApp Banner
//        Banner startAppBanner = new Banner(this);
//        RelativeLayout.LayoutParams bannerParameters =
//                new RelativeLayout.LayoutParams(
//                        RelativeLayout.LayoutParams.WRAP_CONTENT,
//                        RelativeLayout.LayoutParams.WRAP_CONTENT);
//        bannerParameters.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        bannerParameters.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
//// Add to main Layout
//        mainLayoutb.addView(startAppBanner, bannerParameters);



        sharebt = findViewById(R.id.banglashare);
        cotagory = findViewById(R.id.banglacatagorytext);
        title = findViewById(R.id.banglatexttitle);
        imageButton = findViewById(R.id.banglaimage);
        imageVbt = findViewById(R.id.banglaBt);





Allrecycler();




        Intent mIntent = getIntent();


        images=mIntent.getStringExtra("image");
        if (images ==null){

            imageid = mIntent.getIntExtra("intVariableName", 0);
            catgoryid = mIntent.getStringExtra("catagory");
            titleid = mIntent.getStringExtra("title");
            videoID = mIntent.getStringExtra("videoID");
            cotagory.setText(catgoryid);
            title.setText(titleid);
            Glide.with(this)
                    .load(imageid)
                    .fitCenter()
                    .into(imageButton);


            sharebt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT,
                            "https://www.youtube.com/watch?v=" + videoID);
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);
                }
            });
            imageVbt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplication(), VideoPlayer.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("videoID", videoID);
                    startActivity(intent);

//                    showRewardedVideo();

                }
            });

            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplication(), VideoPlayer.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("videoID", videoID);
                    startActivity(intent);
//                    showRewardedVideo();
                }
            });




        }
        else {

            images = mIntent.getStringExtra("image");
            catgoryid = mIntent.getStringExtra("catagory");
            titleid = mIntent.getStringExtra("title");
            videoID = mIntent.getStringExtra("videoID");
            cotagory.setText(catgoryid);
            title.setText(titleid);
            Glide.with(this)
                    .load(images)
                    .fitCenter()
                    .into(imageButton);


            sharebt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT,
                            "https://www.youtube.com/watch?v=" + videoID);
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);

                }
            });
            imageVbt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplication(), VideoPlayer.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("videoID", videoID);
                    startActivity(intent);
//                    showRewardedVideo();
                }
            });

            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplication(), VideoPlayer.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("videoID", videoID);
                    startActivity(intent);
//                    showRewardedVideo();
                }
            });





        }

    }

    private void Allrecycler() {

        recyclerView1 = findViewById(R.id.banglarupkothafgb);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setItemViewCacheSize(300);
        video1 = new ArrayList<>();

        video1.add(new StaticVideoClass("MAKHON BABUR KIPTEMI – BANGLA RUPKOTHAR GOLPO CARTOON", R.drawable.bangla12, "WgKD6mstQdw", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass("MURKHO PONDIT || HASIR GOLPO || MOJAR BANGAL CARTOON ", R.drawable.bangla13, "75YlvzVoRxE", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass("MALAI KULPI  || Bengali Adhunik Rupkotha", R.drawable.bangla14, "80b6ghecKMk", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass("BUDDHIMAAN KE ? Mojar Bangla Cartoon Video", R.drawable.bangla15, "4xraFuxBy", "FAIRY TALES IN BENGALI"));

        video1.add(new StaticVideoClass("SAT BAMON O JADU AYNA – RUPKOTHAR GOLPO | Story of Magical Mirror", R.drawable.bangla4, "S7Caw596yiw", "FAIRY TALES IN BENGALI"));

        video1.add(new StaticVideoClass("NOONER GOON STORY OF THAKURMAR JHULI | FAIRY TALES IN BENGALI", R.drawable.bangla6, "SYAiX19MAnw", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass("PORISROMER MULLYO STORY OF THAKURMAR JHULI, THE FAIRY TALES IN BENGALI ", R.drawable.bangla7, "-9pDi3LuclE", "FAIRY TALES IN BENGALI"));

        video1.add(new StaticVideoClass("SONALI MAACH STORY OF THAKURMAR JHULI | FAIRY TALES IN BENGALI ", R.drawable.bangla3, "EdIP4zODsfw", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass("SONAR KHIDE – BANGLA RUPKOTHA ", R.drawable.bangla5, "V8X9pJ_m_xg", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass("JADUR JHOLA /- THAKURMAR JHULI | Comedy Story  ", R.drawable.bangla8, "HrYkdS8L7lA", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass("BHAGGYER DAAN  | FAIRY TALES IN BENGALI ", R.drawable.bangla1, "OLims6RKZgA", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass("DUI MAYER EK CHELE ||  Bengali Fairy Tales |", R.drawable.bangla2, "PZxXVolDFCc", "FAIRY TALES IN BENGALI"));


        video1.add(new StaticVideoClass("BANGLA RUPKOTHAR GOLPO LOVI GHEE OWALA ", R.drawable.bangla9, "LY3auvKRjSQ", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass(" BANGLA RUPKOTHAR JUTO ABISHKAR", R.drawable.bangla10, "KQH2kjXlvx0", "FAIRY TALES IN BENGALI"));
        video1.add(new StaticVideoClass("ICCHAPURON - THAKURMAR JHULIR HASIR GOLPO", R.drawable.bangla11, "woL0XN3WbnA", "FAIRY TALES IN BENGALI"));

        RecyclerView.LayoutManager llm1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(llm1);
        BanglaAdapter RVA1 = new BanglaAdapter(getApplicationContext(), video1);
        recyclerView1.setAdapter(RVA1);

        recyclerView2 = findViewById(R.id.banglavirfgb);

        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemViewCacheSize(300);
        Videoclass25 = new ArrayList<>();

        Videoclass25.add(new StaticVideoClass("Vir: The Robot Boy | Bangla Cartoons| Blob Attack", R.drawable.virbangla3, "xDp-Wpk3dB4", "Vir The Robot boy"));
        Videoclass25.add(new StaticVideoClass("Vir: The Robot Boy  | Bangla Cartoons| Vir Ek Villian ", R.drawable.virbangla4, "8BEW__G8w6M", "Vir The Robot boy"));
        Videoclass25.add(new StaticVideoClass("Vir: The Robot BoyVir Vs Giant Bug ", R.drawable.virbangla5, "vLkEqIPEIV0", "Vir The Robot boy"));

        Videoclass25.add(new StaticVideoClass("Vir The Robot Boy Bangla Cartoons| Gintu Ki Boxing |", R.drawable.virbangla1, "8iLCT941vQE", "Vir The Robot boy"));
        Videoclass25.add(new StaticVideoClass("The Robot Boy|  Vir Vs Robotic Piranha ", R.drawable.virbangla2, "lWgNTEVoLIw", "Vir The Robot boy"));

        RecyclerView.LayoutManager llm25 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(llm25);
        BanglaAdapter RVA25 = new BanglaAdapter(getApplicationContext(), Videoclass25);
        recyclerView2.setAdapter(RVA25);


    }


//        public void showRewardedVideo() {
//        final StartAppAd rewardedVideo = new StartAppAd(this);
//
//        rewardedVideo.setVideoListener(new VideoListener() {
//            @Override
//            public void onVideoCompleted() {
////                Toast.makeText(getApplicationContext(), "Grant the reward to user", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        rewardedVideo.loadAd(StartAppAd.AdMode.OFFERWALL, new AdEventListener() {
//            @Override
//            public void onReceiveAd(Ad ad) {
//                rewardedVideo.showAd();
//            }
//
//            @Override
//            public void onFailedToReceiveAd(Ad ad) {
////                Toast.makeText(getApplicationContext(), "Can't show rewarded video", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    private void checkConnectivity() {
//                boolean enabled = true;

        ConnectivityManager connectivityManager = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivityManager.getActiveNetworkInfo();

        if ((info == null || !info.isConnected() || !info.isAvailable())) {

            new AlertDialog.Builder(this)
                    .setTitle("Connection Failure")
                    .setMessage("Please Connect to the Internet")
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

//                        Toast.makeText(getApplicationContext(), "Sin conexión a Internet...", Toast.LENGTH_SHORT).show();
        } else {

        }
//                return false;

    }
}