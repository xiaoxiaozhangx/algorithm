package org.example.leetcode.daolun;

import java.util.Arrays;

public class ch4_1findMaxArr {


    public static void main(String[] args) {
        int[] shares = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97};
        int high = shares.length;
        ch4_1findMaxArr findMaxArr=new ch4_1findMaxArr();
        int[] sharesChange=new int[shares.length];
        sharesChange[0]=0;
        for (int i = 1; i <sharesChange.length ; i++) {
            sharesChange[i]=shares[i]-shares[i-1];
        }
        int[] res = findMaxArr.findMaxSubArr(sharesChange, 1, sharesChange.length - 1);
        System.out.printf( "left idex ,right index,max profit= "+Arrays.toString(res) );
    }

    private int[] findMaxSubArr(int[] a, int low, int high) {
        if (high == low) {
            int[] x = {low, high, a[low]};
            return x;
        } else {
            int mid = (low + high) / 2;
            int[] left_low_high_sum = findMaxSubArr(a, low, mid);
            int[] right_low_high_sum = findMaxSubArr(a, mid + 1, high);
            int[] cross_low_high_sum = findMaxCrossSubArr(a, low, mid, high);
            if (left_low_high_sum[2] >= right_low_high_sum[2] && left_low_high_sum[2] >= cross_low_high_sum[2]) {
                return left_low_high_sum;
            } else if (right_low_high_sum[2] >= right_low_high_sum[2] && right_low_high_sum[2] >= cross_low_high_sum[2]) {
                return right_low_high_sum;
            } else {
                return cross_low_high_sum;
            }
        }

    }

    private int[] findMaxCrossSubArr(int[] a, int low, int mid, int high) {
        int left_sum = Integer.MIN_VALUE;
        int sum = 0;
        int max_left_index = 0;
        for (int i = mid; i >= low; i--) {
            sum += a[i];
            if (sum > left_sum) {
                left_sum = sum;
                max_left_index = i;
            }
        }
        int right_sum = Integer.MIN_VALUE;
        sum = 0;
        int max_right_index = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum = sum + a[i];
            if (sum > right_sum) {
                right_sum = sum;
                max_right_index = i;
            }
        }
        int[] res = {max_left_index, max_right_index, left_sum + right_sum};
        return res;
    }

}
