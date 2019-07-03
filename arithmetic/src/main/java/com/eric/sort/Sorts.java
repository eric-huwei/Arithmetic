package com.eric.sort;

import java.util.Arrays;

/**
 * @DESCIRPTION 冒泡、插入、选择
 * @AUTHOR SCORPIO.HU
 * @DATE 2019-07-03 21:39
 */
public class Sorts {

    /**
     * 冒泡排序
     * @param a 数组
     * @param n 数组大小
     */
    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        //最后一次交换位置
        int lastExchange = 0;
        //无序数组到边界，每次比较到这里即可
        int sortBorder = n - 1;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < sortBorder; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                    lastExchange = j;
                    flag = true;
                }
            }

            sortBorder = lastExchange;
            if (!flag) {
                break;
            }
        }
    }

    /**
     * 插入排序
     */
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0 ; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    /**
     * 选择排序
     */
    public static void selectionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
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
        int[] array = new int[]{3, 4, 2, 1, 5, 6, 7, 8};
        selectionSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

}
