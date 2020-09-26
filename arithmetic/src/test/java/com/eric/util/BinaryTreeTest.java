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
        Object[] obj = {1, 2, 3, 4, null, null, 5};
        BinaryTree binaryTree = new BinaryTree(obj, 0);
        binaryTree.preOrder(binaryTree.root);
    }
}