package org.example.leetcode;

public class Array01 {
    public int pivotIndex(int[] nums) {
        int arrSum = 0;

        for (int i = 0; i < nums.length; i++) {
            arrSum += nums[i];

        }
        int mid = -1;
        for (int i = 0; i < nums.length; i++) {
            if (isLeftRight(i, nums, arrSum)) {
                mid = i;
                break;
            } else {
                continue;
            }
        }
        return mid;

    }

    private boolean isLeftRight(int index, int[] nums, int arrSum) {
        boolean res = false;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < index; i++) {
            leftSum += nums[i];
        }



        if ((arrSum-nums[index])==(2*leftSum)) {
            res = true;
        } else {
            res = false;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] test = {2,1,-1};
//        int[] test = {1, 7, 3, 6, 5,6};
        Array01 array01 = new Array01();
        int res2 = array01.pivotIndex(test);
        System.out.println(res2);

    }
}
