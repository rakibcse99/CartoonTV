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
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.EnglishAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.HindiBestAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.model.StaticVideoClass;

import java.util.ArrayList;
import java.util.List;

public class HindiBestActivity extends AppCompatActivity {
    private ImageButton imageButton, imageVbt;
    private TextView title, cotagory, sharebt;

    private RecyclerView recyclerView1,recyclerView2,recyclerView3,
            recyclerView4,recyclerView5,recyclerView6,recyclerView7;
private List<StaticVideoClass>Videoclass16,Videoclass2,Videoclass5,Videoclass4,Videoclass24;

    String videoID;
    String catgoryid;
    String titleid;
    int imageid;
    String images=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_best);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        checkConnectivity();
        // Get the Main relative layout of the entire activity
        RelativeLayout mainLayout = (RelativeLayout)findViewById(R.id.hindibestbanner);
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

        sharebt = findViewById(R.id.shareehb);
        cotagory = findViewById(R.id.catagorytexthb);
        title = findViewById(R.id.texttitlehb);
        imageButton = findViewById(R.id.hindibestimagebt);
        imageVbt = findViewById(R.id.hindibestvideoBt);

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
        recyclerView1=findViewById(R.id.bhatijafghb);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setItemViewCacheSize(300);
        Videoclass16 = new ArrayList<>();
        Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 06 | Funny Animated Stories ", R.drawable.bhatija5, "CYFO3o-MAaY", "Chacha Bhatija"));
        Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 05 | Funny Animated Stories", R.drawable.bhatija6, "t2v8ObmdGbM", "Chacha Bhatija"));
        Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 04 | Funny Animated Stories", R.drawable.bhatija7, "XFjM_0-qJog", "Chacha Bhatija"));
        Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 03 | Funny Animated Stories", R.drawable.bhatija8, "CjPLRvcQQ8A", "Chacha Bhatija"));

        Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 10 | Funny Animated Stories", R.drawable.bhatija1, "ZwgMJ-APswg", "Chacha Bhatija"));
        Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 09 | Funny Animated Stories", R.drawable.bhatija, "T3VnlPKQbck", "Chacha Bhatija"));
        Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 08 | Funny Animated Stories", R.drawable.bhatija3, "3pjpFMzIu3s", "Chacha Bhatija"));
        Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 07 | Funny Animated Stories ", R.drawable.bhatija4, "oBdDqbAHt28", "Chacha Bhatija"));


        RecyclerView.LayoutManager llm16 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(llm16);
        HindiBestAdapter RVA16 = new HindiBestAdapter(getApplicationContext(), Videoclass16);
        recyclerView1.setAdapter(RVA16);


        recyclerView2=findViewById(R.id.virhindifghb);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemViewCacheSize(300);

        Videoclass2 = new ArrayList<>();
        Videoclass2.add(new StaticVideoClass("Blob Attack - Vir: The Robot Boy ", R.drawable.vir3, "wDQ7ux8mFrU", "Vir The Robot boy"));
        Videoclass2.add(new StaticVideoClass("Invisible Power Attack - Vir", R.drawable.vir4, "1P4W75HBcwM", "Vir The Robot boy"));
        Videoclass2.add(new StaticVideoClass("Vir The Robot Boy | Hindi Cartoon For Kids | Vir ek villian", R.drawable.vir5, "e0jrQnmUY5U", "Vir The Robot boy"));

        Videoclass2.add(new StaticVideoClass("Vir The Robot Boy | Hindi Cartoon For Kids | Vir vs robotic piranha ", R.drawable.vir1, "0XNKtDlqiCo", "Vir The Robot boy"));
        Videoclass2.add(new StaticVideoClass("Vir The Robot Boy | Hindi Cartoon For Kids | Alien Pedro ", R.drawable.vir2, "CokqB6VPulk", "Vir The Robot boy"));

        RecyclerView.LayoutManager llm2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(llm2);
        HindiBestAdapter RVA2 = new HindiBestAdapter(getApplicationContext(), Videoclass2);
        recyclerView2.setAdapter(RVA2);



        recyclerView3=findViewById(R.id.bablufghb);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setItemViewCacheSize(300);
        Videoclass5 = new ArrayList<>();
        Videoclass5.add(new StaticVideoClass("Bablu Dablu In Hindi Big Magic | Jadui Box ", R.drawable.bablu3, "DeFjLdQFFnw", "Bablu Dablu"));
        Videoclass5.add(new StaticVideoClass(" Bablu Dablu In Hindi Big Magic | Neend Ka Bukhar", R.drawable.bablu4, "jCf-0pZtwc0", "Bablu Dablu"));
        Videoclass5.add(new StaticVideoClass("Bablu Dablu In Hindi Big Magic | Putle Ka Ghapla", R.drawable.bablu1, "6Fm3Vin_Y0M", "Bablu Dablu"));

        Videoclass5.add(new StaticVideoClass("Bablu Dablu In Hindi Big Magic | Badam ka Pagalpan ", R.drawable.bablu1, "oKyi_aW9Sik", "Bablu Dablu"));
        Videoclass5.add(new StaticVideoClass("Bablu Dablu In Hindi Big Magic |  Khana Khazana", R.drawable.bablu2, "PVeDtEojoaM", "Bablu Dablu"));

        RecyclerView.LayoutManager llm5 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(llm5);
        HindiBestAdapter RVA5 = new HindiBestAdapter(getApplicationContext(), Videoclass5);
        recyclerView3.setAdapter(RVA5);

