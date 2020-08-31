package com.eric.leetcode;

import com.eric.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @DESCIRPTION 二叉树的层序遍历
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/8/31 上午12:55
 */
public class LevelOrder {


    /**
     * BFS 遍历使用队列数据结构
     */
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (null == root) {
            return levels;
        }

        recursion(root, 0);
        return levels;
    }

    private void recursion(TreeNode node, int level) {
        if (levels.size() == level) {
            levels.add(new ArrayList<Integer>());
        }

        levels.get(level).add(node.val);

        if (null != node.left) {
            recursion(node.left, level + 1);
        }
        if (null != node.right) {
            recursion(node.right, level + 1);
        }
    }
}
