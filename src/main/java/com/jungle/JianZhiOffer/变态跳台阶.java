package com.jungle.JianZhiOffer;

public class 变态跳台阶 {
    public int JumpFloorII(int target) {
        if (target<=0) {
            return 0;
        }

        if (target==1){
            return 1;
        }else {
            return 2*JumpFloorII(target-1);
        }

    }
}
