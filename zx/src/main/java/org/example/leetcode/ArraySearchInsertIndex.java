package org.example.leetcode;

//https://leetcode.cn/leetbook/read/array-and-string/cxqdh/
public class ArraySearchInsertIndex {

    private int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        int left = 0;
        int right = nums.length - 1;
        int mid;
        for (; left < right; ) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }

        }
// 1,3 5,,, 4
return left;
    }

    public static void main(String[] args) {
        ArraySearchInsertIndex arraySearchInsertIndex = new ArraySearchInsertIndex();
        int[] test = {1};
        int target = 1;
        int res2 = arraySearchInsertIndex.searchInsert(test, target);
        System.out.println(res2);
    }
}
