package org.example;

import java.util.Arrays;

public class Test_pro_01 {
    static String str1 = "";
    static String str2 = "192.168.1.1";

    public static void main(String[] args) {
        System.out.println(str1.split(",").length);
        System.out.println(Arrays.toString(str2.split("\\.")));
        System.out.println("~~~~~~``");
        for (String str : str2.split("\\.")) {
            System.out.println(str);
        }
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.err.println(str1 == str2);
        System.out.println(100 % 3);
        System.out.println(100 % 3.0);
        String s = "祝你考出好成绩！";
        System.out.println(s.length());
    }
}
