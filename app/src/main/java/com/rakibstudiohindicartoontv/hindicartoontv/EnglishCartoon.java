package com.rakibstudiohindicartoontv.hindicartoontv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.EnglishAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.model.StaticVideoClass;

import java.util.ArrayList;
import java.util.List;

public class EnglishCartoon extends AppCompatActivity {
    private ImageButton imageButton,imageVbt;
    private TextView title,cotagory,sharebt;
    private RecyclerView recyclerView1,recyclerView2,recyclerView3,
            recyclerView4,recyclerView5,recyclerView6,recyclerView7;
    private List<StaticVideoClass>Videoclass3,Videoclass20,Videoclass6,Videoclass10,Videoclass1,Videoclass9,video7;

    String videoID;
    String catgoryid;
    String titleid;
    int imageid;
    String images=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_cartoon);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        // Get the Main relative layout of the entire activity
        RelativeLayout mainLayout = (RelativeLayout)findViewById(R.id.englishbanner);
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






        sharebt=findViewById(R.id.englishsharee);
        cotagory=findViewById(R.id.englishcatagorytext);
        title=findViewById(R.id.englishtexttitle);
        imageButton=findViewById(R.id.englishimagebt);
        imageVbt=findViewById(R.id.englishvideoBt);
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
        recyclerView1=findViewById(R.id.littelfge);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setItemViewCacheSize(300);
        Videoclass3 = new ArrayList<>();
        Videoclass3.add(new StaticVideoClass("Doctor Bheem Helps His Friends! | Mighty Little Bheem ", R.drawable.little1, "dKVDB3h4XM4", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Baby Tiger Friend? \uD83D\uDC2FMighty Little Bheem", R.drawable.little2, "UvdKI9SlKyk", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Playground Time! \uD83D\uDE42 Mighty Little Bheem", R.drawable.little3, "Goqww0TgajY", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Diwali Fireworks & Treasure Chest \uD83C\uDF86Mighty Little Bheem ", R.drawable.little4, "hQNSgrY_e5g", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("A Birthday Surprise \uD83C\uDF82 Mighty Little Bheem", R.drawable.little5, "15h5GNTaTO4", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Mighty Little Bheem | Flower Adventure", R.drawable.little6, "Q_SbTdYjgfk", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Bheem, the Dancing Machine \uD83C\uDFB6 Mighty Little Bheem", R.drawable.little7, "x9SoDWpSg4k", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Mighty Little Bheem | Bheem with a Beat", R.drawable.little8, "U15sCqscZAk", "Little Bheem"));

        Videoclass3.add(new StaticVideoClass("Chasing Snacks! \uD83C\uDF61 | Mighty Little Bheem ", R.drawable.little9, "gqz-kWuWokY", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Bheem’s Planting Challenge \uD83C\uDF31 Mighty Little Bheem", R.drawable.little10, "rokTuJBVo5c", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Riding Horses \uD83D\uDC34 Mighty Little Bheem ", R.drawable.littel11, "Jqm4yCep1yw", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Bheem's Mightiest Moments \uD83C\uDFCB️\\u200d♂", R.drawable.chhota6, "j2BuT9ET-f8", "Chhota Bheem"));

        Videoclass3.add(new StaticVideoClass("Bheem's Snow Day| MIGHTY LITTLE BHEEM | ANIMATION ", R.drawable.uplittel2, "lFMT9Bk7BqU", "Little Bheem"));
        Videoclass3.add(new StaticVideoClass("Bheem Plays with Fuzzy, Fluffy & Furry Animal Friends! \uD83D\uDC3B\uD83E\uDD9A\uD83D\uDE49 Mighty Little Bheem ", R.drawable.uplittle1, "yWTKMqXFrEI", "Little Bheem"));


        RecyclerView.LayoutManager llm3 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(llm3);
        EnglishAdapter RVA3 = new EnglishAdapter(getApplicationContext(), Videoclass3);
        recyclerView1.setAdapter(RVA3);

        recyclerView2=findViewById(R.id.mickeyfge);

        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemViewCacheSize(300);
        Videoclass20 = new ArrayList<>();
        Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse  Pete's Beach Blanket Luau", R.drawable.mickey4, "", "Micky Mouse"));
        Videoclass20.add(new StaticVideoClass("Mickey Mouse Mickey's Message from Mars", R.drawable.mickey6, "8ayf340Blyc", "Micky Mouse"));
        Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse  Pluto's Bubble Bath", R.drawable.mickey7, "P7w7W_T8bOA", "Micky Mouse"));
        Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse , Coconutty Monkey", R.drawable.mickey, "U4o51T1Jous", "Micky Mouse"));
        Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse Donald's Ducks", R.drawable.mickey2, "Av0BRdnIzC8", "Micky Mouse"));
        Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse Playmate", R.drawable.mickey3, "vPz9sxKt-JY", "Micky Mouse"));
        Videoclass20.add(new StaticVideoClass(" Mickey Mouse Clubhouse  Minnie's Bee Story", R.drawable.mickey4, "xjM9BBGj23g", "Micky Mouse"));

        //null pic

        Videoclass20.add(new StaticVideoClass("Mouse Clubhouse Secret Spy Daisy18", R.drawable.mickey8, "umxRkctOIyw", "Micky Mouse"));
        RecyclerView.LayoutManager llm20 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(llm20);
        EnglishAdapter RVA20 = new EnglishAdapter(getApplicationContext(), Videoclass20);
        recyclerView2.setAdapter(RVA20);

        recyclerView3=findViewById(R.id.looneyfge);

        recyclerView3.setHasFixedSize(true);
        recyclerView3.setItemViewCacheSize(300);
        Videoclass6 = new ArrayList<>();

        Videoclass6.add(new StaticVideoClass("Porky Pig Snapshot | Looney Tuesdays", R.drawable.looney3, "THLESql6KBQ", "Looney Tunes"));
        Videoclass6.add(new StaticVideoClass("Looney Tunes | Iconic Duo: Porky and Daffy | Looney Tuesdays", R.drawable.looney4, "dRz21lUws3M", "Looney Tunes"));
        Videoclass6.add(new StaticVideoClass("Looney Tuesdays | Iconic Duo: Bugs and Daffy ", R.drawable.looney5, "_gCRW7bBlJQ", "Looney Tunes"));

        Videoclass6.add(new StaticVideoClass("I Tawt I Taw a Puddy Tat!' | Looney Tuesdays ", R.drawable.looney1, "gFtl6nyE1BI", "Looney Tunes"));
        Videoclass6.add(new StaticVideoClass("Looney Tunes Award Winners Announced | Looney Tuesdays", R.drawable.looney2, "0s3f-WCV5hg", "Looney Tunes"));

        RecyclerView.LayoutManager llm6 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(llm6);
        EnglishAdapter RVA6 = new EnglishAdapter(getApplicationContext(), Videoclass6);
        recyclerView3.setAdapter(RVA6);


        recyclerView4=findViewById(R.id.pinkfge);
        recyclerView4.setHasFixedSize(true);
        recyclerView4.setItemViewCacheSize(300);
        Videoclass10 = new ArrayList<>();
        Videoclass10.add(new StaticVideoClass(" Best of Pink Panther's Outdoor Adventures", R.drawable.pink4, "QE3wAA55x7c", "Pink Panther"));
        Videoclass10.add(new StaticVideoClass("Pink Bubbles Wash Pink Clothes ", R.drawable.pink5, "uvHzle4Qze8", "Pink Panther"));
        Videoclass10.add(new StaticVideoClass("Pink Panther's Magic Tricks ", R.drawable.pink6, "8c07-OC-DxM", "Pink Panther"));

        Videoclass10.add(new StaticVideoClass("Best of Pink Panther's Mukbangs ", R.drawable.pink1, "_OOJaqswQ-Y", "Pink Panther"));
        Videoclass10.add(new StaticVideoClass("Pink Panther Goes On A Detective Mission ", R.drawable.pink, "HAyVzKngqB8", "Pink Panther"));
        Videoclass10.add(new StaticVideoClass("Pink Panther Is Charlie Chaplin ", R.drawable.pink3, "sgBDv7xi05c", "Pink Panther"));

        RecyclerView.LayoutManager llm10 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView4.setLayoutManager(llm10);
        EnglishAdapter RVA10 = new EnglishAdapter(getApplicationContext(), Videoclass10);
        recyclerView4.setAdapter(RVA10);


        recyclerView5=findViewById(R.id.mashfge);
        recyclerView5.setHasFixedSize(true);
        recyclerView5.setItemViewCacheSize(300);
        //  GAL6hQGZHu8

        Videoclass1 = new ArrayList<>();
        Videoclass1.add(new StaticVideoClass("Masha and The Bear - Jam Day",R.drawable.bear1,"1BmcE6OFRyE","Masha and Brear"));
        Videoclass1.add(new StaticVideoClass("Masha and The Bear - Prances with Wolves",R.drawable.bear2,"NAOlICCWTDU","Masha and Brear"));
        Videoclass1.add(new StaticVideoClass("Masha and The Bear - Springtime for Bear ",R.drawable.bear3,"8BDC6UfpGS4","Masha and Brear"));
        Videoclass1.add(new StaticVideoClass("Masha and The Bear - Laundry Day",R.drawable.bear4,"X6Hur8jbfNo","Masha and Brear"));


        Videoclass1.add(new StaticVideoClass("Masha and the Bear \uD83D\uDC0E\uD83E\uDD20 Once in the Wild West ", R.drawable.masha1, "6xlfjRUSm3o", "Masha and Brear"));
        Videoclass1.add(new StaticVideoClass("Masha and The Bear - The Grand Piano ", R.drawable.masha2, "IHztGoYZ3rg", "Masha and Brear"));
        Videoclass1.add(new StaticVideoClass("Masha and the Bear \uD83C\uDFAD\uD83D\uDC83 All the world's a stage", R.drawable.masha3, "0nVlg2ZC9go", "Masha and Brear"));
        Videoclass1.add(new StaticVideoClass("Masha and the Bear \uD83D\uDE0A Where all love to sing \uD83D\uDE0A Masha's Songs \uD83C\uDDEE\uD83C\uDDF9 About Italy", R.drawable.masha4, "8-geRMTDn9w", "Masha and Brear"));
        Videoclass1.add(new StaticVideoClass("Masha and The Bear - One-Hit Wonder", R.drawable.masha5, "IHDzQ0_-JOE", "Masha and Brear"));

        Videoclass1.add(new StaticVideoClass("Masha and the Bear \uD83D\uDC0E\uD83E\uDD20 Once in the Wild West \uD83E\uDD20\uD83D\uDC0E  ", R.drawable.upmasha1, "lu5FeNCWUQo", "Masha and Brear"));
        Videoclass1.add(new StaticVideoClass("Masha and the Bear ❄️ Christmas Carol", R.drawable.upmasha2, "lu0YozRd0bE", "Masha and Brear"));


        RecyclerView.LayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView5.setLayoutManager(llm);
        EnglishAdapter RVA = new EnglishAdapter(getApplicationContext(), Videoclass1);
        recyclerView5.setAdapter(RVA);


        recyclerView6=findViewById(R.id.tomfge);
        recyclerView6.setHasFixedSize(true);
        recyclerView6.setItemViewCacheSize(300);
        Videoclass9 = new ArrayList<>();

        Videoclass9.add(new StaticVideoClass(" Tom & Jerry | The Most Delicious! | Classic Cartoon Compilation", R.drawable.tom6, "gpjv--hxUQM", "Tom and Jerry"));
        Videoclass9.add(new StaticVideoClass(" Tom & Jerry | Holidays with Family \uD83C\uDFE0| Classic Cartoon  ", R.drawable.tom7, "xUVeVCk4onU", "Tom and Jerry"));
        Videoclass9.add(new StaticVideoClass(" Tom & Jerry and The Magic Ring | That Impossible Ring Removal ", R.drawable.tom8, "FjCZufILZ8E", "Tom and Jerry"));

        Videoclass9.add(new StaticVideoClass(" Jerry and His Allies | Classic Cartoon Compilation ", R.drawable.tom1, "bgd7lLsK8Og", "Tom and Jerry"));
        Videoclass9.add(new StaticVideoClass(" Your Award Nominated Cartoons Guide | Classic Cartoon Compilation ", R.drawable.tom2, "6TBHFKUudis", "Tom and Jerry"));
        Videoclass9.add(new StaticVideoClass(" Never A Null Day With T&J! | Classic Cartoon Compilation ", R.drawable.tom3, "h_TFfNp_C2c", "Tom and Jerry"));
        Videoclass9.add(new StaticVideoClass("Make 'Em Laugh! | Classic Cartoon Compilation ", R.drawable.tom4, "rOax50EDIZQ", "Tom and Jerry"));
        Videoclass9.add(new StaticVideoClass(" Sunny Day Activities | Classic Cartoon Compilation", R.drawable.tom5, "U6nCBM1cgxc", "Tom and Jerry"));


        RecyclerView.LayoutManager llm9 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView6.setLayoutManager(llm9);
        EnglishAdapter RVA9 = new EnglishAdapter(getApplicationContext(), Videoclass9);
        recyclerView6.setAdapter(RVA9);




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}