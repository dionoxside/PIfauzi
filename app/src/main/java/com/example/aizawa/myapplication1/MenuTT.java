package com.example.aizawa.myapplication1;

import android.content.Intent;
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
    private Button ty , ttb, tsk, tln, tj, tc;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_menu__jj);
        ty = (Button) findViewById(R.id.ty);
        ttb = (Button) findViewById(R.id.ttb);
        tsk = (Button) findViewById(R.id.tsk);
        tln = (Button) findViewById(R.id.tln);
        tj = (Button) findViewById(R.id.tj);
        tc = (Button) findViewById(R.id.tc);
        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MenuTT.this, TY.class);
                startActivity(i);
            }
        });
        ttb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MenuTT.this, TTB.class);
                startActivity(i);
            }
        });
        tsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MenuTT.this, TSK.class);
                startActivity(i);
            }
        });
        tln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MenuTT.this, TLN.class);
                startActivity(i);
            }
        });
        tj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MenuTT.this, TJ.class);
                startActivity(i);
            }
        });
        tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MenuTT.this, TC.class);
                startActivity(i);
            }
        });
////        media
//        VideoView vw = (VideoView) findViewById(R.id.video);
//        VideoView vw1 = (VideoView) findViewById(R.id.video1);
//        VideoView vw2 = (VideoView) findViewById(R.id.video3);
////        media1
////        media2
//        String uriPath1 = "android.resource://com.example.aizawa.myapplication1/"+R.raw.ttb;
//        Uri uri1 = Uri.parse(uriPath1);
//        MediaController mediaController1 = new MediaController(this);
//        mediaController.setAnchorView(mediaController1);
//        vw1.setMediaController(mediaController1);
//        vw1.setVideoURI(uri1);
//        vw1.stopPlayback();
//        vw1.requestFocus();
////        media3
//        String uriPath2 = "android.resource://com.example.aizawa.myapplication1/"+R.raw.tsk;
//        Uri uri2 = Uri.parse(uriPath2);
//        MediaController mediaController2 = new MediaController(this);
//        mediaController.setAnchorView(mediaController2);
//        vw2.setMediaController(mediaController2);
//        vw2.setVideoURI(uri2);
//        vw2.stopPlayback();
//        vw.requestFocus();
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
