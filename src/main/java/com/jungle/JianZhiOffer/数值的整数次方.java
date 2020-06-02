package com.jungle.JianZhiOffer;

public class 数值的整数次方 {

    public double Power(double base, int exponent) {

        if (base==0) {
            return 0;
        }

        if (exponent == 0) {
            return 1;
        }else if (exponent >0) {
            return getPower(base,exponent);
        }else {
            return 1/getPower(base,-1*exponent);
        }
    }

    private  double getPower(double base, int exponent) {

        double result= 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
