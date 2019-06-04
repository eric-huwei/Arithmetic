package com.eric.sort;

import java.util.Arrays;

/**
 * @DESCIRPTION 冒泡排序
 * 冒泡排序只会操作相邻的两个数据
 * @AUTHOR SCORPIO.HU
 * @DATE 2019/1/3 下午7:21
 */
public class BubbleSort {

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5,3,2,7,6,4,1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
