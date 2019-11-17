package com.uhuy.dicodingsubmissionandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

//import com.uhuy.dicodingsubmissionandroid.adapter.CardViewHeroAdapter;
//import com.uhuy.dicodingsubmissionandroid.adapter.GridHeroAdapter;
//import com.uhuy.dicodingsubmissionandroid.adapter.ListHeroAdapter;
import com.uhuy.dicodingsubmissionandroid.adapter.CardViewAdapter;
import com.uhuy.dicodingsubmissionandroid.model.Character;
import com.uhuy.dicodingsubmissionandroid.model.CharacterData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCharacter;
    private ArrayList<Character> list;

    private String title = "Stranger Things Character";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setActionBarTitle(title);


        rvCharacter = (RecyclerView)findViewById(R.id.rv_character);
        rvCharacter.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(CharacterData.getListData());
        showRecyclerCardView();

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);

        }
    }


    private void showRecyclerCardView() {
        rvCharacter.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewPemainAdapter= new CardViewAdapter(this);
        cardViewPemainAdapter.setListCharacter(list);
        rvCharacter.setAdapter(cardViewPemainAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                Intent gotoabout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(gotoabout);
                break;
        }
    }

}
