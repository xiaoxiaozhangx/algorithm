package org.example;

import java.util.ArrayList;
import java.util.List;

public class Test_pro_13_list {
    private List<Integer> nums;

    //precondition: nums.size() > 0
//nums contains Integer objects
    public void numQuest() {
        int k = 0;
        Integer zero = new Integer(0);
        while (k < nums.size()) {
            if (nums.get(k).equals(zero))
                nums.remove(k);
            k++;
        }
    }
    public static void main(String[] args) {
        Test_pro_13_list t=new Test_pro_13_list();
        t.nums =new ArrayList<Integer>();
        t.nums.add(1);
        t.nums.add(2);
        t.nums.add(0);
        t.nums.add(3);
        t.nums.remove(0);
        System.out.println(t.nums.toString());
        t.nums.remove(0);
        System.out.println(t.nums.toString());
    }
}
