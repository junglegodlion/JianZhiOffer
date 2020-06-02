package com.jungle.JianZhiOffer;

import java.util.Arrays;

public class 扑克牌顺子 {
    public boolean isContinuous(int [] numbers) {

        int length = numbers.length;
        if (numbers==null||length==0) {
            return false;
        }

        Arrays.sort(numbers);
        // 寻找大小王的数量
        int i =0;
        while (numbers[i]==0) {
            i++;
        }

        int split = 0;
        for (int j = i; j < length-1; j++) {

            int cha =numbers[j+1]-numbers[j];
            if (cha==0) {
                return false;
            }
            if ((cha)>1) {
                split=split+(cha-1);
            }

        }
        return (i-split)>=0;
    }
}
