package com.rakibstudiohindicartoontv.hindicartoontv;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private AppBarConfiguration mAppBarConfiguration;
    private boolean isExit = false;
    private Button yes, no;
    DrawerLayout drawer;
    NavigationView navigationView;
    View view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//

        setContentView(R.layout.activity_main);

        // Get the Main relative layout of the entire activity
        RelativeLayout mainLayout = (RelativeLayout)findViewById(R.id.lll);
// Define StartApp Banner
//        Banner startAppBanner = new Banner(getApplicationContext());
//        RelativeLayout.LayoutParams bannerParameters =
//                new RelativeLayout.LayoutParams(
//                        RelativeLayout.LayoutParams.WRAP_CONTENT,
//                        RelativeLayout.LayoutParams.WRAP_CONTENT);
//        bannerParameters.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        bannerParameters.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
//// Add to main Layout
//        mainLayout.addView(startAppBanner, bannerParameters);



//
//        StartAppAd.showSplash(this, savedInstanceState,
//                new SplashConfig()
//                        .setTheme(SplashConfig.Theme.BLAZE)
//                        .setAppName("Hindi Cartoon TV")
//                        .setLogo(R.drawable.splash)   // resource ID
//                        .setOrientation(SplashConfig.Orientation.PORTRAIT)
//        );

//        StartAppAd.showSplash(this, savedInstanceState,
//                new SplashConfig()
//                        .setTheme(SplashConfig.Theme.USER_DEFINED)
//                        .setCustomScreen(R.layout.activity_flash)
//        );

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);



        navigationView.setNavigationItemSelectedListener(this);
        View headerView = navigationView.getHeaderView(0);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.insertDataFragment, R.id.insertDataFragment,R.id.rateapps,R.id.share)
//                .setDrawerLayout(drawer)
//                .build();


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.teal_700));
        drawer.addDrawerListener(toggle);
        toggle.syncState();


//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(MenuItem menuItem) {
//                navigationView.getMenu().findItem(0).setChecked(true);
//
//
//
//                return true;
//            }
//        });
//
//

    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                Navigation.findNavController(this, R.id.nav_host_fragment_content_main)
                        .navigate(R.id.nav_home);
                break;
            case R.id.nav_slideshow:
                Navigation.findNavController(this, R.id.nav_host_fragment_content_main)
                        .navigate(R.id.nav_slideshow);
                break;

            case R.id.about:
                Navigation.findNavController(this, R.id.nav_host_fragment_content_main)
                        .navigate(R.id.about);
                break;


            case R.id.ratapps:


//                final String appPackageName = "com.rakibStudio.KidsShow";

                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" +this.getPackageName())));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" +this.getPackageName())));
                }
                break;

            case R.id.share:


                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "https://play.google.com/store/apps/details?id=" +this.getPackageName());
                sendIntent.setType("text/plain");
                startActivity(sendIntent);


                break;
            case R.id.nav_privacy:

                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://bsoftsv.blogspot.com/p/privacy-policy_5.html")));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://bsoftsv.blogspot.com/p/privacy-policy_5.html")));
                }
                break;


//            case R.id.more:
//
//                try {
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=4641469587307699435&hl=en")));
//                } catch (android.content.ActivityNotFoundException anfe) {
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=4641469587307699435&hl=en")));
//                }
//                break;


            case R.id.nav_exit:
                showExitDialog();
                break;



        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    void showExitDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
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




}