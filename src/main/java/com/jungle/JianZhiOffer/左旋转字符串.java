package com.jungle.JianZhiOffer;

public class 左旋转字符串 {
    public String LeftRotateString(String str,int n) {

        int length = str.length();
        if (length<n) {
            return str;
        }

        char[] chars = str.toCharArray();
        String newStr="";
        for (int i = 0; i < length; i++) {
            newStr = newStr+chars[(i+n)%length];
        }
        return newStr;
    }
}
