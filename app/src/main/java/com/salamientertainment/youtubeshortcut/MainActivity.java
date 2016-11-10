package com.salamientertainment.youtubeshortcut;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {

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
