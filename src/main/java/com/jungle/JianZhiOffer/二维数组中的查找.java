package com.jungle.JianZhiOffer;

public class 二维数组中的查找 {
    public boolean Find(int target, int [][] array) {

        int m = array.length;
        return find(target,array,m-1,0);

    }

    private boolean find(int target, int [][] array,int m,int n) {

        int len = array[0].length;

        if (m==0 && n == len-1) {
            return array[m][n] == target;
        }

        if (m >=0 && n<=len-1) {
            if (array[m][n] == target) {
                return true;
            }else if (array[m][n] < target) {

                n++;
                return find(target,array,m,n);
            }else {
                m--;
                return find(target,array,m,n);
            }
        }

        return false;
    }

}
