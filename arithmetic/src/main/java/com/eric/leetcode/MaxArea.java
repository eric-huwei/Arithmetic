package com.eric.leetcode;

/**
 * @DESCIRPTION 盛水最多的容器
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/7/29 下午9:12
 */
public class MaxArea {

    public int maxArea(int[] array) {
        int left = 0, right = array.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = array[left] < array[right] ?
                Math.max((right - left) * array[left++], maxArea) : Math.max((right - left) * array[right--], maxArea);
        }

        return maxArea;
    }
}
