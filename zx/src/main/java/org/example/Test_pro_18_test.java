package org.example;

public class Test_pro_18_test {
        static{
            int x=5;
        }
        static int x,y;
        public static void main(String args[]){
            x--;
            myMethod( );
            float []f[] = new float[6][6];///????!!!
            System.out.println(x+y+ ++x);
                    String lx ="lexin";
                    String nb = lx;
                    lx = "Fenqile";
                    System.out.println(nb);
        }
        public static void myMethod( ){
            y=x++ + ++x;
        }
}
