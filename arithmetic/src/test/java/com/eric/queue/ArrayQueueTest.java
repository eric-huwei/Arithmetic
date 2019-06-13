package com.eric.queue;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Queue;

/**
 * @DESCIRPTION
 * @AUTHOR SCORPIO.HU
 * @DATE 2019-06-13 22:28
 */
public class ArrayQueueTest {

    ArrayQueue arrayQueue = new ArrayQueue(5);

    @Before
    public void before() {
        arrayQueue.enqueue("a");
        arrayQueue.enqueue("b");
        arrayQueue.enqueue("c");
        arrayQueue.enqueue("d");
        arrayQueue.enqueue("e");
    }

    @Test
    public void testEnqueue() {
        System.out.println(Arrays.toString(arrayQueue.getItems()));
        arrayQueue.dequeue();
        System.out.println(arrayQueue.getItems()[arrayQueue.getHead()]);
        arrayQueue.enqueue("f");
        System.out.println(Arrays.toString(arrayQueue.getItems()));
    }
}
