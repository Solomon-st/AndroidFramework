package com.mic.framework;

import java.io.IOException;
import java.io.InputStream;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Toast;

public class Chinese {
    private Context context;
    
    public Chinese(Context context) {
        this.context = context;
    }
    
    public void showShortToast(String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
    
    public void showShortToast(int textId) {
        Toast.makeText(context, textId, Toast.LENGTH_SHORT).show();
    }
    
    public void showLongToast(String text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
    
    public void showLongToast(int textId) {
        Toast.makeText(context, textId, Toast.LENGTH_LONG).show();
    }
    
    public Bitmap scaleImage(String imagePath, int width, int height) {
        AssetManager assetManager = context.getAssets();
        InputStream imageIn;
        Bitmap image = null;
        try {
            imageIn = assetManager.open(imagePath, AssetManager.ACCESS_BUFFER);
            image = BitmapFactory.decodeStream(imageIn);
            image = Bitmap.createScaledBitmap(image, width, height, true);
        } catch (IOException e) {
        }
        //TODO: calculate width and height to fill or fit screen
        return image;
    }
    
    public Bitmap scaleImageForPerformance(String imagePath, int width, int height) {
        return null;
    }
    
    public Bitmap scaleImageForQuality(String imagePath, int width, int height) {
        return null;
    }
    
    public void sendNotification(Bitmap icon, String sentence) {
        NotificationManager notificationManager = (NotificationManager) context
                .getSystemService(Context.NOTIFICATION_SERVICE);
    }
}
