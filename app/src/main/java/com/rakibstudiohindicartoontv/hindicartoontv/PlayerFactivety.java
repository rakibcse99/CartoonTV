package com.rakibstudiohindicartoontv.hindicartoontv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.rakibstudiohindicartoontv.hindicartoontv.ui.FullScreenHelper;

public class PlayerFactivety extends AppCompatActivity {

    private YouTubePlayerView youTubePlayerView;
    private FullScreenHelper fullScreenHelper = new FullScreenHelper(this);
    Bundle bundle;
    String videoID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_player_factivety);


        Intent mIntent = getIntent();
        videoID=mIntent.getStringExtra("videoID");

        youTubePlayerView =findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
//        addds(videoId);
//        Toast.makeText(getContext(), videoId, Toast.LENGTH_SHORT).show();

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {


                //                   String videoId ="njmkk";
                youTubePlayer.loadVideo(videoID, 0);
            }
        });

    }
}