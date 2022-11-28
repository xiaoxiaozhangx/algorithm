package org.example;
//父子类中属性的访问，子类能访问父类的属性吗？通过父类的构造器，调用父类的get()？
public class Test_pro_03 {
    private int data;
    boolean xian=true;//deafult 是可以类内，本包可以访问，而外包的子类是不能访问的
    protected  double pi=3.141592653;

    Test_pro_03(int data) {
        this.data = data;
    }
    Test_pro_03(int d,boolean b){
        data=d;
        xian=b;
    }
    protected Test_pro_03(boolean b, double d){
        xian=b;
        pi=d;
    }
}

class ChildTest_pro_03 extends Test_pro_03 {
    String name;

    ChildTest_pro_03(int data) {
        super(data);
    }

    ChildTest_pro_03(int d, String str) {
        super(d);
        name = str;
    }

    public static void main(String[] args) {
        Test_pro_03 test1=new ChildTest_pro_03(1);
        ChildTest_pro_03 test2=new ChildTest_pro_03(1,"str");//为什么子类能访问父类的deafult的属性？

        System.out.println(test2.name+" "+test2.xian+" "+test2.pi);
    }

}
