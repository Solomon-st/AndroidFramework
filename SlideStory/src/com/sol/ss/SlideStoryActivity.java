package com.sol.ss;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.sol.ss.etc.FilePickerActivity;

public class SlideStoryActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Background(this));
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        //TODO start beat
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        //TODO suspend beat
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.chooseFile:
                chooseFile();
                return true;
            case R.id.help:
                showHelp();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    
    public void chooseFile() {
        Intent intent = new Intent(this, FilePickerActivity.class);
        startActivityForResult(intent, REQUEST_PICK_FILE);
        placeNewItem();
    }
    
    private void placeNewItem() {
        
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case REQUEST_PICK_FILE: {
                    if (data.hasExtra(FilePickerActivity.EXTRA_FILE_PATH)) {
                        File f = new File(data.getStringExtra(FilePickerActivity.EXTRA_FILE_PATH));
                    }
                }
            }
        }
    }
    
    public void showHelp() {
        
    }
    
    private final String tag               = this.getClass().getSimpleName();
    private final int    REQUEST_PICK_FILE = 1;
}