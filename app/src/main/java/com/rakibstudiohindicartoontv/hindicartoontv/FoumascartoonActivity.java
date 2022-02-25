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
import com.google.android.gms.common.internal.Objects;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.EnglishAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.FoumasAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.model.StaticVideoClass;

import java.util.ArrayList;
import java.util.List;

public class FoumascartoonActivity extends AppCompatActivity {
    private ImageButton imageButton, imageVbt;
    private TextView title, cotagory, sharebt;
    private RecyclerView recyclerView1,recyclerView2,recyclerView3,
            recyclerView4,recyclerView5;
    private List<StaticVideoClass>Videoclass21,Videoclass13,Videoclass22,Videoclass12,Videoclass15;



    String videoID;
    String catgoryid;
    String titleid;
    int imageid;
    String images=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foumascartoon);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();



        // Get the Main relative layout of the entire activity
        RelativeLayout mainLayout = (RelativeLayout)findViewById(R.id.ffbanner);
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

        sharebt = findViewById(R.id.shareef);
        cotagory = findViewById(R.id.catagorytextf);
        title = findViewById(R.id.texttitlef);
        imageButton = findViewById(R.id.foumasimagebt);
        imageVbt = findViewById(R.id.foumasvideoBt);
checkConnectivity();

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

       recyclerView1=findViewById(R.id.pokemonfgff) ;

        recyclerView1.setHasFixedSize(true);
        recyclerView1.setItemViewCacheSize(300);
        Videoclass21 = new ArrayList<>();

        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP07 Giving Chase At The Rhyhorn Race", R.drawable.pokemon6, "QLi-ltwttuQ", "Pokemon"));
        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP06 Battling On Thin Ice!", R.drawable.pokemon7, "XLmPtcxcizI", "Pokemon"));
        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP05 A Blustery Santalune Gym Battle! ", R.drawable.pokemon8, "sM07PnC01ag", "Pokemon"));
        Videoclass21.add(new StaticVideoClass(" Pokémon the Series: XY | EP04 A Shockingly Cheeky Friendship", R.drawable.pokemon9, "ovfEB4AlstU", "Pokemon"));
        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY | EP03 A Battle Of Aerial Mobility", R.drawable.pokemon10, "r7a3Aa4zUy4", "pokemon"));
        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP02 Lumiose City Pursuit!", R.drawable.pokemon11, "BZ3eAj4LHKo", "pokemon"));
        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP01 Kalos, Where Dreams And Adventures Begin", R.drawable.pokemon12, "wq8d8R8gin4", "pokemon"));

        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP12 | To Catch A Pokémon Smuggler! ", R.drawable.pokemon1, "Nn-BZvf0YXk", "Pokemon"));
        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP11 | The Bamboozling Forest!", R.drawable.pokemon2, "vqqz1JF5tNU", "Pokemon"));
        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP09 Clemont'S Got A Secret", R.drawable.pokemon3, "4Xvr3Ki5IZo", "Pokemon"));
        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP10 Mega-Mega Meowth Madness ", R.drawable.pokemon4, "98SNT6EM-LY", "Pokemon"));
        Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP08 Grooming Furfrou", R.drawable.pokemon5, "daTOwgPy8eY", "pokemon"));

        RecyclerView.LayoutManager llm21 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(llm21);
        FoumasAdapter RVA21 = new FoumasAdapter(getApplicationContext(), Videoclass21);
        recyclerView1.setAdapter(RVA21);


        recyclerView2=findViewById(R.id.oggyfgff) ;
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemViewCacheSize(300);
        Videoclass13 = new ArrayList<>();

        Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - The Abominable SnowRoach ", R.drawable.oggy4, "lRKciQGYwjo", "Oggy and the Cockroaches"));
        Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - Sports Fans", R.drawable.oggy5, "BstW5GDKVMU", "Oggy and the Cockroaches"));
        Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - The Magic Pen", R.drawable.oggy6, "aqcUTX2LsYA", "हिंदी Oggy and the Cockroaches"));
        Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - Joey and the Magic Bean", R.drawable.oggy7, "U_Hyd9_b_Xw", "Oggy and the Cockroaches"));
        Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - FACE OFF ", R.drawable.oogy8, "uhIpocidbTo", "Oggy and the Cockroaches"));

        Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches \uD83C\uDFE1 the house is no longer habitable ", R.drawable.upoggy1, "bmQcPgaE4gY", "Oggy and the Cockroaches"));
        Videoclass13.add(new StaticVideoClass(" हिंदी Oggy and the Cockroaches - Oggy’s Double ", R.drawable.oggy1, "01CxHBF0XyU", "Oggy and the Cockroaches"));
        Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - Inside Out  ", R.drawable.oggy2, "qtA2HHr6-BM", "Oggy and the Cockroaches"));
        Videoclass13.add(new StaticVideoClass(" हिंदी Oggy and the Cockroaches - Back To The Past!", R.drawable.oggy3, "E2KWTgEckbk", "Oggy and the Cockroaches"));

        RecyclerView.LayoutManager llm13 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(llm13);
        FoumasAdapter RVA13 = new FoumasAdapter(getApplicationContext(), Videoclass13);
        recyclerView2.setAdapter(RVA13);



        recyclerView3=findViewById(R.id.benfgff) ;
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setItemViewCacheSize(300);
        Videoclass22 = new ArrayList<>();

        Videoclass22.add(new StaticVideoClass("Ben 10 | Funny Moments Compilation \uD83D\uDE02 (Hindi)", R.drawable.ben5, "tihfHoWCe-4", "Ben 10"));
        Videoclass22.add(new StaticVideoClass("Ben 10 | Ben VS Monsters (Hindi)", R.drawable.ben6, "UiAGdDIM8Pg", "Ben 10)"));
        Videoclass22.add(new StaticVideoClass("Ben 10 | Ben's Best Alien Battles - Part 2 (Hindi)", R.drawable.ben7, "IfCNddqEwu4", "Ben 10"));
        Videoclass22.add(new StaticVideoClass("Ben 10 | Top Stinkfly Moments (Hindi) ", R.drawable.ben8, "jhFfh0cd8TI", "Ben 10"));
        Videoclass22.add(new StaticVideoClass("Ben 10 | Greatest Villains & Foes - Part 2 (Hindi) ", R.drawable.ben9, "AjdtCJs44L4", "Ben 10"));
        Videoclass22.add(new StaticVideoClass("Ben 10 | Best Four Arms Moments (Hindi)", R.drawable.ben10, "kfbmvD6qnNQ", "Ben 10"));

        Videoclass22.add(new StaticVideoClass("Ben 10 | Top Heatblast Moments (Hindi) ", R.drawable.ben1, "22QCfc_Ev2Y", "Ben 10)"));
        Videoclass22.add(new StaticVideoClass("Ben 10 | Greatest Villains & Foes Part 1 (Hindi) ", R.drawable.ben2, "9-wITfebwaY", "Ben 10"));
        Videoclass22.add(new StaticVideoClass("Ben 10 | Best Alien Battles Compilation (Hindi)", R.drawable.ben3, "rgx7LiDlo18", "Ben 10"));
        Videoclass22.add(new StaticVideoClass("Ben 10 | Rustbucket Moments (Hindi) ", R.drawable.ben4, "HtgXGm6rvE8", "Ben 10"));

        RecyclerView.LayoutManager llm22 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(llm22);
        FoumasAdapter RVA22 = new FoumasAdapter(getApplicationContext(), Videoclass22);
        recyclerView3.setAdapter(RVA22);



        recyclerView4=findViewById(R.id.doreamonfgff) ;
        recyclerView4.setItemViewCacheSize(300);
        Videoclass12 = new ArrayList<>();

        Videoclass12.add(new StaticVideoClass("Nobita Banega Snail || Snail House ", R.drawable.doraemon8, "CxwJE0miuBY", "Doraemon"));
        Videoclass12.add(new StaticVideoClass("Doraemon new episode Run Nobita Run ", R.drawable.doraemon7, "BXPRBuYq0GE", "Doraemon"));
        Videoclass12.add(new StaticVideoClass("Doraemon new episode  Lots of Pain ", R.drawable.doraemon6, "etbuWB1iguU", "Doraemon"));
        Videoclass12.add(new StaticVideoClass("Make a Genie Lamp || Nobita Banaye Sabko Genie", R.drawable.doraemon5, "qxPW-UxshlA", "Doraemon"));
        Videoclass12.add(new StaticVideoClass("Character Eggs ", R.drawable.doraemon4, "wcmL2Aebzw4", "Doraemon"));


        Videoclass12.add(new StaticVideoClass("Nobita's Blue Bird ", R.drawable.doraemon3, "iorm5TNkzMQ", "Doraemon"));
        Videoclass12.add(new StaticVideoClass(" 3 Years old Nobita ", R.drawable.doraemon2, "BAgOSOGywVw", "Doraemon"));
        Videoclass12.add(new StaticVideoClass("Touch Glove || Chhune Wale Dastane ", R.drawable.doraemon1, "FuHUvQTWtrw", "Doraemon"));

        Videoclass12.add(new StaticVideoClass(" Apneapp Marne Wala Gas ", R.drawable.doraemon10, "y5KCRCHfvOs", "Doraemon"));
        Videoclass12.add(new StaticVideoClass(" Nobita Mitaye Sabke Jhagre ", R.drawable.doraemon9, "m7HddWphS94", "Doraemon"));

        RecyclerView.LayoutManager llm12 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView4.setLayoutManager(llm12);
        FoumasAdapter RVA12 = new FoumasAdapter(getApplicationContext(), Videoclass12);
        recyclerView4.setAdapter(RVA12);


        recyclerView5=findViewById(R.id.beamfgff) ;
        recyclerView5.setHasFixedSize(true);
        recyclerView5.setItemViewCacheSize(300);
        Videoclass15 = new ArrayList<>();
        Videoclass15.add(new StaticVideoClass("Egg And Bean | Full Episode  ", R.drawable.beam9, "h3YU9vaErsg", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" Big TV | Full Episode ", R.drawable.beam8, "kH_Vkrwl5xc", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass("Double Trouble | Full Episode  ", R.drawable.beam7, "zdQvoqD5BhE", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" A Royal Makeover | Full Episode ", R.drawable.beam6, "NfDhlatnpDU", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" Keyboard Capers | Full Episode ", R.drawable.beam5, "YcD0Xp2iNzo", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" The Visitor | Full Episode", R.drawable.beam4, "Mb3lWAntBik", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass("A Running Battle ", R.drawable.beam3, "V2sSalA3AlU", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" SuperMarrow | Full Episode ", R.drawable.beam2, "H0gWtMYFbsk", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass("A Grand Invitation |", R.drawable.beam, "sqPvtYO4JOQ", "Mr Beam Animatiom"));

        Videoclass15.add(new StaticVideoClass(" Gadget Kid | Full Episode", R.drawable.beam19, "EqkMIeQa6WQ", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" Wanted | Full Episode ", R.drawable.beam18, "0hldF6gqaFI", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" Cat Sitting | Full Episode", R.drawable.beam17, "CS_C5C_Jk2E", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" Scaredy Bean | Full Episode", R.drawable.beam16, "HhcdFibiyQg", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" The Bottle | Full Episode ", R.drawable.beam15, "StHsjp8ZviE", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass("Goldfish | Full Episode  ", R.drawable.beam14, "qNpvX4--PUk", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" Car Trouble | Full Episode  ", R.drawable.beam13, "yRyBfGRUTcI", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass("Restaurant | Full Episode ", R.drawable.beam12, "hcZDxomV7rA", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass("Hot Date | Full Episode  ", R.drawable.beam11, "8RjyITwFCKc", "Mr Beam Animatiom"));
        Videoclass15.add(new StaticVideoClass(" Hopping Mad! | Full Episode", R.drawable.beam10, "KYmH93ByYc4", "Mr Beam Animatiom"));

        RecyclerView.LayoutManager llm15 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView5.setLayoutManager(llm15);
        EnglishAdapter RVA15 = new EnglishAdapter(getApplicationContext(), Videoclass15);
        recyclerView5.setAdapter(RVA15);


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