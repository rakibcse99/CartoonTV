package com.rakibstudiohindicartoontv.hindicartoontv.ui.home;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rakibstudiohindicartoontv.hindicartoontv.R;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.BanglaAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.EnglishAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.FoumasAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.FunnyAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.HindiAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.HindiBestAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.adapter.RSMAdapter;
import com.rakibstudiohindicartoontv.hindicartoontv.model.SliderAdapterExample;
import com.rakibstudiohindicartoontv.hindicartoontv.databinding.FragmentHomeBinding;
import com.rakibstudiohindicartoontv.hindicartoontv.model.ImageClass;
import com.rakibstudiohindicartoontv.hindicartoontv.model.SliderItem;
import com.rakibstudiohindicartoontv.hindicartoontv.model.StaticVideoClass;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


        SliderView sliderView;
        private SliderAdapterExample adapter;
// English
    private List<StaticVideoClass> Videoclass1;
    private List<StaticVideoClass> Videoclass2;
    private List<StaticVideoClass> Videoclass3;
    private List<StaticVideoClass> Videoclass4;
    private List<StaticVideoClass> Videoclass5;
    private List<StaticVideoClass> Videoclass6;
    private List<StaticVideoClass> Videoclass7;
    private List<StaticVideoClass> Videoclass8;
    private List<StaticVideoClass> Videoclass9;
    //hindi
    private List<StaticVideoClass> Videoclass10;
    private List<StaticVideoClass> Videoclass11;
    private List<StaticVideoClass> Videoclass12;

    private List<StaticVideoClass> Videoclass13;
    private List<StaticVideoClass> Videoclass14;
    private List<StaticVideoClass> Videoclass15;
    private List<StaticVideoClass> Videoclass16;
    private List<StaticVideoClass> Videoclass17;
    private List<StaticVideoClass> Videoclass18;
    private List<StaticVideoClass> Videoclass19;
   // bangla
    private List<StaticVideoClass> Videoclass20;

    private List<StaticVideoClass> Videoclass21;
    private List<StaticVideoClass> Videoclass22;
    private List<StaticVideoClass> Videoclass23;

    private List<StaticVideoClass> Videoclass24;
    private List<StaticVideoClass> Videoclass25;
    private List<StaticVideoClass> Videoclass26;
    private List<StaticVideoClass> Videoclass27;
    private List<StaticVideoClass> Videoclass28;
        private List<StaticVideoClass> Videoclass29;
        private List<StaticVideoClass> Videoclass30;

        List<ImageClass> imagePojoArrayList;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
            checkConnectivity();

//            gridLIst();


//            binding.ShowRecycler.setHasFixedSize(true);
//
//            LinearLayoutManager llm=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false);
//            CetagoryAdapter2 imageRVA=new CetagoryAdapter2(getContext(),imagePojoArrayList);
//            binding.ShowRecycler.setLayoutManager(llm);
//            binding.ShowRecycler.setAdapter(imageRVA);



            return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);


            sliderView = view.findViewById(R.id.imageSlider);

            adapter = new SliderAdapterExample(requireContext());
            sliderView.setSliderAdapter(adapter);
            sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
            sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
            sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
            sliderView.setIndicatorSelectedColor(Color.RED);
            sliderView.setIndicatorUnselectedColor(Color.GRAY);
            sliderView.setScrollTimeInSec(1);
            sliderView.setAutoCycle(true);
            sliderView.startAutoCycle();
            picupadapter();






            english();
            hindi();
            bangla();

