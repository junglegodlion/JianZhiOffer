package com.jungle.JianZhiOffer;

public class 替换空格 {

    public String replaceSpace(StringBuffer str) {

        String s = str.toString().replaceAll(" ", "%20");

        return s;


    }
}
