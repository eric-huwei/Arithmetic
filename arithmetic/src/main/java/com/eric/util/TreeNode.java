package com.eric.util;

import lombok.ToString;

/**
 * @DESCIRPTION
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/7/28 下午10:37
 */
@ToString
public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.right = null;
        this.left = null;
        this.data = data;
    }
}
