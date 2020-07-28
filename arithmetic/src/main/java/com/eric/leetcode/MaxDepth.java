package com.eric.leetcode;

import com.eric.util.TreeNode;

/**
 * @DESCIRPTION 二叉树的最大深度
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/7/28 下午10:13
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
