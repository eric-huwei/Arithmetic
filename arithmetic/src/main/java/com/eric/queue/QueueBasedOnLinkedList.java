package com.eric.queue;

import com.eric.util.Node;

/**
 * @DESCIRPTION 基于链表实现的队列
 * @AUTHOR SCORPIO.HU
 * @DATE 2019-06-22 14:18
 */
public class QueueBasedOnLinkedList {

    public Node head = null;
    public Node tail = null;

    /**
     * 入队
     */
    public void enqueue(String data) {
        if (tail == null) {
            Node newNode = new Node(data, null);
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = new Node(data, null);
        tail = tail.next;
    }

    /**
     * 出队
     */
    public String dequeue() {
        if (head == null) {
            return null;
        }
        String ret = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return ret;
    }

    public void printAll() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + ", ");
            p = p.next;
        }
        System.out.println();
    }
}
