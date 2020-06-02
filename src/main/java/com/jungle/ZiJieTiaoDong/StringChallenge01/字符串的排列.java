package com.jungle.ZiJieTiaoDong.StringChallenge01;

public class 字符串的排列 {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;
        int[] s1map = new int[26];

        for (int i = 0; i < s1.length(); i++)
            s1map[s1.charAt(i) - 'a']++;

        // 这里可以想象有一个长度为s1.length()的窗口，从索引0向后一格一格的滑动
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2map = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                s2map[s2.charAt(i + j) - 'a']++;
            }
            if (matches(s1map, s2map))
                return true;
        }
        return false;
    }
    public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }

}