//        recyclerView4=findViewById(R.id.motufghgb);
//
//        recyclerView4.setHasFixedSize(true);
//        recyclerView4.setItemViewCacheSize(300);
//        Videoclass4 = new ArrayList<>();
//
//        Videoclass4.add(new StaticVideoClass("Motu Patlu New Episode | Hindi Cartoons For Kids | John Ka Mission Samosa ", R.drawable.motuhindi3, "pSULtIvePYE", "Motupatlu"));
//        Videoclass4.add(new StaticVideoClass("Motu Patlu New Episode | Cartoons | Kids TV Shows | Boxer Ki Nayee Car  ", R.drawable.motuhindi4, "3GTwmgBB4y8", "Motupatlu"));
//        Videoclass4.add(new StaticVideoClass("Motu Patlu New Episode | Hindi Cartoons For Kids | John Ke Robot Tree ", R.drawable.motuhindi5, "UmKbycPy3cw", "Motupatlu"));
//
//        Videoclass4.add(new StaticVideoClass("Motu Patlu New Episode | Cartoons | Kids TV Shows | Motu Ki Pagadi ", R.drawable.motuhindi1, "yRfMJ-Uhw54", "Motupatlu"));
//        Videoclass4.add(new StaticVideoClass("  BEST SCENES of MOTU PATLU | FUNNY Cartoons in Hindi | Wow Kidz | Compilation ", R.drawable.motuhindi2, "zIGI1S23pWI", "Motupatlu"));
//
//        RecyclerView.LayoutManager llm4 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerView4.setLayoutManager(llm4);
//        HindiBestAdapter RVA4 = new HindiBestAdapter(getApplicationContext(), Videoclass4);
//        recyclerView4.setAdapter(RVA4);



        recyclerView5=findViewById(R.id.chottafghb);
        recyclerView5.setHasFixedSize(true);
        recyclerView5.setItemViewCacheSize(300);
        Videoclass24 = new ArrayList<>();
        Videoclass24.add(new StaticVideoClass("Chhota Bheem -  Raju in Trouble | Icchadhari Naag ke Kahani | ",R.drawable.bheem2,"D545lW6mFb0","Chhota Bheem"));
        Videoclass24.add(new StaticVideoClass("Chhota Bheem - Itni Garmi Kyun Hai? | Hindi Cartoon for Kids",R.drawable.bheem3,"LBnsFd7U1Nc","Chhota Bheem"));
        Videoclass24.add(new StaticVideoClass("Chhota Bheem - Best Gift for Christmas",R.drawable.bheem4,"esEh_DSJzx4","Chhota Bheem"));

        Videoclass24.add(new StaticVideoClass("Chhota Bheem - Holi in Vrindavan | Holi Special Video Song", R.drawable.chhota1, "6NWb8X3i3Mc", "Chhota Bheem"));
        Videoclass24.add(new StaticVideoClass("Chhota Bheem aur Hanuman | Mahabali Hanuman in Bheemayan", R.drawable.chhota2, "T_f2yfUrOKc", "Chhota Bheem"));
        Videoclass24.add(new StaticVideoClass(" Super Bheem VS Kirmada | Sky Dragon ke Raksha - Full Video in Hindi", R.drawable.chhota3, "5KJ-_6sZ4Zs", "Chhota Bheem"));
        Videoclass24.add(new StaticVideoClass("Chhota Bheem - Mysterious Cube", R.drawable.chhota4, "W73xnTZZnWA", "Chhota Bheem"));
        Videoclass24.add(new StaticVideoClass("Team Chhota Bheem Vs Team Mighty - Master Chef Competition ", R.drawable.chhota5, "-_sXY8_eIIc", "Chhota Bheem"));

        Videoclass24.add(new StaticVideoClass("Super Bheem - The Sky Wars", R.drawable.upchhota1, "9zhs5pm2rdw", "Chhota Bheem"));
        Videoclass24.add(new StaticVideoClass("Chhota Bheem - Dholakpur Mein Chor | Cartoon for Kids in Hindi", R.drawable.upchhota2, "z88EpUVYSLE", "Chhota Bheem"));

        RecyclerView.LayoutManager llm24 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView5.setLayoutManager(llm24);
        HindiBestAdapter RVA24 = new HindiBestAdapter(getApplicationContext(), Videoclass24);
        recyclerView5.setAdapter(RVA24);


//        recyclerView6=findViewById(R.id);
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