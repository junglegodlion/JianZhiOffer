package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class 第一个只出现一次的字符 {

    public int FirstNotRepeatingChar(String str) {
        if (str.equals("")) {
            return -1;
        }

        HashMap supportHashMap = new HashMap<Character,Support>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!supportHashMap.containsKey(chars[i])) {
                supportHashMap.put(chars[i],new Support(1,i));
            } else {

                Support support = (Support) supportHashMap.get(chars[i]);
                support.count++;
                supportHashMap.put(chars[i],support);
            }
        }

        ArrayList<Support> list = new ArrayList<Support>();
        for (Object value : supportHashMap.values()) {

            Support o = (Support) value;
            if (o.count==1) {
                list.add(o);
            }
        }

        int size = list.size();
        Support[] array = (Support[])list.toArray(new Support[size]);

        Comparator comparator =new Comparator<Support>() {

            public int compare(Support o1, Support o2) {
                return o1.index-o2.index;
            }
        };

        Arrays.sort(array,comparator);
        System.out.println(list);

        return array[0].index;
    }

    private class Support{
        int count;
        int index;
        public Support(int count, int index) {
            this.count = count;
            this.index = index;
        }
    }

//    链接：https://www.nowcoder.com/questionTerminal/1c82e8cf713b4bbeb2a5b31cf5b0417c?answerType=1&f=discussion
//    来源：牛客网
//
//    public int FirstNotRepeatingChar(String str) {
//        if(str==null || str.length() == 0)return -1;
//        int[] count = new int[256];
//        //用一个类似hash的东西来存储字符出现的次数，很方便
//        for(int i=0; i < str.length();i++)
//            count[str.charAt(i)]++;
//        //其实这个第二步应该也是ka我的地方，没有在第一时间想到只要在遍历一遍数组并访问hash记录就可以了
//        for(int i=0; i < str.length();i++)
//            if(count[str.charAt(i)]==1)
//                return i;
//        return -1;
//    }

}
