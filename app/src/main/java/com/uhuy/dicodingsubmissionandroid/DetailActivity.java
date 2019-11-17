package com.uhuy.dicodingsubmissionandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.uhuy.dicodingsubmissionandroid.model.Character;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_detail2);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Character");
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Character characterReceived = getIntent().getParcelableExtra("key");


        ImageView gambar    = (ImageView)findViewById(R.id.img_photo_character);
        TextView nama       = (TextView)findViewById(R.id.tv_character_name);
        TextView description  = (TextView)findViewById(R.id.description);

        Glide.with(this).load(characterReceived.getPhoto()).override(150,230).into(gambar);
        nama.setText(characterReceived.getName());
        description.setText(characterReceived.getDescription());

        Log.i("photo", characterReceived.getPhoto());
        Log.i("description", characterReceived.getDescription());

    }

}