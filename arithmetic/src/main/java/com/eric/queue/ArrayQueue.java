package com.eric.queue;

/**
 * @DESCIRPTION 用数组实现队列
 * @AUTHOR SCORPIO.HU
 * @DATE 2019-06-13 21:52
 */
public class ArrayQueue {

    //数组、数组大小
    private String[] items;
    private int n;

    //队头、队尾下标
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    /**
     * 入队
     */
    public boolean enqueue(String item) {
        if (tail == n) {
            if (head == 0) {
                return false;
            }

            for (int i = head; i < tail; i++) {
                items[i - head] = items[i];
            }
            tail = tail - head;
            head = 0;
        }

        items[tail] = item;
        tail++;
        return true;
    }

    /**
     * 出队
     */
    public String dequeue() {
        if (head == tail) {
            return null;
        }

        String ret = items[head];
        head++;
        return ret;
    }

    public String[] getItems() {
        return items;
    }

    public int getHead() {
        return head;
    }

}
