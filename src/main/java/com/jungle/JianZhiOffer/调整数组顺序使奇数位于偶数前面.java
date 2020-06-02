package com.jungle.JianZhiOffer;

import java.util.LinkedList;
import java.util.Stack;

public class 调整数组顺序使奇数位于偶数前面 {
    public void reOrderArray(int [] array) {

        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();

        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i]%2==0) {

                stack.push(array[i]);
            } else {
                list.add(array[i]);
            }
        }
        int i = 0;
        while (!list.isEmpty()) {
            array[i] = list.remove();
            i++;
        }

        int j = length-1;
        while (!stack.isEmpty()) {
            array[j] = stack.pop();
            j--;
        }
    }

    public static void main(String[] args) {
        System.out.println(2%2);
    }
}
