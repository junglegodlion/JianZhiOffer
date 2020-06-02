package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class 数据流中的中位数 {

    private int count;
    private ArrayList<Integer> arr=new ArrayList<>();
    public void Insert(Integer num) {


        arr.add(num);
        count++;
    }

    public Double GetMedian() {

        Integer[] array = arr.toArray(new Integer[arr.size()]);
        Arrays.sort(array);
        if (count%2==1) {
            return Double.valueOf(array[count/2]);
        } else {
            return Double.valueOf((array[((count-1)/2)]+array[count/2]))/2;
        }
    }

}
