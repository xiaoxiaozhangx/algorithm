package org.example;

public class Test_pro_08 {
    static int trycatch() {
        int s = 4;
        int a = 0;
        try {
            int i = 100 / a;
            return 1;

        } catch (Exception e) {
            s=2;
            System.out.println("cath"+s);
            return s;

        }
        finally {
            s=3;
            System.out.println("final "+s);
//            return s;
        }
//        return a;
//
    }
    public static void main(String[] args) {
        int res=trycatch();
        System.out.println(res);

    }
}
