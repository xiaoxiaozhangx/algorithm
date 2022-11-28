package org.example;

public class Test_pro_12_jingtaifenpei2 {//Father
        public void say(){
            System.out.println("father");
        }
        public static void action(){
            System.out.println("爸爸打儿子！");
        }
    }
     class Son extends Test_pro_12_jingtaifenpei2{
        public void say() {
            System.out.println("son");
        }
        public static void action(){
            System.out.println("打打！");
        }
        public static void main(String[] args) {
            Test_pro_12_jingtaifenpei2 f=new Son();
            f.action();
            f.say();
            f.action();
            f.action();

        }
    }

