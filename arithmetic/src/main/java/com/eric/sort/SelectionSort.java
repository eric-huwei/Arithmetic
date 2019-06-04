package com.eric.sort;

import java.util.Arrays;

/**
 * @DESCIRPTION 选择排序
 * 每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾
 * @AUTHOR SCORPIO.HU
 * @DATE 2019/1/3 下午10:22
 */
public class SelectionSort {
    
    public static void selectionSort(int[] a) {
        if (a.length <= 1) {
            return;
        }

        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = {4,6,7,8,2,3,1,5};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
