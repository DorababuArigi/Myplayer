package com.example.myplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Okalila kosam","Abc"));
        words.add(new Word("Eeswara","Uppena"));
        words.add(new Word("Jala jala jala","Uppena"));
        words.add(new Word("dhag dhag","Uppena"));
        words.add(new Word("Let me sing kutty","Master"));
        words.add(new Word("Okalila kosam","Abc"));
        words.add(new Word("Eeswara","Uppena"));
        words.add(new Word("Jala jala jala","Uppena"));
        words.add(new Word("dhag dhag","Uppena"));
        words.add(new Word("Let me sing kutty","Master"));
        words.add(new Word("Okalila kosam","Abc"));
        words.add(new Word("Eeswara","Uppena"));
        words.add(new Word("Jala jala jala","Uppena"));
        words.add(new Word("dhag dhag","Uppena"));
        words.add(new Word("Let me sing kutty","Master"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}