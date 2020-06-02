package com.jungle.JianZhiOffer;

import java.util.Arrays;

public class 旋转数组的最小数字 {

    public static int minNumberInRotateArray(int [] array) {

        int n = array.length;
        if (n<=0) return 0;

        int[] copy = Arrays.copyOfRange(array, 0, n);

        int maxIndex = 0;

        for (int i = 0; i < n-1; i++) {
            if (copy[i] > copy[i+1]) {
                maxIndex = i;
                break;
            }
            maxIndex = n-1;
        }

        for (int i = 0; i <= maxIndex; i++) {
            array[n-1-maxIndex+i] = copy[i];
        }
        for (int i = maxIndex + 1,j = 0; i <= n-1 ; i++,j++) {
            array[j] = copy[i];
        }
        return array[0];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5,6,9 ,1, 2};
        int i = minNumberInRotateArray(arr);
        for (int i1 : arr) {
            System.out.println(i1);
        }
//        System.out.println(i);
    }
}
