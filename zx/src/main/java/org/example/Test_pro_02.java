package org.example;

public class Test_pro_02 {
    private int count;
    public static void main(String[] args) {
        int num =10;
        System.out.println(test(num));

    }
    public static int test(int b){
        try {
            b+=10;
            return b;
        }catch (RuntimeException e){

        }catch (Exception e2){

        }finally {
            b+=10;
            return b;
        }
    }


}