//       RecyclerView mRecyclerView=view.findViewById(R.id.MashaRecycler);

            binding.MashaRecycler.setHasFixedSize(true);
            binding.MashaRecycler.setItemViewCacheSize(300);
            //  GAL6hQGZHu8

            Videoclass1 = new ArrayList<>();

            Videoclass1.add(new StaticVideoClass("Masha and The Bear - Jam Day",R.drawable.bear1,"1BmcE6OFRyE","Masha and Brear"));
            Videoclass1.add(new StaticVideoClass("Masha and The Bear - Prances with Wolves",R.drawable.bear2,"NAOlICCWTDU","Masha and Brear"));
            Videoclass1.add(new StaticVideoClass("Masha and The Bear - Springtime for Bear ",R.drawable.bear3,"8BDC6UfpGS4","Masha and Brear"));
            Videoclass1.add(new StaticVideoClass("Masha and The Bear - Laundry Day",R.drawable.bear4,"X6Hur8jbfNo","Masha and Brear"));

            Videoclass1.add(new StaticVideoClass("Masha and the Bear \uD83D\uDC0E\uD83E\uDD20 Once in the Wild West \uD83E\uDD20\uD83D\uDC0E  ", R.drawable.upmasha1, "lu5FeNCWUQo", "Masha and Brear"));
            Videoclass1.add(new StaticVideoClass("Masha and the Bear ❄️ Christmas Carol", R.drawable.upmasha2, "lu0YozRd0bE", "Masha and Brear"));

            Videoclass1.add(new StaticVideoClass("Masha and the Bear \uD83D\uDC0E\uD83E\uDD20 Once in the Wild West ", R.drawable.masha1, "6xlfjRUSm3o", "Masha and Brear"));
            Videoclass1.add(new StaticVideoClass("Masha and The Bear - The Grand Piano ", R.drawable.masha2, "IHztGoYZ3rg", "Masha and Brear"));
            Videoclass1.add(new StaticVideoClass("Masha and the Bear \uD83C\uDFAD\uD83D\uDC83 All the world's a stage", R.drawable.masha3, "0nVlg2ZC9go", "Masha and Brear"));
            Videoclass1.add(new StaticVideoClass("Masha and the Bear \uD83D\uDE0A Where all love to sing \uD83D\uDE0A Masha's Songs \uD83C\uDDEE\uD83C\uDDF9 About Italy", R.drawable.masha4, "8-geRMTDn9w", "Masha and Brear"));
            Videoclass1.add(new StaticVideoClass("Masha and The Bear - One-Hit Wonder", R.drawable.masha5, "IHDzQ0_-JOE", "Masha and Brear"));

            RecyclerView.LayoutManager llm = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.MashaRecycler.setLayoutManager(llm);
            EnglishAdapter RVA = new EnglishAdapter(getContext(), Videoclass1);
            binding.MashaRecycler.setAdapter(RVA);


            binding.VirRecycler.setHasFixedSize(true);
            binding.VirRecycler.setItemViewCacheSize(300);

            Videoclass2 = new ArrayList<>();
            Videoclass2.add(new StaticVideoClass("Vir The Robot Boy | Hindi Cartoon For Kids | Vir vs robotic piranha ", R.drawable.vir1, "0XNKtDlqiCo", "Vir The Robot boy"));
            Videoclass2.add(new StaticVideoClass("Vir The Robot Boy | Hindi Cartoon For Kids | Alien Pedro ", R.drawable.vir2, "CokqB6VPulk", "Vir The Robot boy"));
            Videoclass2.add(new StaticVideoClass("Blob Attack - Vir: The Robot Boy ", R.drawable.vir3, "wDQ7ux8mFrU", "Vir The Robot boy"));
            Videoclass2.add(new StaticVideoClass("Invisible Power Attack - Vir", R.drawable.vir4, "1P4W75HBcwM", "Vir The Robot boy"));
            Videoclass2.add(new StaticVideoClass("Vir The Robot Boy | Hindi Cartoon For Kids | Vir ek villian", R.drawable.vir5, "e0jrQnmUY5U", "Vir The Robot boy"));

            RecyclerView.LayoutManager llm2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.VirRecycler.setLayoutManager(llm2);
            HindiBestAdapter RVA2 = new HindiBestAdapter(getContext(), Videoclass2);
            binding.VirRecycler.setAdapter(RVA2);


            binding.LittlebheemRecycler.setHasFixedSize(true);
            binding.LittlebheemRecycler.setItemViewCacheSize(300);
            Videoclass3 = new ArrayList<>();
            Videoclass3.add(new StaticVideoClass("Chasing Snacks! \uD83C\uDF61 | Mighty Little Bheem ", R.drawable.little9, "gqz-kWuWokY", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Bheem’s Planting Challenge \uD83C\uDF31 Mighty Little Bheem", R.drawable.little10, "rokTuJBVo5c", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Riding Horses \uD83D\uDC34 Mighty Little Bheem ", R.drawable.littel11, "Jqm4yCep1yw", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Bheem's Mightiest Moments \uD83C\uDFCB️\\u200d♂", R.drawable.chhota6, "j2BuT9ET-f8", "Chhota Bheem"));

            Videoclass3.add(new StaticVideoClass("Bheem's Snow Day| MIGHTY LITTLE BHEEM | ANIMATION ", R.drawable.uplittel2, "lFMT9Bk7BqU", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Bheem Plays with Fuzzy, Fluffy & Furry Animal Friends! \uD83D\uDC3B\uD83E\uDD9A\uD83D\uDE49 Mighty Little Bheem ", R.drawable.uplittle1, "yWTKMqXFrEI", "Little Bheem"));

            Videoclass3.add(new StaticVideoClass("Doctor Bheem Helps His Friends! | Mighty Little Bheem ", R.drawable.little1, "dKVDB3h4XM4", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Baby Tiger Friend? \uD83D\uDC2FMighty Little Bheem", R.drawable.little2, "UvdKI9SlKyk", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Playground Time! \uD83D\uDE42 Mighty Little Bheem", R.drawable.little3, "Goqww0TgajY", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Diwali Fireworks & Treasure Chest \uD83C\uDF86Mighty Little Bheem ", R.drawable.little4, "hQNSgrY_e5g", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("A Birthday Surprise \uD83C\uDF82 Mighty Little Bheem", R.drawable.little5, "15h5GNTaTO4", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Mighty Little Bheem | Flower Adventure", R.drawable.little6, "Q_SbTdYjgfk", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Bheem, the Dancing Machine \uD83C\uDFB6 Mighty Little Bheem", R.drawable.little7, "x9SoDWpSg4k", "Little Bheem"));
            Videoclass3.add(new StaticVideoClass("Mighty Little Bheem | Bheem with a Beat", R.drawable.little8, "U15sCqscZAk", "Little Bheem"));

            RecyclerView.LayoutManager llm3 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.LittlebheemRecycler.setLayoutManager(llm3);
            EnglishAdapter RVA3 = new EnglishAdapter(getContext(), Videoclass3);
            binding.LittlebheemRecycler.setAdapter(RVA3);

//            binding.MotuPatluRecycler.setHasFixedSize(true);
//            binding.MotuPatluRecycler.setItemViewCacheSize(300);
//            Videoclass4 = new ArrayList<>();
//            Videoclass4.add(new StaticVideoClass("Motu Patlu New Episode | Cartoons | Kids TV Shows | Motu Ki Pagadi ", R.drawable.motuhindi1, "yRfMJ-Uhw54", "Motupatlu"));
//            Videoclass4.add(new StaticVideoClass("  BEST SCENES of MOTU PATLU | FUNNY Cartoons in Hindi | Wow Kidz | Compilation ", R.drawable.motuhindi2, "zIGI1S23pWI", "Motupatlu"));
//            Videoclass4.add(new StaticVideoClass("Motu Patlu New Episode | Hindi Cartoons For Kids | John Ka Mission Samosa ", R.drawable.motuhindi3, "pSULtIvePYE", "Motupatlu"));
//            Videoclass4.add(new StaticVideoClass("Motu Patlu New Episode | Cartoons | Kids TV Shows | Boxer Ki Nayee Car  ", R.drawable.motuhindi4, "3GTwmgBB4y8", "Motupatlu"));
//            Videoclass4.add(new StaticVideoClass("Motu Patlu New Episode | Hindi Cartoons For Kids | John Ke Robot Tree ", R.drawable.motuhindi5, "UmKbycPy3cw", "Motupatlu"));
//
//            RecyclerView.LayoutManager llm4 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
//            binding.MotuPatluRecycler.setLayoutManager(llm4);
//            HindiBestAdapter RVA4 = new HindiBestAdapter(getContext(), Videoclass4);
//            binding.MotuPatluRecycler.setAdapter(RVA4);

            binding.BabluDabluRecycler.setHasFixedSize(true);
            binding.BabluDabluRecycler.setItemViewCacheSize(300);
            Videoclass5 = new ArrayList<>();
            Videoclass5.add(new StaticVideoClass("Bablu Dablu In Hindi Big Magic | Badam ka Pagalpan ", R.drawable.bablu1, "oKyi_aW9Sik", "Bablu Dablu"));
            Videoclass5.add(new StaticVideoClass("Bablu Dablu In Hindi Big Magic |  Khana Khazana", R.drawable.bablu2, "PVeDtEojoaM", "Bablu Dablu"));
            Videoclass5.add(new StaticVideoClass("Bablu Dablu In Hindi Big Magic | Jadui Box ", R.drawable.bablu3, "DeFjLdQFFnw", "Bablu Dablu"));
            Videoclass5.add(new StaticVideoClass(" Bablu Dablu In Hindi Big Magic | Neend Ka Bukhar", R.drawable.bablu4, "jCf-0pZtwc0", "Bablu Dablu"));
            Videoclass5.add(new StaticVideoClass("Bablu Dablu In Hindi Big Magic | Putle Ka Ghapla", R.drawable.bablu1, "6Fm3Vin_Y0M", "Bablu Dablu"));

            RecyclerView.LayoutManager llm5 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.BabluDabluRecycler.setLayoutManager(llm5);
            HindiBestAdapter RVA5 = new HindiBestAdapter(getContext(), Videoclass5);
            binding.BabluDabluRecycler.setAdapter(RVA5);


            binding.LooneyTounsRecycler.setHasFixedSize(true);
            binding.LooneyTounsRecycler.setItemViewCacheSize(300);
            Videoclass6 = new ArrayList<>();
            Videoclass6.add(new StaticVideoClass("I Tawt I Taw a Puddy Tat!' | Looney Tuesdays ", R.drawable.looney1, "gFtl6nyE1BI", "Looney Tunes"));
            Videoclass6.add(new StaticVideoClass("Looney Tunes Award Winners Announced | Looney Tuesdays", R.drawable.looney2, "0s3f-WCV5hg", "Looney Tunes"));
            Videoclass6.add(new StaticVideoClass("Porky Pig Snapshot | Looney Tuesdays", R.drawable.looney3, "THLESql6KBQ", "Looney Tunes"));
            Videoclass6.add(new StaticVideoClass("Looney Tunes | Iconic Duo: Porky and Daffy | Looney Tuesdays", R.drawable.looney4, "dRz21lUws3M", "Looney Tunes"));
            Videoclass6.add(new StaticVideoClass("Looney Tuesdays | Iconic Duo: Bugs and Daffy ", R.drawable.looney5, "_gCRW7bBlJQ", "Looney Tunes"));

            RecyclerView.LayoutManager llm6 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.LooneyTounsRecycler.setLayoutManager(llm6);
            EnglishAdapter RVA6 = new EnglishAdapter(getContext(), Videoclass6);
            binding.LooneyTounsRecycler.setAdapter(RVA6);


            binding.HindistoryRecycler.setHasFixedSize(true);
            binding.HindistoryRecycler.setItemViewCacheSize(300);
            Videoclass7 = new ArrayList<>();
            Videoclass7.add(new StaticVideoClass("Greedy Cat Hindi Story | लालची बिल्ली की हिन्दी कहानी ", R.drawable.moral1, "JVVSwxaGlGE", "Hindi Moral Stories"));
            Videoclass7.add(new StaticVideoClass("लालची खरगोश हिन्दी कहानी | Greedy Rabbit Hindi Story ", R.drawable.moral2, "92nedC6ucLU", "Hindi Moral Stories"));
            Videoclass7.add(new StaticVideoClass("Greedy Fox and Sick Lion King - लालची लोमड़ी और बीमार राजा शेर हिन्दी कहानी ", R.drawable.moral3, "4ho4bx_wfms", "Hindi Moral Stories"));
            Videoclass7.add(new StaticVideoClass("Greedy Fruit Seller Story लालची फल का व्यापारी हिन्दी कहानी ", R.drawable.moral4, "t33GTyHN5Ms", "Hindi Moral Stories"));
            Videoclass7.add(new StaticVideoClass("Greedy Woodcutter Story - लालची लकड़हारा हिन्दी कहानी", R.drawable.moral5, "ELR9qtZvs_o", "Hindi Moral Stories"));
            Videoclass7.add(new StaticVideoClass(" Greedy Ghee Seller Story - लालची घी बेचने वाला हिन्दी कहानी ", R.drawable.moral6, "R1K192RHQrc", "Hindi Moral Stories"));
            Videoclass7.add(new StaticVideoClass("Greedy Milkman Story - लालची दूध वाला हिन्दी कहानी 3D ", R.drawable.moral7, "3p_eqcBVg2M", "Hindi Moral Stories"));
            Videoclass7.add(new StaticVideoClass("Greedy Honey Seller Story - लालची शहद बेचने वाला हिन्दी कहानी ", R.drawable.moral8, "ppe138nUz80", "Hindi Moral Stories"));
            Videoclass7.add(new StaticVideoClass("Greedy Crocodile and Deer  लालची मगरमच्छ और हिरण हिन्दी कहानी", R.drawable.moral9, "f-hJYGBa62g", "Hindi Moral Stories"));

            RecyclerView.LayoutManager llm7 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.HindistoryRecycler.setLayoutManager(llm7);
            HindiAdapter RVA7 = new HindiAdapter(getContext(), Videoclass7);
            binding.HindistoryRecycler.setAdapter(RVA7);


            binding.LarvaRecycler.setHasFixedSize(true);
            binding.LarvaRecycler.setItemViewCacheSize(300);
            Videoclass8 = new ArrayList<>();
            Videoclass8.add(new StaticVideoClass("THUNDER STORM - Larva | Crazy Cartoons", R.drawable.larva7, "ZQjJtSzU-Eg", "Larva Video"));
            Videoclass8.add(new StaticVideoClass("SPIRIT - Larva | Crazy Cartoons ", R.drawable.larva6, "EtCynzt_qCA", "Larva Video"));
            Videoclass8.add(new StaticVideoClass("PUDDLE OF SWEAT - Larva ", R.drawable.larva5, "EyVHf924lFQ", "Larva Video"));
            Videoclass8.add(new StaticVideoClass("TUG OF WAR - LARVA ", R.drawable.larva4, "NWiada95TY8", "Larva Video"));
            Videoclass8.add(new StaticVideoClass("LARVA - THE LAST POPCORN", R.drawable.larva3, "hoYeZ3W92ic", "Larva Video"));
            Videoclass8.add(new StaticVideoClass("LARVA - PSYCHIC POWERS ", R.drawable.larva2, "irZ_TEFUCTY", "Larva Video"));
            Videoclass8.add(new StaticVideoClass("LARVA - HUMAN HORROR", R.drawable.larva1, "y3rh0lGTzLY", "Larva Video"));

            RecyclerView.LayoutManager llm8 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.LarvaRecycler.setLayoutManager(llm8);
            FunnyAdapter RVA8 = new FunnyAdapter(getContext(), Videoclass8);
            binding.LarvaRecycler.setAdapter(RVA8);


            binding.TomRecycler.setHasFixedSize(true);
            binding.TomRecycler.setItemViewCacheSize(300);
            Videoclass9 = new ArrayList<>();
            Videoclass9.add(new StaticVideoClass(" Jerry and His Allies | Classic Cartoon Compilation ", R.drawable.tom1, "bgd7lLsK8Og", "Tom and Jerry"));
            Videoclass9.add(new StaticVideoClass(" Your Award Nominated Cartoons Guide | Classic Cartoon Compilation ", R.drawable.tom2, "6TBHFKUudis", "Tom and Jerry"));
            Videoclass9.add(new StaticVideoClass(" Never A Null Day With T&J! | Classic Cartoon Compilation ", R.drawable.tom3, "h_TFfNp_C2c", "Tom and Jerry"));
            Videoclass9.add(new StaticVideoClass("Make 'Em Laugh! | Classic Cartoon Compilation ", R.drawable.tom4, "rOax50EDIZQ", "Tom and Jerry"));
            Videoclass9.add(new StaticVideoClass(" Sunny Day Activities | Classic Cartoon Compilation", R.drawable.tom5, "U6nCBM1cgxc", "Tom and Jerry"));

            Videoclass9.add(new StaticVideoClass(" Tom & Jerry | The Most Delicious! | Classic Cartoon Compilation", R.drawable.tom6, "gpjv--hxUQM", "Tom and Jerry"));
            Videoclass9.add(new StaticVideoClass(" Tom & Jerry | Holidays with Family \uD83C\uDFE0| Classic Cartoon  ", R.drawable.tom7, "xUVeVCk4onU", "Tom and Jerry"));
            Videoclass9.add(new StaticVideoClass(" Tom & Jerry and The Magic Ring | That Impossible Ring Removal ", R.drawable.tom8, "FjCZufILZ8E", "Tom and Jerry"));

            RecyclerView.LayoutManager llm9 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.TomRecycler.setLayoutManager(llm9);
            EnglishAdapter RVA9 = new EnglishAdapter(getContext(), Videoclass9);
            binding.TomRecycler.setAdapter(RVA9);


            binding.PinkRecycler.setHasFixedSize(true);
            binding.PinkRecycler.setItemViewCacheSize(300);
            Videoclass10 = new ArrayList<>();

            Videoclass10.add(new StaticVideoClass("Best of Pink Panther's Mukbangs ", R.drawable.pink1, "_OOJaqswQ-Y", "Pink Panther"));
            Videoclass10.add(new StaticVideoClass("Pink Panther Goes On A Detective Mission ", R.drawable.pink, "HAyVzKngqB8", "Pink Panther"));
            Videoclass10.add(new StaticVideoClass("Pink Panther Is Charlie Chaplin ", R.drawable.pink3, "sgBDv7xi05c", "Pink Panther"));
            Videoclass10.add(new StaticVideoClass(" Best of Pink Panther's Outdoor Adventures", R.drawable.pink4, "QE3wAA55x7c", "Pink Panther"));
            Videoclass10.add(new StaticVideoClass("Pink Bubbles Wash Pink Clothes ", R.drawable.pink5, "uvHzle4Qze8", "Pink Panther"));
            Videoclass10.add(new StaticVideoClass("Pink Panther's Magic Tricks ", R.drawable.pink6, "8c07-OC-DxM", "Pink Panther"));

            RecyclerView.LayoutManager llm10 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.PinkRecycler.setLayoutManager(llm10);
            EnglishAdapter RVA10 = new EnglishAdapter(getContext(), Videoclass10);
            binding.PinkRecycler.setAdapter(RVA10);


            binding.OscarRecycler.setHasFixedSize(true);
            binding.OscarRecycler.setItemViewCacheSize(300);
            Videoclass11 = new ArrayList<>();
            Videoclass11.add(new StaticVideoClass(" Oscar's Oasis - NEW FRIEND", R.drawable.oscar6, "GgsnfjYRyrA", "Oscar's  Funny Video"));
            Videoclass11.add(new StaticVideoClass("Oscar's Oasis - CHICKEN SQUAD Funny Cartoons ", R.drawable.oscar5, "HdN2b3b98LA", "Oscar's  Funny Video"));
            Videoclass11.add(new StaticVideoClass(" Oscar's Oasis - CATAPULT Funny Cartoons ", R.drawable.oscar4, "1S97TSCKsXI", "Oscar's  Funny Video"));
            Videoclass11.add(new StaticVideoClass(" Oscar's Oasis - CUCKOO CLOCK Funny Cartoons", R.drawable.oscar3, "Ax-8d653HEw", "Oscar's  Funny Video"));
            Videoclass11.add(new StaticVideoClass(" Oscar's Oasis - HUNTING TIME  _Funny Cartoon ", R.drawable.oscar2, "Xh8sBYQ7SKA", "Oscar's  Funny Video"));
            Videoclass11.add(new StaticVideoClass("Oscar's Oasis - FOOD MAGAZINE _Funny Cartoon  ", R.drawable.oscar1, "DUFOIXcnYW4", "Oscar's  Funny Video"));

            RecyclerView.LayoutManager llm11 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.OscarRecycler.setLayoutManager(llm11);
            FunnyAdapter RVA11 = new FunnyAdapter(getContext(), Videoclass11);
            binding.OscarRecycler.setAdapter(RVA11);


            binding.DoreamonRecycler.setHasFixedSize(true);
            binding.DoreamonRecycler.setItemViewCacheSize(300);
            Videoclass12 = new ArrayList<>();

            Videoclass12.add(new StaticVideoClass("Nobita's Blue Bird ", R.drawable.doraemon3, "iorm5TNkzMQ", "Doraemon"));
            Videoclass12.add(new StaticVideoClass(" 3 Years old Nobita ", R.drawable.doraemon2, "BAgOSOGywVw", "Doraemon"));
            Videoclass12.add(new StaticVideoClass("Touch Glove || Chhune Wale Dastane ", R.drawable.doraemon1, "FuHUvQTWtrw", "Doraemon"));

            Videoclass12.add(new StaticVideoClass(" Apneapp Marne Wala Gas ", R.drawable.doraemon10, "y5KCRCHfvOs", "Doraemon"));
            Videoclass12.add(new StaticVideoClass(" Nobita Mitaye Sabke Jhagre ", R.drawable.doraemon9, "m7HddWphS94", "Doraemon"));
            Videoclass12.add(new StaticVideoClass("Nobita Banega Snail || Snail House ", R.drawable.doraemon8, "CxwJE0miuBY", "Doraemon"));
            Videoclass12.add(new StaticVideoClass("Doraemon new episode Run Nobita Run ", R.drawable.doraemon7, "BXPRBuYq0GE", "Doraemon"));
            Videoclass12.add(new StaticVideoClass("Doraemon new episode  Lots of Pain ", R.drawable.doraemon6, "etbuWB1iguU", "Doraemon"));
            Videoclass12.add(new StaticVideoClass("Make a Genie Lamp || Nobita Banaye Sabko Genie", R.drawable.doraemon5, "qxPW-UxshlA", "Doraemon"));
            Videoclass12.add(new StaticVideoClass("Character Eggs ", R.drawable.doraemon4, "wcmL2Aebzw4", "Doraemon"));

            RecyclerView.LayoutManager llm12 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.DoreamonRecycler.setLayoutManager(llm12);
            FoumasAdapter RVA12 = new FoumasAdapter(getContext(), Videoclass12);
            binding.DoreamonRecycler.setAdapter(RVA12);


            binding.OggyRecycler.setHasFixedSize(true);
            binding.OggyRecycler.setItemViewCacheSize(300);
            Videoclass13 = new ArrayList<>();
            Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches \uD83C\uDFE1 the house is no longer habitable ", R.drawable.upoggy1, "bmQcPgaE4gY", "Oggy and the Cockroaches"));
            Videoclass13.add(new StaticVideoClass(" हिंदी Oggy and the Cockroaches - Oggy’s Double ", R.drawable.oggy1, "01CxHBF0XyU", "Oggy and the Cockroaches"));
            Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - Inside Out  ", R.drawable.oggy2, "qtA2HHr6-BM", "Oggy and the Cockroaches"));
            Videoclass13.add(new StaticVideoClass(" हिंदी Oggy and the Cockroaches - Back To The Past!", R.drawable.oggy3, "E2KWTgEckbk", "Oggy and the Cockroaches"));
            Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - The Abominable SnowRoach ", R.drawable.oggy4, "lRKciQGYwjo", "Oggy and the Cockroaches"));
            Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - Sports Fans", R.drawable.oggy5, "BstW5GDKVMU", "Oggy and the Cockroaches"));
            Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - The Magic Pen", R.drawable.oggy6, "aqcUTX2LsYA", "हिंदी Oggy and the Cockroaches"));
            Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - Joey and the Magic Bean", R.drawable.oggy7, "U_Hyd9_b_Xw", "Oggy and the Cockroaches"));
            Videoclass13.add(new StaticVideoClass("हिंदी Oggy and the Cockroaches - FACE OFF ", R.drawable.oogy8, "uhIpocidbTo", "Oggy and the Cockroaches"));

            RecyclerView.LayoutManager llm13 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.OggyRecycler.setLayoutManager(llm13);
            FoumasAdapter RVA13 = new FoumasAdapter(getContext(), Videoclass13);
            binding.OggyRecycler.setAdapter(RVA13);


            binding.CrackeRecycler.setHasFixedSize(true);
            binding.CrackeRecycler.setItemViewCacheSize(300);
            Videoclass14 = new ArrayList<>();
            Videoclass14.add(new StaticVideoClass("CRACKÉ - BATS! _Cartoon for kids by Squeeze | Funny Kids TV's", R.drawable.creck, "E4XBWuV_ZdA", "Cracke Clamstrap"));
            Videoclass14.add(new StaticVideoClass("CRACKÉ - HOT AIR _Cartoon for kids | Funny Kids TV's", R.drawable.creck2, "JuUp6YgRZ9U", "Cracke Clamstrap"));
            Videoclass14.add(new StaticVideoClass("CRACKÉ - SLINGSHOT _Cartoon for kids | Funny Kids TV's", R.drawable.creck3, "EYv1ZaZtmfI", "Cracke Clamstrap"));
            Videoclass14.add(new StaticVideoClass("CRACKÉ - POLE VAULT _Cartoon for kids | Funny Kids TV's", R.drawable.creck4, "nKbXwCl16R0", "Cracke Clamstrap"));
            Videoclass14.add(new StaticVideoClass("CRACKÉ - GREEN THUMB _Cartoon for kids 30min | Funny Kids TV's", R.drawable.creck5, "Vo0NFJihuLE", "Cracke Clamstrap"));
            Videoclass14.add(new StaticVideoClass("CRACKÉ - CRACKS _Cartoon for kids | Funny Kids TV's", R.drawable.creck6, "HG3loVNSlFg", "Cracke Clamstrap"));

            RecyclerView.LayoutManager llm14 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.CrackeRecycler.setLayoutManager(llm14);
            FunnyAdapter RVA14 = new FunnyAdapter(getContext(), Videoclass14);
            binding.CrackeRecycler.setAdapter(RVA14);

// kise

            binding.MoreoverRecycler.setHasFixedSize(true);
            binding.MoreoverRecycler.setItemViewCacheSize(300);
            Videoclass15 = new ArrayList<>();
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
            Videoclass15.add(new StaticVideoClass("Egg And Bean | Full Episode  ", R.drawable.beam9, "h3YU9vaErsg", "Mr Beam Animatiom"));
            Videoclass15.add(new StaticVideoClass(" Big TV | Full Episode ", R.drawable.beam8, "kH_Vkrwl5xc", "Mr Beam Animatiom"));
            Videoclass15.add(new StaticVideoClass("Double Trouble | Full Episode  ", R.drawable.beam7, "zdQvoqD5BhE", "Mr Beam Animatiom"));
            Videoclass15.add(new StaticVideoClass(" A Royal Makeover | Full Episode ", R.drawable.beam6, "NfDhlatnpDU", "Mr Beam Animatiom"));
            Videoclass15.add(new StaticVideoClass(" Keyboard Capers | Full Episode ", R.drawable.beam5, "YcD0Xp2iNzo", "Mr Beam Animatiom"));
            Videoclass15.add(new StaticVideoClass(" The Visitor | Full Episode", R.drawable.beam4, "Mb3lWAntBik", "Mr Beam Animatiom"));
            Videoclass15.add(new StaticVideoClass("A Running Battle ", R.drawable.beam3, "V2sSalA3AlU", "Mr Beam Animatiom"));
            Videoclass15.add(new StaticVideoClass(" SuperMarrow | Full Episode ", R.drawable.beam2, "H0gWtMYFbsk", "Mr Beam Animatiom"));
            Videoclass15.add(new StaticVideoClass("A Grand Invitation |", R.drawable.beam, "sqPvtYO4JOQ", "Mr Beam Animatiom"));

            RecyclerView.LayoutManager llm15 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.MoreoverRecycler.setLayoutManager(llm15);
            EnglishAdapter RVA15 = new EnglishAdapter(getContext(), Videoclass15);
            binding.MoreoverRecycler.setAdapter(RVA15);


            binding.batizaRecycler.setHasFixedSize(true);
            binding.batizaRecycler.setItemViewCacheSize(300);
            Videoclass16 = new ArrayList<>();
            Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 10 | Funny Animated Stories", R.drawable.bhatija1, "ZwgMJ-APswg", "Chacha Bhatija"));
            Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 09 | Funny Animated Stories", R.drawable.bhatija, "T3VnlPKQbck", "Chacha Bhatija"));
            Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 08 | Funny Animated Stories", R.drawable.bhatija3, "3pjpFMzIu3s", "Chacha Bhatija"));
            Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 07 | Funny Animated Stories ", R.drawable.bhatija4, "oBdDqbAHt28", "Chacha Bhatija"));
            Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 06 | Funny Animated Stories ", R.drawable.bhatija5, "CYFO3o-MAaY", "Chacha Bhatija"));
            Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 05 | Funny Animated Stories", R.drawable.bhatija6, "t2v8ObmdGbM", "Chacha Bhatija"));
            Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 04 | Funny Animated Stories", R.drawable.bhatija7, "XFjM_0-qJog", "Chacha Bhatija"));
            Videoclass16.add(new StaticVideoClass("Chacha Bhatija | Compilation 03 | Funny Animated Stories", R.drawable.bhatija8, "CjPLRvcQQ8A", "Chacha Bhatija"));


            RecyclerView.LayoutManager llm16 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.batizaRecycler.setLayoutManager(llm16);
            HindiBestAdapter RVA16 = new HindiBestAdapter(getContext(), Videoclass16);
            binding.batizaRecycler.setAdapter(RVA16);


            binding.BanglacartoonRecycler.setHasFixedSize(true);
            binding.BanglacartoonRecycler.setItemViewCacheSize(300);
            Videoclass17 = new ArrayList<>();
            Videoclass17.add(new StaticVideoClass("SONALI MAACH STORY OF THAKURMAR JHULI | FAIRY TALES IN BENGALI ", R.drawable.bangla3, "EdIP4zODsfw", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("SONAR KHIDE – BANGLA RUPKOTHA ", R.drawable.bangla5, "V8X9pJ_m_xg", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("JADUR JHOLA /- THAKURMAR JHULI | Comedy Story  ", R.drawable.bangla8, "HrYkdS8L7lA", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("BHAGGYER DAAN  | FAIRY TALES IN BENGALI ", R.drawable.bangla1, "OLims6RKZgA", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("DUI MAYER EK CHELE ||  Bengali Fairy Tales |", R.drawable.bangla2, "PZxXVolDFCc", "FAIRY TALES IN BENGALI"));

            Videoclass17.add(new StaticVideoClass("SAT BAMON O JADU AYNA – RUPKOTHAR GOLPO | Story of Magical Mirror", R.drawable.bangla4, "S7Caw596yiw", "FAIRY TALES IN BENGALI"));

            Videoclass17.add(new StaticVideoClass("NOONER GOON STORY OF THAKURMAR JHULI | FAIRY TALES IN BENGALI", R.drawable.bangla6, "SYAiX19MAnw", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("PORISROMER MULLYO STORY OF THAKURMAR JHULI, THE FAIRY TALES IN BENGALI ", R.drawable.bangla7, "-9pDi3LuclE", "FAIRY TALES IN BENGALI"));

            Videoclass17.add(new StaticVideoClass("BANGLA RUPKOTHAR GOLPO LOVI GHEE OWALA ", R.drawable.bangla9, "LY3auvKRjSQ", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass(" BANGLA RUPKOTHAR JUTO ABISHKAR", R.drawable.bangla10, "KQH2kjXlvx0", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("ICCHAPURON - THAKURMAR JHULIR HASIR GOLPO", R.drawable.bangla11, "woL0XN3WbnA", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("MAKHON BABUR KIPTEMI – BANGLA RUPKOTHAR GOLPO CARTOON", R.drawable.bangla12, "WgKD6mstQdw", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("MURKHO PONDIT || HASIR GOLPO || MOJAR BANGAL CARTOON ", R.drawable.bangla13, "75YlvzVoRxE", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("MALAI KULPI  || Bengali Adhunik Rupkotha", R.drawable.bangla14, "80b6ghecKMk", "FAIRY TALES IN BENGALI"));
            Videoclass17.add(new StaticVideoClass("BUDDHIMAAN KE ? Mojar Bangla Cartoon Video", R.drawable.bangla15, "4xraFuxBy", "FAIRY TALES IN BENGALI"));

            RecyclerView.LayoutManager llm17 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.BanglacartoonRecycler.setLayoutManager(llm17);
            BanglaAdapter RVA17 = new BanglaAdapter(getContext(), Videoclass17);
            binding.BanglacartoonRecycler.setAdapter(RVA17);


            binding.HindiRupkothaRecycler.setHasFixedSize(true);
            binding.HindiRupkothaRecycler.setItemViewCacheSize(300);
            Videoclass18 = new ArrayList<>();
            Videoclass18.add(new StaticVideoClass("हाथी राजा और चालाक चिड़िया | Elephant King & Clever Sparrow ", R.drawable.hindi1, "0yG22xwi2p4", "Hindi Stories"));
            Videoclass18.add(new StaticVideoClass("लालची बेटा और जादुई कंगन | Greedy Son & Magical Bracelet", R.drawable.hindi2, "mUZXGNEY8Sw", "Hindi Stories"));
            Videoclass18.add(new StaticVideoClass("लाल टमाटर | Lal Tamatar - Red Tomato | Hindi Kahaniya | Stories in Hindi", R.drawable.hindi3, "1Eo3PV2QrQ4", "Hindi Stories"));
            Videoclass18.add(new StaticVideoClass("बदसूरत बतख़ | Ugly little Duck |  Hindi Kahaniya  ", R.drawable.hindi4, "4_WEx8IUmAI", "Hindi Stories"));
            Videoclass18.add(new StaticVideoClass("रेल गाडी | Aloo kachaloo beta On chuk chuk rail gadi |  Hindi Kahaniya", R.drawable.hindi5, "Zunb3bx1Db4", "Hindi Stories"));
            Videoclass18.add(new StaticVideoClass("चालू पड़ोसी | Cunning neighbour and his tricks |  Hindi Kahaniya ", R.drawable.hindi6, "N8CW3o0A52U", "Hindi Stories"));
            Videoclass18.add(new StaticVideoClass("मम्मी की रोटी गोल गोल | Mummy ki Roti gol gol by Aloo Kachaloo ", R.drawable.hindi7, "VZapYlhnWGo", "Hindi Stories"));
            Videoclass18.add(new StaticVideoClass("जादुई पेड़ | Magical tree with golden mangoes |  Hindi Kahaniya", R.drawable.hindi8, "Dhim17XTu0o", "Hindi Stories"));


            RecyclerView.LayoutManager llm18 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.HindiRupkothaRecycler.setLayoutManager(llm18);
            HindiAdapter RVA18 = new HindiAdapter(getContext(), Videoclass18);
            binding.HindiRupkothaRecycler.setAdapter(RVA18);


            binding.janCartoonRecycler.setHasFixedSize(true);
            binding.janCartoonRecycler.setItemViewCacheSize(300);
            Videoclass19 = new ArrayList<>();
            Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Meri Mehnati Ammi", R.drawable.jan1, "lEuUdg70GFY", "Jan cartoon"));
            Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Farhan Uncle  ", R.drawable.jan2, "cAEMyHRXR9k", "Jan cartoon"));
            Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Chips  ", R.drawable.jan3, "h_QqIDASA0E", "Jan cartoon"));
            Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Ghar Mein Kon Hai ", R.drawable.jan4, "lUW3YEPE4hY", "Jan cartoon"));
            Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Cushions Ka Ghar", R.drawable.jan5, "zwyQwB85oFY", "Jan cartoon"));
            Videoclass19.add(new StaticVideoClass("Jan Cartoon in Urdu || Murghay Wala Lollipop ", R.drawable.jan6, "qxF1c_CKNxg", "Jan cartoon"));

            RecyclerView.LayoutManager llm19 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.janCartoonRecycler.setLayoutManager(llm19);
            HindiAdapter RVA19 = new HindiAdapter(getContext(), Videoclass19);
            binding.janCartoonRecycler.setAdapter(RVA19);


            binding.MickeyRecycler.setHasFixedSize(true);
            binding.MickeyRecycler.setItemViewCacheSize(300);
            Videoclass20 = new ArrayList<>();
            Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse , Coconutty Monkey", R.drawable.mickey, "U4o51T1Jous", "Micky Mouse"));
            Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse Donald's Ducks", R.drawable.mickey2, "Av0BRdnIzC8", "Micky Mouse"));
            Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse Playmate", R.drawable.mickey3, "vPz9sxKt-JY", "Micky Mouse"));
            Videoclass20.add(new StaticVideoClass(" Mickey Mouse Clubhouse  Minnie's Bee Story", R.drawable.mickey4, "xjM9BBGj23g", "Micky Mouse"));

            //null pic
            Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse  Pete's Beach Blanket Luau", R.drawable.mickey4, "", "Micky Mouse"));
            Videoclass20.add(new StaticVideoClass("Mickey Mouse Mickey's Message from Mars", R.drawable.mickey6, "8ayf340Blyc", "Micky Mouse"));
            Videoclass20.add(new StaticVideoClass("Mickey Mouse Clubhouse  Pluto's Bubble Bath", R.drawable.mickey7, "P7w7W_T8bOA", "Micky Mouse"));
            Videoclass20.add(new StaticVideoClass("Mouse Clubhouse Secret Spy Daisy18", R.drawable.mickey8, "umxRkctOIyw", "Micky Mouse"));
            RecyclerView.LayoutManager llm20 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.MickeyRecycler.setLayoutManager(llm20);
            EnglishAdapter RVA20 = new EnglishAdapter(getContext(), Videoclass20);
            binding.MickeyRecycler.setAdapter(RVA20);


            binding.PokemonRecycler.setHasFixedSize(true);
            binding.PokemonRecycler.setItemViewCacheSize(300);
            Videoclass21 = new ArrayList<>();
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP12 | To Catch A Pokémon Smuggler! ", R.drawable.pokemon1, "Nn-BZvf0YXk", "Pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP11 | The Bamboozling Forest!", R.drawable.pokemon2, "vqqz1JF5tNU", "Pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP09 Clemont'S Got A Secret", R.drawable.pokemon3, "4Xvr3Ki5IZo", "Pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP10 Mega-Mega Meowth Madness ", R.drawable.pokemon4, "98SNT6EM-LY", "Pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP08 Grooming Furfrou", R.drawable.pokemon5, "daTOwgPy8eY", "pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP07 Giving Chase At The Rhyhorn Race", R.drawable.pokemon6, "QLi-ltwttuQ", "Pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP06 Battling On Thin Ice!", R.drawable.pokemon7, "XLmPtcxcizI", "Pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP05 A Blustery Santalune Gym Battle! ", R.drawable.pokemon8, "sM07PnC01ag", "Pokemon"));
            Videoclass21.add(new StaticVideoClass(" Pokémon the Series: XY | EP04 A Shockingly Cheeky Friendship", R.drawable.pokemon9, "ovfEB4AlstU", "Pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY | EP03 A Battle Of Aerial Mobility", R.drawable.pokemon10, "r7a3Aa4zUy4", "pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP02 Lumiose City Pursuit!", R.drawable.pokemon11, "BZ3eAj4LHKo", "pokemon"));
            Videoclass21.add(new StaticVideoClass("Pokémon the Series: XY| EP01 Kalos, Where Dreams And Adventures Begin", R.drawable.pokemon12, "wq8d8R8gin4", "pokemon"));

            RecyclerView.LayoutManager llm21 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.PokemonRecycler.setLayoutManager(llm21);
            FoumasAdapter RVA21 = new FoumasAdapter(getContext(), Videoclass21);
            binding.PokemonRecycler.setAdapter(RVA21);


            binding.BenRecycler.setHasFixedSize(true);
            binding.BenRecycler.setItemViewCacheSize(300);
            Videoclass22 = new ArrayList<>();
            Videoclass22.add(new StaticVideoClass("Ben 10 | Top Heatblast Moments (Hindi) ", R.drawable.ben1, "22QCfc_Ev2Y", "Ben 10)"));
            Videoclass22.add(new StaticVideoClass("Ben 10 | Greatest Villains & Foes Part 1 (Hindi) ", R.drawable.ben2, "9-wITfebwaY", "Ben 10"));
            Videoclass22.add(new StaticVideoClass("Ben 10 | Best Alien Battles Compilation (Hindi)", R.drawable.ben3, "rgx7LiDlo18", "Ben 10"));
            Videoclass22.add(new StaticVideoClass("Ben 10 | Rustbucket Moments (Hindi) ", R.drawable.ben4, "HtgXGm6rvE8", "Ben 10"));
            Videoclass22.add(new StaticVideoClass("Ben 10 | Funny Moments Compilation \uD83D\uDE02 (Hindi)", R.drawable.ben5, "tihfHoWCe-4", "Ben 10"));
            Videoclass22.add(new StaticVideoClass("Ben 10 | Ben VS Monsters (Hindi)", R.drawable.ben6, "UiAGdDIM8Pg", "Ben 10)"));
            Videoclass22.add(new StaticVideoClass("Ben 10 | Ben's Best Alien Battles - Part 2 (Hindi)", R.drawable.ben7, "IfCNddqEwu4", "Ben 10"));
            Videoclass22.add(new StaticVideoClass("Ben 10 | Top Stinkfly Moments (Hindi) ", R.drawable.ben8, "jhFfh0cd8TI", "Ben 10"));
            Videoclass22.add(new StaticVideoClass("Ben 10 | Greatest Villains & Foes - Part 2 (Hindi) ", R.drawable.ben9, "AjdtCJs44L4", "Ben 10"));
            Videoclass22.add(new StaticVideoClass("Ben 10 | Best Four Arms Moments (Hindi)", R.drawable.ben10, "kfbmvD6qnNQ", "Ben 10"));

            RecyclerView.LayoutManager llm22 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.BenRecycler.setLayoutManager(llm22);
            FoumasAdapter RVA22 = new FoumasAdapter(getContext(), Videoclass22);
            binding.BenRecycler.setAdapter(RVA22);


            binding.SimbaRecycler.setHasFixedSize(true);
            binding.SimbaRecycler.setItemViewCacheSize(300);
            Videoclass23 = new ArrayList<>();
            Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 1", R.drawable.simba1, "kRMd1sYJeKU", "Simba The Lion King"));
            Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 2", R.drawable.simba2, "5gbKOV-S5ZU", "Simba The Lion King"));
            Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 3", R.drawable.simba3, "pavkDawGiRg", "Simba The Lion King"));
            Videoclass23.add(new StaticVideoClass(" Simba - The Lion King | Jungle Stories In Hindi 4", R.drawable.simba4, "BIRSQBefuUg", "Simba The Lion King"));
            Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 5", R.drawable.simba5, "DtvlBIyRIDk", "Simba The Lion King"));
            Videoclass23.add(new StaticVideoClass("Simba - The Lion King | Jungle Stories In Hindi 6", R.drawable.simba6, "MleeBeRmUGA", "Simba The Lion King"));

            RecyclerView.LayoutManager llm23 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.SimbaRecycler.setLayoutManager(llm23);
            HindiAdapter RVA23 = new HindiAdapter(getContext(), Videoclass23);
            binding.SimbaRecycler.setAdapter(RVA23);


            binding.ChothabheemRecycler.setHasFixedSize(true);
            binding.ChothabheemRecycler.setItemViewCacheSize(300);
            Videoclass24 = new ArrayList<>();

            Videoclass24.add(new StaticVideoClass("Chhota Bheem -  Raju in Trouble | Icchadhari Naag ke Kahani | ",R.drawable.bheem2,"D545lW6mFb0","Chhota Bheem"));
            Videoclass24.add(new StaticVideoClass("Chhota Bheem - Itni Garmi Kyun Hai? | Hindi Cartoon for Kids",R.drawable.bheem3,"LBnsFd7U1Nc","Chhota Bheem"));
            Videoclass24.add(new StaticVideoClass("Chhota Bheem - Best Gift for Christmas",R.drawable.bheem4,"esEh_DSJzx4","Chhota Bheem"));


            Videoclass24.add(new StaticVideoClass("Super Bheem - The Sky Wars", R.drawable.upchhota1, "9zhs5pm2rdw", "Chhota Bheem"));
            Videoclass24.add(new StaticVideoClass("Chhota Bheem - Dholakpur Mein Chor | Cartoon for Kids in Hindi", R.drawable.upchhota2, "z88EpUVYSLE", "Chhota Bheem"));

            Videoclass24.add(new StaticVideoClass("Chhota Bheem - Holi in Vrindavan | Holi Special Video Song", R.drawable.chhota1, "6NWb8X3i3Mc", "Chhota Bheem"));
            Videoclass24.add(new StaticVideoClass("Chhota Bheem aur Hanuman | Mahabali Hanuman in Bheemayan", R.drawable.chhota2, "T_f2yfUrOKc", "Chhota Bheem"));
            Videoclass24.add(new StaticVideoClass(" Super Bheem VS Kirmada | Sky Dragon ke Raksha - Full Video in Hindi", R.drawable.chhota3, "5KJ-_6sZ4Zs", "Chhota Bheem"));
            Videoclass24.add(new StaticVideoClass("Chhota Bheem - Mysterious Cube", R.drawable.chhota4, "W73xnTZZnWA", "Chhota Bheem"));
            Videoclass24.add(new StaticVideoClass("Team Chhota Bheem Vs Team Mighty - Master Chef Competition ", R.drawable.chhota5, "-_sXY8_eIIc", "Chhota Bheem"));

            RecyclerView.LayoutManager llm24 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.ChothabheemRecycler.setLayoutManager(llm24);
            HindiBestAdapter RVA24 = new HindiBestAdapter(getContext(), Videoclass24);
            binding.ChothabheemRecycler.setAdapter(RVA24);


            binding.VirbanglaRecycler.setHasFixedSize(true);
            binding.VirbanglaRecycler.setItemViewCacheSize(300);
            Videoclass25 = new ArrayList<>();
            Videoclass25.add(new StaticVideoClass("Vir The Robot Boy Bangla Cartoons| Gintu Ki Boxing |", R.drawable.virbangla1, "8iLCT941vQE", "Vir The Robot boy"));
            Videoclass25.add(new StaticVideoClass("The Robot Boy|  Vir Vs Robotic Piranha ", R.drawable.virbangla2, "lWgNTEVoLIw", "Vir The Robot boy"));
            Videoclass25.add(new StaticVideoClass("Vir: The Robot Boy | Bangla Cartoons| Blob Attack", R.drawable.virbangla3, "xDp-Wpk3dB4", "Vir The Robot boy"));
            Videoclass25.add(new StaticVideoClass("Vir: The Robot Boy  | Bangla Cartoons| Vir Ek Villian ", R.drawable.virbangla4, "8BEW__G8w6M", "Vir The Robot boy"));
            Videoclass25.add(new StaticVideoClass("Vir: The Robot BoyVir Vs Giant Bug ", R.drawable.virbangla5, "vLkEqIPEIV0", "Vir The Robot boy"));

            RecyclerView.LayoutManager llm25 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.VirbanglaRecycler.setLayoutManager(llm25);
            BanglaAdapter RVA25 = new BanglaAdapter(getContext(), Videoclass25);
            binding.VirbanglaRecycler.setAdapter(RVA25);


            binding.jungleRecycler.setHasFixedSize(true);
            binding.jungleRecycler.setItemViewCacheSize(300);
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

            RecyclerView.LayoutManager llm26 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.jungleRecycler.setLayoutManager(llm26);
            HindiAdapter RVA26 = new HindiAdapter(getContext(), Videoclass26);
            binding.jungleRecycler.setAdapter(RVA26);


            binding.rodraRecycler.setHasFixedSize(true);
            binding.rodraRecycler.setItemViewCacheSize(300);
            Videoclass27 = new ArrayList<>();
            Videoclass27.add(new StaticVideoClass("Rudra | Season 3 | Episode 307 | Planets In Danger", R.drawable.rudra1, "wHKc5qsUSSg", "Rudra"));
            Videoclass27.add(new StaticVideoClass("Rudra | Season 3 | Episode 306 | Trap Of Manimals", R.drawable.rudra2, "Z_S1qO5eSv8", "Rudra "));
            Videoclass27.add(new StaticVideoClass("Rudra | Season 3 | Episode 305 | Marina's Birthday", R.drawable.rudra3, "86_u_CRP_Dc", "Rudra"));
            Videoclass27.add(new StaticVideoClass("Rudra | Season 3 | Episode 304 | Rudra In Monkey's Kingdom", R.drawable.rudra4, "rXcAzd7XgXU", "Rudra "));
            Videoclass27.add(new StaticVideoClass("Rudra | Season 3 | Episode 303 | Race With Wolves", R.drawable.rudra5, "FTHcVMPA73U", "Rudra"));
            Videoclass27.add(new StaticVideoClass("Rudra | Season 3 | Episode 302 | Sea Pirates", R.drawable.rudra7, "UvVOXnpT5iA", "Rudra"));
            Videoclass27.add(new StaticVideoClass("Rudra | Season 3 | Episode 301 | Dam On River Joy Land", R.drawable.rudra7, "QItxIjUPGnU", "Rudra "));


            RecyclerView.LayoutManager llm27 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.rodraRecycler.setLayoutManager(llm27);
            RSMAdapter RVA27= new RSMAdapter(getContext(), Videoclass27);
            binding.rodraRecycler.setAdapter(RVA27);





            binding.shivaRecycler.setHasFixedSize(true);
            binding.shivaRecycler.setItemViewCacheSize(300);
            Videoclass28 = new ArrayList<>();
            Videoclass28.add(new StaticVideoClass("Shiva | शिवा | The Ghost School |", R.drawable.shiva1, "uIVJTyiMzDI", "Shiva"));
            Videoclass28.add(new StaticVideoClass("Shiva | शिवा | The Underwater Tunnel ", R.drawable.shiva2, "4kebiusKNTw", "Shiva "));
            Videoclass28.add(new StaticVideoClass("Shiva | शिवा | The Highway Robbers", R.drawable.shiva3, "LgdDaZBTePY", "Shiva"));
            Videoclass28.add(new StaticVideoClass("Shiva | शिवा | Nuclear Formula ", R.drawable.shiva4, "bCguTDmTrsk", "Shiva "));
            Videoclass28.add(new StaticVideoClass("Shiva | शिवा | The Folding Tank", R.drawable.shiva5, "7-RMOBHtaNQ", "Shiva"));
            Videoclass28.add(new StaticVideoClass("Shiva | शिवा | The Little Thieves |", R.drawable.shiva6, "u8vgYzSH3pk", "Shiva"));
            Videoclass28.add(new StaticVideoClass("Shiva | शिवा | Dr. Earthquake ", R.drawable.shiva7, "nffcDoOSGJI", "Shiva "));
            Videoclass28.add(new StaticVideoClass("Shiva | शिवा | Giant Bats", R.drawable.shiva7, "jc72a5y-j6A", "Shiva"));

            RecyclerView.LayoutManager llm28 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.shivaRecycler.setLayoutManager(llm28);
            RSMAdapter RVA28 = new RSMAdapter(getContext(), Videoclass28);
            binding.shivaRecycler.setAdapter(RVA28);



            binding.motupatluRecycler.setHasFixedSize(true);
            binding.motupatluRecycler.setItemViewCacheSize(300);
            Videoclass29 = new ArrayList<>();
            Videoclass29.add(new StaticVideoClass("Motu Patlu | Season 5 |  मोटू पतलू | Glass Man Alien ", R.drawable.motun1, "_dT6HACgxcs", "Motu Patlu"));
            Videoclass29.add(new StaticVideoClass("Motu Patlu | Season 5 |  मोटू पतलू | Body Control Machine", R.drawable.motun2, "h2R2gyu6n64", "Motu Patlu "));
            Videoclass29.add(new StaticVideoClass("Motu Patlu | Season 5 |  मोटू पतलू | Chalaak John ", R.drawable.motun2, "1B3R3GG_cVE", "Motu Patlu"));
            Videoclass29.add(new StaticVideoClass("Motu Patlu | Season 5 |  मोटू पतलू | Jaadoogarni Ka Seb ", R.drawable.motun3, "oJwiTrc_jVY", "Motu Patlu "));
            Videoclass29.add(new StaticVideoClass("Motu Patlu | Season 5 |  मोटू पतलू | John's Certificate", R.drawable.motun4, "aWFpfBTFYRo", "Motu Patlu"));
            Videoclass29.add(new StaticVideoClass("Motu Patlu | Season 5 | मोटू पतलू | Badhti Ka Naam Dadhi", R.drawable.motun5, "ub_KGSW3bOk", "Motu Patlu"));
            Videoclass29.add(new StaticVideoClass("Motu Patlu | Season 5 |  मोटू पतलू | Dayawan Motu", R.drawable.motun6, "r_z3TUkcPPc", "Motu Patlu "));
            Videoclass29.add(new StaticVideoClass("Motu Patlu | Season 5 |  मोटू पतलू | Alien Ball", R.drawable.motun7, "eoCPdhLDCP0", "Motu Patlu"));
            RecyclerView.LayoutManager llm29 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
            binding.motupatluRecycler.setLayoutManager(llm29);
            RSMAdapter RVA29 = new RSMAdapter(getContext(), Videoclass29);
            binding.motupatluRecycler.setAdapter(RVA29);

    }
//// ALL CETAGORY


//            private void gridLIst() {
//                    imagePojoArrayList=new ArrayList<>();
//                    imagePojoArrayList.add(new ImageClass(R.drawable.hindi8,"Hindi Stories"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.bhatija5,"Chacha Bhatija"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.oggy5,"Oggy"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.larva4,"Larva Funny"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.bangla4,"Bangla Cartoon"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.jan5,"Jan Cartoon "));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.doraemon4,"Doreamon"));
////7
//                    imagePojoArrayList.add(new ImageClass(R.drawable.pinl5,"pink Panther"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.simba3,"Simba The Lion King"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.beam5,"Mr, Beam Animation"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.creck4,"Cracke Clamstrap"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.looney2,"Looney Touns"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.mickey8,"Mickey Mouse"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.chhota5,"Chotta Bheem"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.book7,"Jungle Book"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.vir5,"Vir The Roobt  Boy"));
////16
//                    imagePojoArrayList.add(new ImageClass(R.drawable.ben3,"Ben 10 "));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.pokemon5,"pokemon"));
//
//
//                    imagePojoArrayList.add(new ImageClass(R.drawable.moral6,"Hindi Moral Stories"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.kisna,"Roll Number 21"));
//
//                    imagePojoArrayList.add(new ImageClass(R.drawable.motuhindi4,"Motu Patlu"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.masha5,"Masha And Bhear"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.oscar3,"Oscar Funny Video"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.virbangla3,"Vir Bangla"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.tom6,"Tom And Jerry"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.baludablu,"Bablu Dablu"));
//                    imagePojoArrayList.add(new ImageClass(R.drawable.little5,"Little Bheem"));
//
//
//
//
//
//
//
//            }




    private void english() {
        binding.MashaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.masha);
            }
        });
        binding.Littlebheem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.littlebheem);

            }
        });
        binding.LooneyTounsTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.looney);

            }
        });
        binding.LarvaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.larva);

            }
        });
        binding.Tomtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.tom);
            }
        }); binding.pinkTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.pink);
            }
        });
        binding.OscarTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.oscar);

            }
        });

        binding.CrackeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.cracke);
            }
        });
        binding.MoreoverTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.moreOver);

            }
        });



    }
    private void hindi() {

        binding.virTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.virHindi);

            }
        });
