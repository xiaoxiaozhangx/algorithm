package org.example;

import java.util.ArrayList;
import java.util.List;

public class Test_VM_01 {
    static class OOMobject{

    }
    public static void main(String[] args) {
        List<OOMobject> list=new ArrayList<OOMobject>();
        while(true){
            list.add(new OOMobject());
        }

    }
}
