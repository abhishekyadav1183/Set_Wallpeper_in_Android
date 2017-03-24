package com.example.abhishekyadav.wallpeper;

import android.app.Service;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelUuid;
import android.support.annotation.Nullable;

import java.io.IOException;

/**
 * Created by Abhishek Yadav on 12/24/2016.
 */

public class Service1 extends Service implements Runnable
{
    private int wallpaperID[]={R.drawable.four,R.drawable.three,R.drawable.two};

    private int FLAG=0;
    private Thread t;
    private Bitmap bitmap1;
    private Bitmap bitmap2;
    private Bitmap bitmap3;


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);


        bitmap1= BitmapFactory.decodeResource(getResources(),wallpaperID[0]);
        bitmap2= BitmapFactory.decodeResource(getResources(),wallpaperID[1]);
        bitmap3= BitmapFactory.decodeResource(getResources(),wallpaperID[2]);
        t=new Thread(Service1.this);
        t.start();
        return 0;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void run()
    {
        try {
            while (true) {
                if (FLAG==0)
                {
                    this.setWallpaper(bitmap1);
                    FLAG++;

                }
                else if (FLAG==1)
                {
                this.setWallpaper(bitmap2);
                 FLAG++;
                }
                else
                {
                    this.setWallpaper(bitmap3);
                    FLAG-=2;
                }
                Thread.sleep(1000);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
