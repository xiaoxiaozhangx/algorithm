package org.example.leetcode;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {6,5,4,3, 2, 1,77,88,99,55};
        nums = sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    static int[] mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (r + p) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
        return A;

    }

    static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int left[] = new int[n1 + 1];
        int right[] = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            left[i] = A[p + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = A[q + i + 1];
        }
        left[n1] = 500000;
        right[n2] = 500000;
        int i = 0, j = 0;
        for (int k = 0; k < r-p+1; k++) {
            //书中没有用到哨兵呀？
            if (left[i] == 500000) {
                A[p+k] = right[j];
                j++;
                continue;
            }
            if (right[j] == 500000) {
                A[p+k] = left[i];
                i++;
                continue;
            }
            if (left[i] <= right[j]) {
                A[p+k] = left[i];
                i++;
            } else {
                A[p+k] = right[j];
                j++;
            }
        }
    }
}
