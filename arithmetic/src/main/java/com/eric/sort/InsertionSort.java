package com.eric.sort;

import java.util.Arrays;

/**
 * @DESCIRPTION 插入排序
 * 取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入
 * @AUTHOR SCORPIO.HU
 * @DATE 2019/1/3 下午7:21
 */
public class InsertionSort {

    public static void insertionSort(int[] a) {
        if (a.length <= 1) {
            return;
        }

        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }
            a[j+1] = value;
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 3, 2, 1, 5};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
