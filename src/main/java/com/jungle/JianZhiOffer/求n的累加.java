package com.jungle.JianZhiOffer;

// 求1+2+3+...+n
public class 求n的累加 {
    public int Sum_Solution(int n) {

        int ans=n;
        boolean b=(ans!=0) && ((ans+=Sum_Solution(n-1))!=0);
        return ans;
    }
}
