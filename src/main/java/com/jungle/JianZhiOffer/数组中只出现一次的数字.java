package com.jungle.JianZhiOffer;

import java.util.ArrayList;

public class 数组中只出现一次的数字 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (list.contains(i)) {
                list.remove(new Integer(i));
            }else {
                list.add(i);
            }

        }

        num1[0] = list.get(0);
        num2[0] = list.get(1);

    }
}
