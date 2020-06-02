package com.jungle.JianZhiOffer;

public class 斐波那契数列 {

    public int Fibonacci(int n) {
        if (n<0) {
            throw new RuntimeException("n不能小于0");
        }

        if (n==0) {
            return 0;
        }else if (n==1) {
         return 1;
        }else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
