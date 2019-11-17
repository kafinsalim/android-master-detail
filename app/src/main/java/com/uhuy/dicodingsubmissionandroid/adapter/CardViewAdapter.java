package com.uhuy.dicodingsubmissionandroid.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.uhuy.dicodingsubmissionandroid.CustomOnItemClickListener;
import com.uhuy.dicodingsubmissionandroid.DetailActivity;
import com.uhuy.dicodingsubmissionandroid.model.Character;
import com.uhuy.dicodingsubmissionandroid.R;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {

    private ArrayList<Character> listCharacter;
    private Context context;
    private Activity activity;

    public CardViewAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Character>getListCharacter() {
        return listCharacter;
    }

    public void  setListCharacter(ArrayList<Character> listCharacter) {
        this.listCharacter = listCharacter;
    }


    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_character, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        final Character k = getListCharacter().get(position);
        Glide.with(context)
                .load(k.getPhoto())
                .override(150,230)
                .into(holder.imgPhoto);

        holder.tvnama.setText(k.getName());
        holder.tvDescription.setText(k.getDescription());
        holder.characterterbaik = k;

//        holder.btnsahre.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(View view, int position) {
//                Toast.makeText(context, "Share " + getListCharacter().get(position).getName(), Toast.LENGTH_SHORT).show();
//            }
//        }) {
//            @Override
//            public void onItemClicked(View view, int position) {
//
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return getListCharacter().size();
    }

    public void startactivity(Intent intent){

    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvnama, tvDescription;
        Button btndetail;
        Character characterterbaik;


        public CardViewHolder( View itemView) {
            super(itemView);
            imgPhoto    = (ImageView)itemView.findViewById(R.id.img_photo_character);
            tvnama      = (TextView)itemView.findViewById(R.id.tv_character_name);
            tvDescription = (TextView)itemView.findViewById(R.id.tv_character_description);
            btndetail   = (Button)itemView.findViewById(R.id.btn_set_detail);
            btndetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("key", characterterbaik);
            context.startActivity(intent);
        }
    }
}
