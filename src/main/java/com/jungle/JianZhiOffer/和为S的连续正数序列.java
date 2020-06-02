package com.jungle.JianZhiOffer;

import java.util.ArrayList;

public class 和为S的连续正数序列 {

//    private ArrayList<ArrayList<Integer>> res;
//    private int allint;
//    private int[] memo;
//
//    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
//
//        memo = new int[sum];
//
//        allint = sum;
//        res = new ArrayList<ArrayList<Integer>>();
//        int n = sum / 2;
//        ArrayList<Integer> p = new ArrayList<Integer>();
//        for (int i = 1; i < n; i++) {
//            p.add(i);
//            dfs(i+1,p,sum-i);
//            p.remove(p.size()-1);
//        }
//
//        if (n+n+1==sum) {
//            p.add(n);
//            p.add(n+1);
//            res.add(new ArrayList<Integer>(p));
//        }
//
//        return res;
//    }
//
//    private void dfs(int index, ArrayList<Integer> p, int sum) {
//
//        if (sum==0) {
//            res.add((ArrayList<Integer>) p.clone());
//        }
//
//        if (index==allint ||sum <0) {
//            return;
//        }
//
//        for (int i = index; i < allint; i++) {
//
//            p.add(i);
//            if (sum-i<0) {
//                p.remove(p.size()-1);
//                break;
//            }
//            dfs(i+1,p,sum-i);
//            p.remove(p.size()-1);
//        }
//
//    }

    //=======================================上面，时间超时===================================================

    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=1; i < sum; i++){
            int temp = 0;
            int j = i;
            while(temp < sum){
                temp += j;
                j++;
            }
            if(temp == sum){//如果找到了那么就要把数据添加到结果数据中。
                ArrayList<Integer> newArray = new  ArrayList<Integer>();
                for(int k=i;k< j;k++)
                    newArray.add(k);
                result.add(newArray);
            }
        }
        return result;

    }


}
