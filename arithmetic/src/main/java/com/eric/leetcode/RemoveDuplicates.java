package com.eric.leetcode;

/**
 * @DESCIRPTION 删除排序数组中的重复项
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/8/2 下午11:48
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
