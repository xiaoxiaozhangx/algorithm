package org.example;

import java.util.HashMap;

// java 值传递
public class Test_pro_06 {
        String str=new String("tarena");//开辟常量池
        char[]ch={'a','b','c'};
        public static void main(String args[]){
            Test_pro_06 ex=new Test_pro_06();
            ex.change(ex.str,ex.ch);
            System.out.print(ex.str+" and ");
            System.out.print(ex.ch);
            HashMap map=new HashMap();
            map.put("name",null);
            map.put("name","angloe");
            System.out.println("hash map:"+map.size());
            System.out.println(14^3);
        }
        public void change(String str,char ch[]){
            //引用类型变量，传递的是地址，属于引用传递。
            str="test ok";//
            ch[0]='g';//指针复制了一份，但是复制和之前的指针都指向同一个堆内容，数组是创建在堆上？
        }
    }
