package com.eric.leetcode;

import com.eric.util.BinaryTree;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @DESCIRPTION
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/9/28 下午11:44
 */
public class DepthFirstSearchTest {

    @Test
    public void levelOrder() {
        Object[] obj = {1, 2, 3, 4, null, null, 5};
        BinaryTree binaryTree = new BinaryTree(obj, 0);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        List<List<Object>> list = depthFirstSearch.levelOrder(binaryTree.root);
        System.out.println(Arrays.toString(list.toArray()));
    }
}