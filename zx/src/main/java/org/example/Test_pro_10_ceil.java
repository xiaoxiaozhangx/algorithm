package org.example;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.TreeSet;

public class Test_pro_10_ceil {
    public static void main(String[] args) throws UnsupportedEncodingException {
        double d1 = -0.5;
        System.out.println("Ceil d1=" + Math.ceil(d1));
        System.out.println("floor d1=" + Math.floor(d1));
        System.out.println("传入double，float，默认：");
        System.out.println(Math.ceil(-0.5d));
        System.out.println(Math.ceil(-0.5f));
        System.out.println(Math.ceil(-0.5));
        System.out.println("round");
        System.out.println(Math.round(-0.5f));
        System.out.println(Math.round(d1));
//        Math.round(double d)-返回long；Math.round(float f)-返回int；round方法里是+0.5后再floor；
//        java里double类型的-0.0和0.0是不一样的；int类型的-0和0就是一样的，都当成0处理。
        int b = Integer.parseInt("10", 2);
        int c = Integer.parseInt("A", 16);
        System.out.println(b);
        System.out.println(c);
        boolean a = false;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        TreeSet<Integer> set = new TreeSet<Integer>();
        TreeSet<Integer> subSet = new TreeSet<Integer>();
        for (int i = 606; i < 613; i++) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        subSet = (TreeSet) set.subSet(606, true, 611, true);
        set.add(6018);
        System.out.println(set + " " + subSet);
        set.add(607);
        subSet.add(609);
        System.out.println(set + " " + subSet);
        char along = 11;
        switch (along) {
            case 10: {
                System.out.println("this is 10");
            }
            case 11:{
                System.out.println("this is 1");
            }
            default:{
                System.out.println("this is deafult");
            }
        }
        int sthnum=0Xa;
        int sthnum2=07;// 以0开头的是八进制
        int sthnum3=0b101;// 以0b 0B开头的是二进制
        System.out.println(sthnum2&sthnum3);
        System.out.println(sthnum2^sthnum3);
        System.out.println(~sthnum3);
        String s = "在";
        System.out.println(s.getBytes(Charset.forName("UTF-8")).length);
        System.out.println(s.getBytes(Charset.forName("GBK")).length);
        System.out.println(s.getBytes(StandardCharsets.UTF_8).length);
        System.out.println(new String(s.getBytes(StandardCharsets.UTF_8),"GBK"));
        System.out.println(new String(s.getBytes(StandardCharsets.UTF_16),"UTF8"));
        char tchar= '\u0000' ;
        System.out.println("char deafult"+tchar+"over");
        StringBuilder aa=new StringBuilder("A");
        aa.append("b");
    }
}
