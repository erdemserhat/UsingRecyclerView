package com.erdemserhat.usingrecyclerview;

import java.io.Serializable;

public class ProgrammingLanguage implements Serializable {
    private String name;
    private int image;

    ProgrammingLanguage(String name, int image){
        this.name=name;
        this.image=image;
    }

    public String getName(){
        return this.name;
    }

    public int getImage(){
        return this.image;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setImage(int image){
        this.image=image;
    }
}
