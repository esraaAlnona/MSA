package com.example.msa;

public class Num {
    private int mImage;
    private String mTxt1;
    private String mTxt2;

    public Num(int image, String txt1, String txt2){
        mImage = image;
        mTxt1 = txt1;
        mTxt2 = txt2;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmTxt1() {
        return mTxt1;
    }

    public String getmTxt2() {
        return mTxt2;
    }
}
