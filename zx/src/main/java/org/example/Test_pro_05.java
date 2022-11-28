package org.example;

public class Test_pro_05 {
    public static void main(String[] args) {
        String s1=new String("ab");// 堆内new
        String s2="ab";// 常量池
        String s3="a"+"b";//常量池
        String s4='a'+"b";//常量池
        String s5="b";
        String s6="a"+s5;//堆内新new
        char[] s7=new char[2];
        s7[0]='a';
        s7[1]='b';
        System.out.println("char and string");
        System.out.println(s1.equals(s7));// false
        StringBuilder stringBuilder=new StringBuilder("a");//为啥StringBuilder之间用equal互相不等，stringbuffer也是，
        StringBuilder stringBuilder2=new StringBuilder("ab");
        stringBuilder.append("b");

        StringBuffer stringBuffer=new StringBuffer("a");
        stringBuffer.append("b");

        StringBuffer stringBuffer2=new StringBuffer("ab");

        System.out.println("s1==s2:");
        System.out.println(s1==s2);
        System.out.println(s3==s2);
        System.out.println(s3==s4);
        System.out.println("’ab‘ vs "+"加上变量：");
        System.out.println(s2==s6);
        System.out.println(s1==s6);
        System.out.println("equal ?");
        System.out.println(s1.equals(s6));
        System.out.println(s1.equals(s2));
        System.out.println("stringbulding: 内容 equal ");
        System.out.println(stringBuilder.equals(s1));
        System.out.println(stringBuilder.equals(stringBuilder2));
        System.out.println(stringBuilder2.equals(s1));
        System.out.println("==");
        System.out.println(stringBuilder==stringBuilder2);
        System.out.println("stingbuffer 地址");
        System.out.println(stringBuffer==stringBuffer2);
        System.out.println("stringbuffer stringBuilder 内容");
        System.out.println(stringBuffer.equals(stringBuilder));
        System.out.println(stringBuffer.equals(stringBuffer2));

    }


}
