package com.jungle.JianZhiOffer;

import java.util.*;

public class Solution {
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map = new HashMap<>();
    private double result;

    public static void main(String[] args) {

        System.out.println(getCollection(4,2,1));
        System.out.println(getSocre("m8"));
        Solution solution = new Solution();
        System.out.println(solution.getWeight(new int[]{4,2,1}));
    }

    public  double getWeight(int[] arr) {
        int manNum = arr[0];
        int womanNum = arr[1];
        int childNum = arr[2];

        double preResult = manNum*2.0 + womanNum*1.0 + childNum*0.5;


        List<String> list = getCollection(manNum, womanNum, childNum);
        this.list=list;
        for (String o : list) {

            dfs(o,o);
            System.out.println(map);
        }


        return 0.0;
    }

    private void dfs(String v,String parent){

        map.put(v,parent);
        for(String w: list)
            if(!map.containsKey(w))
                dfs(w,v);
    }


    private static List getCollection(int manNum,int womanNum,int childNum) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < manNum; i++) {
            list.add("m"+ i);
        }

        for (int i = 0; i < womanNum; i++) {
            list.add("w"+i);
        }

        for (int i = 0; i < childNum; i++) {
            list.add("c"+i);
        }

        return list;
    }

    private static double getSocre(String str) {
        HashMap<Character, Double> map2 = new HashMap<>();
        map2.put('m',2.0);
        map2.put('w',1.0);
        map2.put('c',0.5);
        return map2.get(str.charAt(0));
    }
}
