package org.example;

public class Test_pro_16_tryreturn {
        public int add(int a,int b){
            try {
                return a+b;
            }
            catch (Exception e) {
                System.out.println("catch语句块");
            }
            finally{
                System.out.println("finally语句块");
            }
            return 0;
        }
        public static void main(String argv[]){
            Test_pro_16_tryreturn test =new Test_pro_16_tryreturn();
            System.out.println("和是："+test.add(9, 34));
        }
}
