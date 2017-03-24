package com.example.abhishekyadav.wallpeper;

import android.app.Service;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class first extends AppCompatActivity{



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



    }


public void startService(View view)
{

 startService(new Intent(getBaseContext(),Service1.class));

}


public void stopService(View view) {
stopService(new Intent(getBaseContext(), Service1.class));


    }


}
















//    @Override
//    public void onCreate() {
//        super.onCreate();
//
//        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
//        try {
//            wallpaperManager.setResource(R.drawable.two);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }









