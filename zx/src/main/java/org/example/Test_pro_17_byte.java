package org.example;

import java.sql.ResultSet;

public class Test_pro_17_byte {
    public static void main(String[] args) {
        Test_pro_17_byte test=new Test_pro_17_byte();
        test.test();
    }
        public void add(Byte b)
        {
            b = b++;
        }
        public void test()
        {
            Byte a = 127;
            Byte b = 127;
            add(++a);
            System.out.print(a + " ");
            add(b);
            System.out.print(b + "");
            String s="1.2".replaceAll(("."), "/");
            System.out.println(s);
            int x=20, y=30;
            boolean b2;
            b2 = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
            System.out.println(b2);
        }
    }


