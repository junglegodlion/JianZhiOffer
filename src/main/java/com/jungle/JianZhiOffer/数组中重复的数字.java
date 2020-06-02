package com.jungle.JianZhiOffer;

import java.util.Arrays;

public class 数组中重复的数字 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || length == 0){
            return false;
        }
        Arrays.sort(numbers);
        for(int i=0;i<length-1;i++){
            if(numbers[i] == numbers[i+1]){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
