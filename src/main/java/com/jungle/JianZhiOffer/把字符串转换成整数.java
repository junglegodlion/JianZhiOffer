package com.jungle.JianZhiOffer;

public class 把字符串转换成整数 {
    // 解法1：捕捉异常（有些钻空子嫌疑，但是很好用。。。。在题解中看到的）
    public int StrToInt(String str) {
        Integer res=0;
        try {
            res = new Integer(str);
        } catch (NumberFormatException e) {

        } finally {
            return res;
        }
    }
    // 解法2：正则表达式判断格式 + 结果溢出判断
    //不符合规则就返回0；符合规则，得出结果后判断是否溢出
    public int StrToInt2(String str) {
        // \d代表[0-9] 但是要写成\\d才行。
        if(!str.matches("[1-9,+,-]\\d+")) return 0;
        int len = str.length();
        int i = len-1;
        long res = 0;  //long类型，避免溢出。不能用int

        while(i>=0&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            res += Math.pow(10,len-1-i)*(str.charAt(i)-'0');
            i--;
        }
        res = (str.charAt(0) == '-' ? -res : res);
        //溢出就返回0，用long类型的res来比较，
        //如果定义为int res,那再比较就没有意义了，int范围为[-2147483648,2147483647]
        if(res>Integer.MAX_VALUE|| res<Integer.MIN_VALUE)return 0;
        return (int)res;
    }
}
