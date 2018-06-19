package com.google.android.exoplayer2.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SampleInputActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_input);
    }

    public void play(View view) {
        String url = ((EditText) findViewById(R.id.input_url)).getText().toString().trim();
        String token = ((EditText) findViewById(R.id.input_token)).getText().toString().trim();
        String agent = ((EditText) findViewById(R.id.input_agent)).getText().toString().trim();
        if (TextUtils.isEmpty(url) || TextUtils.isEmpty(token) || TextUtils.isEmpty(agent)) {
            Toast.makeText(this, "Incomplete input", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(getApplicationContext(), PlayerActivity.class);
        intent.putExtra("url", url);
        intent.putExtra("token", token);
        intent.putExtra("agent", agent);
        startActivity(intent);
    }
}
