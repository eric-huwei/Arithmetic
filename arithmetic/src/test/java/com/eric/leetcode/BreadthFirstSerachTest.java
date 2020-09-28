package com.eric.leetcode;

import com.eric.util.BinaryTree;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @DESCIRPTION
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/9/29 上午12:08
 */
public class BreadthFirstSerachTest {

    @Test
    public void levelOrder() {
        Object[] obj = {1, 2, 3, 4, null, null, 5};
        BinaryTree binaryTree = new BinaryTree(obj, 0);

        BreadthFirstSerach breadthFirstSerach = new BreadthFirstSerach();
        List<List<Object>> list= breadthFirstSerach.levelOrder(binaryTree.root);
        System.out.println(Arrays.toString(list.toArray()));
    }
}