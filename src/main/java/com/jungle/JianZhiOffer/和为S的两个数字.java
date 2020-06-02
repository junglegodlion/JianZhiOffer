package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 和为S的两个数字 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        int length = array.length;
        if (array==null||length==0) {
            return res;
        }

        if (array[0]>=sum) {
            return res;
        }

        int max = 0;
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            int com = sum-array[i];
            if (map.containsKey(com)) {
                int mul = com*(sum-com);
                if (res.size()==0) {
                    arr[0]=com;
                    arr[1]=sum-com;
                    max = mul;
                }else {
                    if (mul<=max) {
                        continue;
                    }else {
                        arr[0]=com;
                        arr[1]=sum-com;
                        max = mul;
                    }
                }
            }else {
                map.put(array[i],com);
            }
        }

        Arrays.sort(arr);
        if (arr[0]!=0&&arr[1]!=0){
            res.add(arr[0]);
            res.add(arr[1]);
        }
        return res;
    }
}
