package com.eric.leetcode;

/**
 * @DESCIRPTION 魔术索引
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/7/31 下午11:22
 */
public class FindMagicIndex {

    public int findMagicIndex (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                return i;
            }
        }
        return -1;
    }
}
