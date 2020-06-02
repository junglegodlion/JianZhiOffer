package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class 字符流中第一个不重复的字符 {
    private ArrayList<Character> list = new ArrayList<>();
    LinkedList<Character> onelist = new LinkedList<>();
    HashSet<Character> set = new HashSet<>();

    private int index;
    private int num;
    private char res='#';
    //Insert one char from stringstream
    public void Insert(char ch)
    {

        list.add(ch);
//        set.add(ch);
        num++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {

        if (num==index) {
            return res;
        } else {

            while (index!=num) {
                first(index);
                index++;
            }
            return res;
        }


    }

    private void first(int index) {

        // 之前已经有了，需要重新找新的,值需要改变
        if (index==0) {
            res=list.get(0);
            set.add(list.get(index));
            onelist.add(res);
        } else {
            if (!set.contains(list.get(index))) {
                set.add(list.get(index));
                onelist.add(list.get(index));
                if (res=='#'&&!onelist.isEmpty()) {
                    res = onelist.get(0);
                }
            } else {
                if (onelist.contains(list.get(index))) {
                    onelist.remove(list.get(index));
                }
                // 这个数出现过并且=res
                if (list.get(index)==res) {

                    if (!onelist.isEmpty()) {
                        res = onelist.get(0);
                    } else {
                        res = '#';
                    }
                }
            }
        }



    }
}
