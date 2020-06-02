package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class 滑动窗口的最大值 {
    private ArrayList<Integer> res;
    private class Sup {
        int value;
        int index;

        public Sup(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {


        res = new ArrayList<>();
        if (size<1||size>num.length) {
            return res;
        }
        Sup[] sups = new Sup[num.length];
        PriorityQueue<Sup> queue = new PriorityQueue<Sup>(3, (o1, o2) -> o2.value-o1.value);

        // 初始化
        for (int i = 0; i < size; i++) {
            Sup pair = new Sup(num[i], i);
            sups[i] = pair;
            queue.add(pair);
        }
        res.add(queue.peek().value);
        int l=1,r=size;
        while (r!=num.length) {

            queue.remove(sups[l-1]);
            Sup sup = new Sup(num[r], r);
            sups[r] = sup;
            queue.add(sups[r]);


            res.add(queue.peek().value);

            l++;
            r++;
        }


        return res;
    }
}
