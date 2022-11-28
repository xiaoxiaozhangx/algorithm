package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_pro_04 {
    private int privateOne=1;
    int deafultTwo=2;
    protected  int protectedThree=3;
    public  int public4=4;

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(0,4);
        System.out.println(Arrays.toString(list.toArray()));
        list.remove(1);
        System.out.println(Arrays.toString(list.toArray()));
    }

    Test_pro_04( int one,int two,int three,int fou){
        privateOne=one;
        deafultTwo=two;
        protectedThree=three;
        public4=fou;
    }

    class innerClass{
        int innerInt=privateOne;


    }
   static class innerStaticClass{
        int  anIntStict;
   }

}
