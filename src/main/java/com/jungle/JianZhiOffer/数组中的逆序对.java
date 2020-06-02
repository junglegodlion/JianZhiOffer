package com.jungle.JianZhiOffer;

import java.util.Arrays;

public class 数组中的逆序对 {
    public int InversePairs(int [] array) {

        int length = array.length;
        return inversePairs(array,0,length-1);

    }

    // 分
    private int inversePairs(int[] array, int l, int r) {
        if (l>=r) {
            return 0;
        }
        int mid = l + (r-l)/2;
        int res1 = inversePairs(array,l,mid);
        int res2 = inversePairs(array,mid+1,r);

        return res1 + res2 + merge(array,l,mid,r);


    }

    // 归
    private int merge(int[] array, int l, int mid, int r) {

        // 左闭右开
        int[] copy = Arrays.copyOfRange(array, l, r + 1);

        // 初始化逆序数对个数 res = 0
        int res = 0;

        int i = l,j = mid+1;

        for (int k = l; k <= r; k++) {
            if( i > mid ){  // 如果左半部分元素已经全部处理完毕
                array[k] = copy[j-l];
                j ++;
            }
            else if( j > r ){   // 如果右半部分元素已经全部处理完毕
                array[k] = copy[i-l];
                i ++;
            }
            else if( copy[i-l]<=(copy[j-l]) ){  // 左半部分所指元素 <= 右半部分所指元素
                array[k] = copy[i-l];
                i ++;
            }
            else{   // 右半部分所指元素 < 左半部分所指元素
                array[k] = copy[j-l];
                j ++;
                // 此时, 因为右半部分k所指的元素小
                // 这个元素和左半部分的所有未处理的元素都构成了逆序数对
                // 左半部分此时未处理的元素个数为 mid - j + 1
                res += (mid - i + 1);
            }
        }
        return res;
    }
}
