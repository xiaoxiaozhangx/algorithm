package org.example;

//值传递:Java里方法的参数传递方式只有一种：值传递。所谓值传递，就是将实际参数值的副本（复制品）传入方法内，而参数本身不会受到任何影响。
public class Test_pro_07 {

public static void swap(int aa,int bb){

    int t=aa;
    aa=bb;
    bb=t;
    System.out.println("swap中的a,b分别为："+aa+" "+bb);

}
public static void swap(Person p){
    int tmp=p.age;
    p.age=p.height;
    p.height=tmp;
    System.out.println("swap 中 的age,height 分别是"+p.age+","+p.height);

}
    public static void main(String[] args) {
        int a = 6;
        int b=9;
        System.out.println("swap前的a,b分别为："+a+" "+b);
        swap(a,b);
        System.out.println("swap后的a,b分别为："+a+" "+b+"\n");
        Person zhang=new Person();
        zhang.age=30;
        zhang.height=100;
        System.out.println("swap 前 age,height分别为："+zhang.age+","+zhang.height);
        swap(zhang);
        System.out.println("swap 后 age,height分别为："+zhang.age+","+zhang.height);


    }
}
