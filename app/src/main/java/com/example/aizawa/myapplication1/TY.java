package com.example.aizawa.myapplication1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class TY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_ty);
        VideoView vw = (VideoView) findViewById(R.id.video);
        String uriPath = "android.resource://com.example.aizawa.myapplication1/"+R.raw.tp;
        Uri uri = Uri.parse(uriPath);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mediaController);
        vw.setMediaController(mediaController);
        vw.setVideoURI(uri);
        vw.stopPlayback();
        vw.requestFocus();
    }
}
