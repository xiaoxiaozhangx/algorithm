package org.example.test2;

import org.example.Test_pro_03;

public class Test_child_01 extends Test_pro_03 {
    private long aLong=1234;
    short aShort;
    protected String hat;
    Test_child_01(boolean b, double d,long l,short s){
        super(b,d);//这里 父类的构造器必须是public 或者 protected,而不能是deafult.

    }

}
