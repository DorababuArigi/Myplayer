package com.example.myplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public  WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemview=convertView;
        if(listitemview==null){
            listitemview= LayoutInflater.from(getContext()).inflate(R.layout.list,parent,false);
        }
        Word currentword=getItem(position);
        TextView song=(TextView) listitemview.findViewById(R.id.song);
        song.setText(currentword.getMsong());
        TextView name=(TextView) listitemview.findViewById(R.id.name);
        name.setText(currentword.getMname());
        return listitemview;
    }
}
