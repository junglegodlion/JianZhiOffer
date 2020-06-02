package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class 字符串的排列 {
    // 保存结果
    private ArrayList<String> res;

    private boolean[] used;
    public ArrayList<String> Permutation(String str) {

        res = new ArrayList<>();
        used = new boolean[str.length()];

        if (str.equals("")||str==null) {
            return res;
        }

        find(str,0,"");

        List<String> list = res.stream().distinct().collect(Collectors.toList());
        return (ArrayList<String>) list;
    }

    private void find(String str, int index, String s) {

        if (index == str.length()) {
            res.add(s);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            if (!used[i]) {
                used[i] =true;
                String string = s + str.charAt(i);
                find(str,index+1,string);
                used[i] = false;
            }
        }

    }

}
