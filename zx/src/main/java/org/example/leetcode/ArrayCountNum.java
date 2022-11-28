package org.example.leetcode;

public class ArrayCountNum {
    public int search(int[] nums, int target) {
        int lb = findLeftBounds(nums, target);
        int count = 0;
        if (lb >= nums.length) {
            return 0;
        }
        while (nums[lb] == target) {
            lb++;
            count++;
            if (lb > nums.length - 1) {
                break;
            }
        }
        return count;
    }

    private int findLeftBounds(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return left;
//       // 此时 target 比所有数都大，返回 -1
//    if (left == nums.length) return -1;
//    // 判断一下 nums[left] 是不是 target
//    return nums[left] == target ? left : -1;
    }

    private int findRightBounds(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;// 寻找有边界，左边界缩小，左边界是闭区间，
                // 去除已经判断过的mid，所以mid+1,所以，mid=left-1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }

        }
        if ((left - 1) < 0) return -1;
        return nums[left - 1] == target ? (left - 1) : -1;
    }

    public static void main(String[] args) {
        ArrayCountNum arrayCountNum = new ArrayCountNum();
        int[] test = {2, 2};
        int res = arrayCountNum.findLeftBounds(test, 3);
        System.out.println(res);
        int res2 = arrayCountNum.search(test, 3);
        System.out.println(res2);
    }
}
