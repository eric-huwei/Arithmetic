package com.eric.util;

import org.junit.Test;

/**
 * @DESCIRPTION
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/9/13 下午10:57
 */
public class BinaryTreeTest {

    @Test
    public void testPreOrder() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        BinaryTree tree = new BinaryTree(arr, 0);
        tree.preOrder(tree.root);
    }
}