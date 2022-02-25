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
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.HindiAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.model.StaticVideoClass;


import java.util.ArrayList;
import java.util.List;

public class HindiCartoon extends AppCompatActivity {
    private ImageButton imageButton,imageVbt;
    private TextView title,cotagory,sharebt;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;
    private RecyclerView recyclerView5;

    private List<StaticVideoClass> Videoclass19;
    private List<StaticVideoClass> Videoclass26;
    private List<StaticVideoClass> Videoclass18;
    private List<StaticVideoClass> Videoclass23;
    String videoID;
    String catgoryid;
    String titleid;
    int imageid;
    String images=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_cartoon);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        // Get the Main relative layout of the entire activity
        RelativeLayout mainLayout = (RelativeLayout)findViewById(R.id.hindibanner);
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
        sharebt=findViewById(R.id.sharee);
        cotagory=findViewById(R.id.catagorytext);
        title=findViewById(R.id.texttitle);
        imageButton=findViewById(R.id.hindiimagebt);
        imageVbt=findViewById(R.id.hindivideoBt);


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
        RecyclerView recyclerView1 = findViewById(R.id.hindiStorisfgh);

        recyclerView1.setHasFixedSize(true);
        recyclerView1.setItemViewCacheSize(300);
        List<StaticVideoClass> videoclass7 = new ArrayList<>();
        videoclass7.add(new StaticVideoClass("Greedy Cat Hindi Story | लालची बिल्ली की हिन्दी कहानी ", R.drawable.moral1, "JVVSwxaGlGE", "Hindi Moral Stories"));
        videoclass7.add(new StaticVideoClass("लालची खरगोश हिन्दी कहानी | Greedy Rabbit Hindi Story ", R.drawable.moral2, "92nedC6ucLU", "Hindi Moral Stories"));
        videoclass7.add(new StaticVideoClass("Greedy Fox and Sick Lion King - लालची लोमड़ी और बीमार राजा शेर हिन्दी कहानी ", R.drawable.moral3, "4ho4bx_wfms", "Hindi Moral Stories"));
        videoclass7.add(new StaticVideoClass("Greedy Fruit Seller Story लालची फल का व्यापारी हिन्दी कहानी ", R.drawable.moral4, "t33GTyHN5Ms", "Hindi Moral Stories"));
        videoclass7.add(new StaticVideoClass("Greedy Woodcutter Story - लालची लकड़हारा हिन्दी कहानी", R.drawable.moral5, "ELR9qtZvs_o", "Hindi Moral Stories"));
        videoclass7.add(new StaticVideoClass(" Greedy Ghee Seller Story - लालची घी बेचने वाला हिन्दी कहानी ", R.drawable.moral6, "R1K192RHQrc", "Hindi Moral Stories"));
        videoclass7.add(new StaticVideoClass("Greedy Milkman Story - लालची दूध वाला हिन्दी कहानी 3D ", R.drawable.moral7, "3p_eqcBVg2M", "Hindi Moral Stories"));
        videoclass7.add(new StaticVideoClass("Greedy Honey Seller Story - लालची शहद बेचने वाला हिन्दी कहानी ", R.drawable.moral8, "ppe138nUz80", "Hindi Moral Stories"));
        videoclass7.add(new StaticVideoClass("Greedy Crocodile and Deer  लालची मगरमच्छ और हिरण हिन्दी कहानी", R.drawable.moral9, "f-hJYGBa62g", "Hindi Moral Stories"));

        RecyclerView.LayoutManager llm7 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(llm7);
        HindiAdapter RVA7 = new HindiAdapter(getApplicationContext(), videoclass7);
        recyclerView1.setAdapter(RVA7);


        recyclerView2=findViewById(R.id.junglefgh);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemViewCacheSize(300);
        Videoclass26 = new ArrayList<>();
        Videoclass26.add(new StaticVideoClass("भेडियो का समारोह | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book1, "9MAeLpoGYtU", "Jungle Book "));
        Videoclass26.add(new StaticVideoClass("किस्सा आम का | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book, "W7urRyVu9H4", "Jungle Book "));
        Videoclass26.add(new StaticVideoClass("फियोना की तरकीबें | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book3, "_QRslqTBx90", "Jungle Book "));
        Videoclass26.add(new StaticVideoClass("माशा के कब्ज़े में पोन्या | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book4, "VKuYLVKdYSU", "Jungle Book "));
        Videoclass26.add(new StaticVideoClass("मोगली की मासूमियत | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book5, "Jdyhj1iT3Qc", "Jungle Book "));
        Videoclass26.add(new StaticVideoClass("शेर खान बना बुढा बिल्ला | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book6, "OkmAVKs8pXw", "Jungle Book "));
        Videoclass26.add(new StaticVideoClass("झमेले में का | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book7, "-9ukHNnJFg0", "Jungle Book "));
        Videoclass26.add(new StaticVideoClass("जचोरी ! | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book8, "PCeXiHZHjVs", "Jungle Book "));
        Videoclass26.add(new StaticVideoClass("पतंग | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book9, "Oj8BZyePDYs", "Jungle Book "));
        Videoclass26.add(new StaticVideoClass("मणि | हिंदी कहानीयाँ । जंगल बुक | पॉवरकिड्स", R.drawable.book10, "yFrhbKYaAAw", "Jungle Book "));

        RecyclerView.LayoutManager llm26 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(llm26);
        HindiAdapter RVA26 = new HindiAdapter(getApplicationContext(), Videoclass26);
        recyclerView2.setAdapter(RVA26);

        recyclerView3=findViewById(R.id.moralfgh);

        recyclerView3.setHasFixedSize(true);
        recyclerView3.setItemViewCacheSize(300);
        Videoclass18 = new ArrayList<>();
        Videoclass18.add(new StaticVideoClass("हाथी राजा और चालाक चिड़िया | Elephant King & Clever Sparrow ", R.drawable.hindi1, "0yG22xwi2p4", "Hindi Stories"));
        Videoclass18.add(new StaticVideoClass("लालची बेटा और जादुई कंगन | Greedy Son & Magical Bracelet", R.drawable.hindi2, "mUZXGNEY8Sw", "Hindi Stories"));
        Videoclass18.add(new StaticVideoClass("लाल टमाटर | Lal Tamatar - Red Tomato | Hindi Kahaniya | Stories in Hindi", R.drawable.hindi3, "1Eo3PV2QrQ4", "Hindi Stories"));
        Videoclass18.add(new StaticVideoClass("बदसूरत बतख़ | Ugly little Duck |  Hindi Kahaniya  ", R.drawable.hindi4, "4_WEx8IUmAI", "Hindi Stories"));
        Videoclass18.add(new StaticVideoClass("रेल गाडी | Aloo kachaloo beta On chuk chuk rail gadi |  Hindi Kahaniya", R.drawable.hindi5, "Zunb3bx1Db4", "Hindi Stories"));
        Videoclass18.add(new StaticVideoClass("चालू पड़ोसी | Cunning neighbour and his tricks |  Hindi Kahaniya ", R.drawable.hindi6, "N8CW3o0A52U", "Hindi Stories"));
        Videoclass18.add(new StaticVideoClass("मम्मी की रोटी गोल गोल | Mummy ki Roti gol gol by Aloo Kachaloo ", R.drawable.hindi7, "VZapYlhnWGo", "Hindi Stories"));
        Videoclass18.add(new StaticVideoClass("जादुई पेड़ | Magical tree with golden mangoes |  Hindi Kahaniya", R.drawable.hindi8, "Dhim17XTu0o", "Hindi Stories"));


        RecyclerView.LayoutManager llm18 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(llm18);
        HindiAdapter RVA18 = new HindiAdapter(getApplicationContext(), Videoclass18);
        recyclerView3.setAdapter(RVA18);

        recyclerView4=findViewById(R.id.simbafgh);
        recyclerView4.setHasFixedSize(true);
        recyclerView4.setItemViewCacheSize(300);
        Videoclass23 = new ArrayList<>();
        Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 1", R.drawable.simba1, "kRMd1sYJeKU", "Simba The Lion King"));
        Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 2", R.drawable.simba2, "5gbKOV-S5ZU", "Simba The Lion King"));
        Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 3", R.drawable.simba3, "pavkDawGiRg", "Simba The Lion King"));
        Videoclass23.add(new StaticVideoClass(" Simba - The Lion King | Jungle Stories In Hindi 4", R.drawable.simba4, "BIRSQBefuUg", "Simba The Lion King"));
        Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 5", R.drawable.simba5, "DtvlBIyRIDk", "Simba The Lion King"));
        Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 6", R.drawable.simba6, "MleeBeRmUGA", "Simba The Lion King"));

        RecyclerView.LayoutManager llm23 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView4.setLayoutManager(llm23);
        HindiAdapter RVA23 = new HindiAdapter(this, Videoclass23);
        recyclerView4.setAdapter(RVA23);

        recyclerView5=findViewById(R.id.janfgh);
        recyclerView5.setHasFixedSize(true);
        recyclerView5.setItemViewCacheSize(300);
        Videoclass19 = new ArrayList<>();
        Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Meri Mehnati Ammi", R.drawable.jan1, "lEuUdg70GFY", "Jan cartoon"));
        Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Farhan Uncle  ", R.drawable.jan2, "cAEMyHRXR9k", "Jan cartoon"));
        Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Chips  ", R.drawable.jan3, "h_QqIDASA0E", "Jan cartoon"));
        Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Ghar Mein Kon Hai ", R.drawable.jan4, "lUW3YEPE4hY", "Jan cartoon"));
        Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Cushions Ka Ghar", R.drawable.jan5, "zwyQwB85oFY", "Jan cartoon"));
        Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Murghay Wala Lollipop ", R.drawable.jan6, "qxF1c_CKNxg", "Jan cartoon"));

        RecyclerView.LayoutManager llm19 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView5.setLayoutManager(llm19);
        HindiAdapter RVA19 = new HindiAdapter(this, Videoclass19);
        recyclerView5.setAdapter(RVA19);





    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}