package com.jungle.JianZhiOffer;

public class 翻转单词顺序列 {
    public String ReverseSentence(String str) {


        String replace = str.replace(" ", "@ @");
        String[] split = replace.split("@");

        int length = split.length;
        String newStr="";
        for (int i = length-1; i >= 0; i--) {

            newStr = newStr + split[i];

        }
        return newStr;
    }
}
