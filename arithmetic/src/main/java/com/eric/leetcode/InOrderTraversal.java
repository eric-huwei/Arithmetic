package com.eric.leetcode;

import com.eric.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @DESCIRPTION 二叉树的中序遍历
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/8/4 下午11:14
 */
public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            helper(root.left, res);
        }
        res.add(root.val);
        if (root.right != null) {
            helper(root.right, res);
        }
    }
}
