package com.jungle.ZiJieTiaoDong.StringChallenge01;

public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {

        int length = strs.length;
        if (length==0) {
            return "";
        }
        String commonStr = strs[0];

        for (String str : strs) {

            commonStr = findCommonPrefixIn2String(commonStr,str);
        }

        return commonStr;
    }

    /**
     * 查找两个字符串的公共子串
     */
    private static String findCommonPrefixIn2String(String string1,String string2) {
        int m = string1.length();
        int n = string2.length();
        int k = Math.min(m,n);
        int i = 0;
        String res = "";
        for (; i < k; i++) {
            if (string1.charAt(i)!=string2.charAt(i)) {
                break;
            }
            res = res + string1.charAt(i);
        }

        return res;
    }
}
