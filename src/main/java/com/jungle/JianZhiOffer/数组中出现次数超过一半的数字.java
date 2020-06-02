package com.jungle.JianZhiOffer;

import java.util.Arrays;


public class 数组中出现次数超过一半的数字 {
    public static int MoreThanHalfNum_Solution(int [] array) {

        int length = array.length;
        int s = length/2;
        Arrays.sort(array);
        int w=0,v=0;
        for (int i = 0; i < length; i++) {
            if (array[i]==array[s]) {
                w=i;
                break;
            }
        }
        for (int i = w; i < length; i++) {
            if (array[i]!=array[s]) {
                v=i;
                break;
            }
        }
        if (v==0) {
            v=length;
        }

        return (v-w)*2 >length?array[s]:0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}
