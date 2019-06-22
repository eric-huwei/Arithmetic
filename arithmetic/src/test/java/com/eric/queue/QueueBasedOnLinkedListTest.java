package com.eric.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @DESCIRPTION
 * @AUTHOR SCORPIO.HU
 * @DATE 2019-06-22 14:50
 */
public class QueueBasedOnLinkedListTest {

    QueueBasedOnLinkedList queueBasedOnLinkedList = new QueueBasedOnLinkedList();

    @Before
    public void setUp() throws Exception {
        queueBasedOnLinkedList.enqueue("a");
        queueBasedOnLinkedList.enqueue("b");
        queueBasedOnLinkedList.enqueue("c");
        queueBasedOnLinkedList.enqueue("d");
        queueBasedOnLinkedList.enqueue("e");
    }

    @Test
    public void printQueue() {
        queueBasedOnLinkedList.dequeue();
        queueBasedOnLinkedList.printAll();
        Assert.assertEquals("b", queueBasedOnLinkedList.head.data);
    }
}