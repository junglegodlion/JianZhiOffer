package com.jungle.JianZhiOffer;
import java.util.regex.Pattern;
public class 表示数值的字符串 {
//    链接：https://www.nowcoder.com/questionTerminal/6f8c901d091949a5837e24bb82a731f2?answerType=1&f=discussion
//    来源：牛客网

        public static boolean isNumeric(char[] str) {
            String pattern = "^[-+]?\\d*(?:\\.\\d*)?(?:[eE][+\\-]?\\d+)?$";
            String s = new String(str);
            return Pattern.matches(pattern,s);
        }

}