//        binding.MotuPatluTv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Navigation.findNavController(v).navigate(R.id.motupatlu);
//
//            }
//        });
        binding.ChothabheemTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.chottabheem);

            }
        });



        binding.hindiStoryTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.hindistoris);

            }
        });
        binding.BabluDabluTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.babluDablu);

            }
        });
        binding.DoreamonTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.doreamon);

            }
        }); binding.OggyTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.oggy);
            }
        });
        binding.batizaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.dragonball);
            }
        });
        binding.janCartoonTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.janCartoon);
            }
        });



        binding.PokemonTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.pokemon);
            }
        });


    }
    private void bangla() {
        binding.VirbanglaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.virbangla);

            }
        });
        binding.BanglacartoonTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.banglarupkotha);

            }
        });
        binding.HindiRupkothaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.hindiruplotha);

            }
        });
        binding.SimbaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.simba);
            }
        });
        binding.MickeyTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.micky);

            }
        });
        binding.benTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.benteen);
            }
        });
        binding.jungleTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.joungleBook);
            }
        });
//            binding.AllTv.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                            Navigation.findNavController(v).navigate(R.id.nav_slideshow);
//                    }
//            });


            binding.rodraTv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                            Navigation.findNavController(v).navigate(R.id.rudra);
                    }
            });

            binding.shivaTv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                            Navigation.findNavController(v).navigate(R.id.shiva);
                    }
            });
            binding.motupatluTv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                            Navigation.findNavController(v).navigate(R.id.motupatluNew);
                    }
            });


    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This callback will only be called when MyFragment is at least Started.
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                //ca-app-pub-3940256099942544/1033173712
                //
                // Handle the back button event
