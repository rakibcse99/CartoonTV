package com.rakibstudiohindicartoontv.hindicartoontv;

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
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.FunnyAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.model.StaticVideoClass;

import java.util.ArrayList;
import java.util.List;

public class FunnyCartoonActivity extends AppCompatActivity {
    private ImageButton imageButton, imageVbt;
    private TextView title, cotagory, sharebt;

    private RecyclerView recyclerView1,recyclerView2,recyclerView3;
    private List<StaticVideoClass>Videoclass8,Videoclass11,Videoclass14;



    String videoID;
    String catgoryid;
    String titleid;
    int imageid;
    String images=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny_cartoon);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

checkConnectivity();
        // Get the Main relative layout of the entire activity
        RelativeLayout mainLayout = (RelativeLayout)findViewById(R.id.funnybanner);
// Define StartApp Banner
//        Banner startAppBanner = new Banner(this);
//        RelativeLayout.LayoutParams bannerParameters =
//                new RelativeLayout.LayoutParams(
//                        RelativeLayout.LayoutParams.WRAP_CONTENT,
//                        RelativeLayout.LayoutParams.WRAP_CONTENT);
//        bannerParameters.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        bannerParameters.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
//// Add to main Layout
//        mainLayout.addView(startAppBanner, bannerParameters);
//        // Get the Main relative layout of the entire activity
//        RelativeLayout mainLayout =findViewById(R.id.mainLayout);
//
//// Define StartApp Mrec
//        Mrec startAppMrec = new Mrec(this);
//        RelativeLayout.LayoutParams mrecParameters =
//                new RelativeLayout.LayoutParams(
//                        RelativeLayout.LayoutParams.WRAP_CONTENT,
//                        RelativeLayout.LayoutParams.WRAP_CONTENT);
//        mrecParameters.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        mrecParameters.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
//
//// Add to main Layout
//        mainLayout.addView(startAppMrec, mrecParameters);

        sharebt = findViewById(R.id.funnyshare);
        cotagory = findViewById(R.id.funnycatagorytext);
        title = findViewById(R.id.funnytexttitle);
        imageButton = findViewById(R.id.funnyimage);
        imageVbt = findViewById(R.id.funnyBt);

         allrecycler();


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
                }
            });





        }

    }

    private void allrecycler() {

        recyclerView1=findViewById(R.id.larvafgf);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setItemViewCacheSize(300);
        Videoclass8 = new ArrayList<>();

        Videoclass8.add(new StaticVideoClass("THUNDER STORM - Larva | Crazy Cartoons", R.drawable.larva7, "ZQjJtSzU-Eg", "Larva Video"));
        Videoclass8.add(new StaticVideoClass("SPIRIT - Larva | Crazy Cartoons ", R.drawable.larva6, "EtCynzt_qCA", "Larva Video"));

        Videoclass8.add(new StaticVideoClass("PUDDLE OF SWEAT - Larva ", R.drawable.larva5, "EyVHf924lFQ", "Larva Video"));
        Videoclass8.add(new StaticVideoClass("TUG OF WAR - LARVA ", R.drawable.larva4, "NWiada95TY8", "Larva Video"));
        Videoclass8.add(new StaticVideoClass("LARVA - THE LAST POPCORN", R.drawable.larva3, "hoYeZ3W92ic", "Larva Video"));
        Videoclass8.add(new StaticVideoClass("LARVA - PSYCHIC POWERS ", R.drawable.larva2, "irZ_TEFUCTY", "Larva Video"));
        Videoclass8.add(new StaticVideoClass("LARVA - HUMAN HORROR", R.drawable.larva1, "y3rh0lGTzLY", "Larva Video"));

        RecyclerView.LayoutManager llm8 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(llm8);
        FunnyAdapter RVA8 = new FunnyAdapter(getApplicationContext(), Videoclass8);
        recyclerView1.setAdapter(RVA8);

        recyclerView2=findViewById(R.id.oscarfgf) ;
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemViewCacheSize(300);
        Videoclass11 = new ArrayList<>();
        Videoclass11.add(new StaticVideoClass(" Oscar's Oasis - NEW FRIEND", R.drawable.oscar6, "GgsnfjYRyrA", "Oscar's  Funny Video"));
        Videoclass11.add(new StaticVideoClass("Oscar's Oasis - CHICKEN SQUAD Funny Cartoons ", R.drawable.oscar5, "HdN2b3b98LA", "Oscar's  Funny Video"));

        Videoclass11.add(new StaticVideoClass(" Oscar's Oasis - CATAPULT Funny Cartoons ", R.drawable.oscar4, "1S97TSCKsXI", "Oscar's  Funny Video"));
        Videoclass11.add(new StaticVideoClass(" Oscar's Oasis - CUCKOO CLOCK Funny Cartoons", R.drawable.oscar3, "Ax-8d653HEw", "Oscar's  Funny Video"));
        Videoclass11.add(new StaticVideoClass(" Oscar's Oasis - HUNTING TIME  _Funny Cartoon ", R.drawable.oscar2, "Xh8sBYQ7SKA", "Oscar's  Funny Video"));
        Videoclass11.add(new StaticVideoClass("Oscar's Oasis - FOOD MAGAZINE _Funny Cartoon  ", R.drawable.oscar1, "DUFOIXcnYW4", "Oscar's  Funny Video"));


        RecyclerView.LayoutManager llm11 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(llm11);
        FunnyAdapter RVA11 = new FunnyAdapter(getApplicationContext(), Videoclass11);
        recyclerView2.setAdapter(RVA11);


        recyclerView3=findViewById(R.id.creckfgf) ;
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setItemViewCacheSize(300);
        Videoclass14 = new ArrayList<>();
        Videoclass14.add(new StaticVideoClass("CRACKÉ - POLE VAULT _Cartoon for kids | Funny Kids TV's", R.drawable.creck4, "nKbXwCl16R0", "Cracke Clamstrap"));
        Videoclass14.add(new StaticVideoClass("CRACKÉ - GREEN THUMB _Cartoon for kids 30min | Funny Kids TV's", R.drawable.creck5, "Vo0NFJihuLE", "Cracke Clamstrap"));
        Videoclass14.add(new StaticVideoClass("CRACKÉ - CRACKS _Cartoon for kids | Funny Kids TV's", R.drawable.creck6, "HG3loVNSlFg", "Cracke Clamstrap"));

        Videoclass14.add(new StaticVideoClass("CRACKÉ - BATS! _Cartoon for kids by Squeeze | Funny Kids TV's", R.drawable.creck, "E4XBWuV_ZdA", "Cracke Clamstrap"));
        Videoclass14.add(new StaticVideoClass("CRACKÉ - HOT AIR _Cartoon for kids | Funny Kids TV's", R.drawable.creck2, "JuUp6YgRZ9U", "Cracke Clamstrap"));
        Videoclass14.add(new StaticVideoClass("CRACKÉ - SLINGSHOT _Cartoon for kids | Funny Kids TV's", R.drawable.creck3, "EYv1ZaZtmfI", "Cracke Clamstrap"));

        RecyclerView.LayoutManager llm14 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(llm14);
        FunnyAdapter RVA14 = new FunnyAdapter(getApplicationContext(), Videoclass14);
        recyclerView3.setAdapter(RVA14);
    }

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