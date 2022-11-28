package org.example;

public class Test_pro_14_statichushihau {
        public static Test_pro_14_statichushihau t1 = new Test_pro_14_statichushihau();
        public static Test_pro_14_statichushihau t2 = new Test_pro_14_statichushihau();
        {
            System.out.println("构造块");
        }
        static
        {
            System.out.println("静态块");
        }
        public static void main(String[] args)
        {
            Test_pro_14_statichushihau t = new Test_pro_14_statichushihau();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Test_pro_14_statichushihau t2 = new Test_pro_14_statichushihau();
        }
//    输出：构造块 构造块 静态块 构造块
//    类一加载，首先就会创建static声明的变量以及静态代码块，而且按顺序依次执行，
//    静态代码块 static{**}只会执行一次，
//    而实例代码块 {***}，就会每创建一次对象就会执行一次实例代码块。
//    并不是静态块最先初始化,而是静态域.(BM：啊!多么痛的领悟!)
//    而静态域中包含静态变量、静态块和静态方法,其中需要初始化的是静态变量和静态块.而他们两个的初始化顺序是靠他们俩的位置决定的!
}
