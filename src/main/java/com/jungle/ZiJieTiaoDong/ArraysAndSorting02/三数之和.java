package com.jungle.ZiJieTiaoDong.ArraysAndSorting02;

import java.util.*;

public class 三数之和 {


    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num); //排序
        List<List<Integer>> res = new LinkedList<>();
        // i < num.length-2 进行了剪枝操作
        for (int i = 0; i < num.length-2; i++) {
            //为了保证不加入重复的 list,因为是有序的，所以如果和前一个元素相同，只需要继续后移就可以
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                //两个指针,并且头指针从i + 1开始，防止加入重复的元素
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        //元素相同要后移，防止加入重复的 list
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }





    // ===========================下面是我的方法，超时了==============================================================
    private List<List<Integer>> res;
    private Set<List<Integer>> ans;

    public List<List<Integer>> threeSum2(int[] arr) {

        res = new ArrayList<>();
        ans = new HashSet<>();

        if (arr.length<3) {
            return res;
        }
        List<Integer> c = new LinkedList<>();
        // System.out.println(JSON.toJSONString(arr));
        Arrays.sort(arr);
        // System.out.println(JSON.toJSONString(arr));
        generatePaiLie(arr,0, (LinkedList<Integer>) c);

        res.addAll(ans);
        return res;
    }

    private void generatePaiLie(int[] arr, int start, LinkedList<Integer> c) {


        if (c.size()==3) {

            if (listSum(c)==0) {
                ans.add(new LinkedList<>(c));
            }
            return;
        }

        for (int i = start; i <= arr.length - (3 - c.size()); i++) {

            c.addLast(arr[i]);

            generatePaiLie(arr,i+1,c);

            c.removeLast();

        }
    }

    private int listSum(List<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum+i;
        }

        return sum;
    }


    // ==================================================================================
}
