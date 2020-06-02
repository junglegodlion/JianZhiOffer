package com.jungle.JianZhiOffer;

public class 连续子数组的最大和 {
    private int[] memo;
    private int res;
    public int FindGreatestSumOfSubArray(int[] array) {

        int n = array.length;
        memo = new int[n];
        memo[0] = array[0];
        res = memo[0];

        for (int i = 1; i < n; i++) {

            if (memo[i-1] < 0) {
                memo[i] = array[i];
            } else {
                memo[i] = memo[i-1] + array[i];
            }
            System.out.println(i+":" + memo[i]);
            res = Math.max(res,memo[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr ={-2,-8,-1,-5,-9};
        System.out.println(new 连续子数组的最大和().FindGreatestSumOfSubArray(arr));
    }
}
