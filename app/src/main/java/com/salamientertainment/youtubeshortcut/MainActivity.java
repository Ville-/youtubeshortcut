package com.salamientertainment.youtubeshortcut;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String text = getIntent()
                .getStringExtra(Intent.EXTRA_PROCESS_TEXT);
        startYoutubeSearch(text);
        finish();

    }

    private void startYoutubeSearch(String string){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=" + string)));

    }
}
