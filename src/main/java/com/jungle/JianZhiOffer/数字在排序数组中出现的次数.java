package com.jungle.JianZhiOffer;

public class 数字在排序数组中出现的次数 {

    public int GetNumberOfK(int [] array , int k) {


        int n = array.length;
        if (n==0) {
            return 0;
        }
        int i=0,j=n-1;

        while ((i<j)&&((array[i]!=k)||(array[j] !=k))) {
            if (array[i]!=k) {
                i++;
            }
            if (array[j] !=k) {
                j--;
            }
        }
        if (i>=j) {
            if (array[i]==k) {
                return 1;
            } else {
                return 0;
            }
        }

        return j-i+1;
    }
}
