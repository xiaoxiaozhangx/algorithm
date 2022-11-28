package org.example;

public class SuperClass {
    int supint = 100;
    public void m(){
        System.out.println("supre m");
    }

    private static String STR = "Superkkkkkkkkk Class Static Variable";

    static {
        String STR = "Super hhhhhhh Static Variable";
        System.out.println("Super Class Static Block:" + STR);
    }

    public SuperClass() {
        System.out.println("Super Class Constructor Method");
    }

    {
        System.out.println("Super Class Block");
    }

}

class ObjectInit extends SuperClass {
    int childInt=10;
    public void m(){
        System.out.println("kid m");
    }

    public static String STR = "Class Static Variable";

    static {
        System.out.println("Class Static Block:" + STR);
    }

    public ObjectInit() {
        childInt=200;//实例变量
        System.out.println("Constructor Method and childInt: "+childInt);
    }

    {
        System.out.println("Class Block"+" childInt: "+childInt);//非静态代码块
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
//        ObjectInit a = new ObjectInit();

        SuperClass a = new SuperClass();
//        System.out.println(SuperClas);
//        a.m();

    }

}
