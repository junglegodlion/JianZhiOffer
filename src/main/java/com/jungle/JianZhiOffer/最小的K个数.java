package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class 最小的K个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {


        Arrays.sort(input);

        ArrayList<Integer> list = new ArrayList<>();
        if (k>input.length) {
            return list;
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
}