//                NavHostFragment.findNavController(getParentFragment()).navigateUp();
                showExitDialog();




            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);

        // The callback can be enabled or disabled here or in handleOnBackPressed()
    }
    void showExitDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        requireActivity().finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }


        private void picupadapter() {
                List<SliderItem> sliderItemList = new ArrayList<>();

                sliderItemList.add(new SliderItem());


                for (int i = 0; i < 14; i++) {

                        SliderItem sliderItem = new SliderItem();

                        switch (i) {
                                case 0:

                                        sliderItem.setImageUrl(R.drawable.upchhota1);

                                        sliderItem.setDescription("Super Bheem - The Sky Wars");
                                        sliderItem.setId("9zhs5pm2rdw");
                                        break;
                                case 1:

                                        sliderItem.setImageUrl(R.drawable.oggy4);
                                        sliderItem.setDescription("हिंदी Oggy and the Cockroaches - The Abominable SnowRoach");
                                        sliderItem.setId("lRKciQGYwjo");
                                        break;
                                case 2:

                                        sliderItem.setImageUrl(R.drawable.oscar3);
                                        sliderItem.setDescription("Oscar's Oasis - CUCKOO CLOCK Funny Cartoons ");
                                        sliderItem.setId("Ax-8d653HEw");
                                        break;
                                case 3:

                                        sliderItem.setImageUrl(R.drawable.larva3);
                                        sliderItem.setDescription("LARVA - THE LAST POPCORN");
                                        sliderItem.setId("hoYeZ3W92ic");

                                        break;


                                case 4:
                                        sliderItem.setImageUrl(R.drawable.oscar4);
                                        sliderItem.setDescription("Oscar's Oasis - CATAPULT Funny Cartoons ");
                                        sliderItem.setId("1S97TSCKsXI");
                                        break;
                                case 5:
                                        sliderItem.setImageUrl(R.drawable.bangla4);
                                        sliderItem.setDescription("SAT BAMON O JADU AYNA – RUPKOTHAR GOLPO | Story of Magical Mirror");
                                        sliderItem.setId("S7Caw596yiw");
                                        break;


                                case 6:

                                        sliderItem.setImageUrl(R.drawable.chhota6);
                                        sliderItem.setDescription("Bheem's Mightiest Moments \uD83C\uDFCB️\\u200d♂");
                                        sliderItem.setId("j2BuT9ET-f8");
                                        break;
                                case 7:

                                        sliderItem.setImageUrl(R.drawable.little4);
                                        sliderItem.setDescription("Diwali Fireworks & Treasure Chest \uD83C\uDF86Mighty Little Bheem ");
                                        sliderItem.setId("hQNSgrY_e5g");
                                        break;

                                case 8:
                                        sliderItem.setImageUrl(R.drawable.little7);
                                        sliderItem.setDescription("Bheem, the Dancing Machine \uD83C\uDFB6 Mighty Little Bheem");
                                        sliderItem.setId("x9SoDWpSg4k");
                                        break;
                                case 9:

                                        sliderItem.setImageUrl(R.drawable.mickey7);
                                        sliderItem.setDescription("Mickey Mouse Clubhouse  Pluto's Bubble Bath");
                                        sliderItem.setId("P7w7W_T8bOA");
                                        break;

                                case 10:
                                        sliderItem.setImageUrl(R.drawable.bear4);
                                        sliderItem.setDescription("Masha and The Bear - Laundry Day");
                                        sliderItem.setId("X6Hur8jbfNo");
                                        break;
                                case 11:

                                        sliderItem.setImageUrl(R.drawable.pokemon12);
                                        sliderItem.setDescription("Pokémon the Series: XY| EP01 Kalos, Where Dreams And Adventures Begin");
                                        sliderItem.setId("wq8d8R8gin4");
                                        break;
                                case 12:

                                        sliderItem.setImageUrl(R.drawable.bablu4);
                                        sliderItem.setDescription("Bablu Dablu In Hindi Big Magic | Neend Ka Bukhar");
                                        sliderItem.setId("jCf-0pZtwc0");
                                        break;
                                case 13:
                                        sliderItem.setImageUrl(R.drawable.ben5);
                                        sliderItem.setDescription("Ben 10 | Funny Moments Compilation \uD83D\uDE02 (Hindi)");
                                        sliderItem.setId("ben5");
                                        break;

                        }
                        sliderItemList.add(sliderItem);

                        adapter.renewItems(sliderItemList);


                        //      }


                }


        }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


//        @Override
//        public void onStart() {
//                super.onStart();
//
//
//                ConnectivityManager connMgr = (ConnectivityManager)requireContext().getSystemService(Context.CONNECTIVITY_SERVICE);
//                NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
//
//                if (networkInfo != null && networkInfo.isConnected()) {
//                        // fetch data
//                } else {
//                        new AlertDialog.Builder(getContext())
//                                .setTitle("Connection Failure")
//                                .setMessage("Please Connect to the Internet")
//                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
//                                        public void onClick(DialogInterface dialog, int which) {
//                                        }
//                                })
//                                .setIcon(android.R.drawable.ic_dialog_alert)
//                                .show();
//                }
//        }


        private void checkConnectivity() {
//                boolean enabled = true;

                ConnectivityManager connectivityManager = (ConnectivityManager) requireContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo info = connectivityManager.getActiveNetworkInfo();

                if ((info == null || !info.isConnected() || !info.isAvailable())) {

                        new AlertDialog.Builder(getContext())
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