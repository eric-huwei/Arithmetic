package com.eric.leetcode;

/**
 * @DESCIRPTION 移动零
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/7/28 下午11:50
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
