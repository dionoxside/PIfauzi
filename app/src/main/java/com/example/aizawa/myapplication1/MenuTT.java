package com.example.aizawa.myapplication1;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MenuTT extends AppCompatActivity  implements SurfaceHolder.Callback{
MediaPlayer mp;
    SurfaceView sv;
    SurfaceHolder sh;
    boolean pausing = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_menu__jj);
        VideoView vw = (VideoView) findViewById(R.id.video);
        String uriPath = "android.resource://com.example.aizawa.myapplication1/"+R.raw.ps;
        Uri uri = Uri.parse(uriPath);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mediaController);
        vw.setMediaController(mediaController);
        vw.setVideoURI(uri);
        vw.requestFocus();
        vw.start();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
