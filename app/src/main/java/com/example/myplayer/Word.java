package com.example.myplayer;

public class Word {
    private String msong;
    private String mname;
    public Word(String song,String name){
        mname=name;
        msong=song;
    }
    public String getMsong(){return msong;}
    public String getMname(){return mname;}

}
