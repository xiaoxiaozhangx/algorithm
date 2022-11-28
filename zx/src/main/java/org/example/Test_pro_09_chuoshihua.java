package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test_pro_09_chuoshihua {
    public static void main(String[] args) {
        Leaf leaf=new Leaf();
        System.out.println("~~~~~~~~~~~");
        Leaf leaf2=new Leaf();
    }
}
class Root{
    Other other=new Other();
    static {
        System.out.println("root static");
    }
    {
        System.out.println("root 实例化块");
    }
    public Root(){
        System.out.println("root 构造器");
    }

}
class Leaf extends Root{
    Other other=new Other();
    static {
        System.out.println("Leaf static");
    }
    {
        System.out.println("Leaf 实例化块");
    }
    public Leaf(){

        System.out.println("Leaf 构造器");
    }

}
class Other{
    {
        System.out.println("other 实例化块");
    }
    static{
        System.out.println("other static");
    }
public Other(){

    System.out.println("other 构造器");
}
}