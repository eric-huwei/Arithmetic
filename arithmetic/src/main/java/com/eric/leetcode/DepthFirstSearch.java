package com.eric.leetcode;

import com.eric.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @DESCIRPTION 深度优先搜索
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/9/27 下午11:10
 */
public class DepthFirstSearch {

    public List<List<Object>> levelOrder(TreeNode root) {
        List<List<Object>> allResults = new ArrayList<>();
        if (root == null) {
            return allResults;
        }

        travel(root, 0, allResults);
        return allResults;
    }

    private void travel(TreeNode root, int level, List<List<Object>> results) {
        if (results.size() == level) {
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.data);
        if (null != root.left) {
            travel(root.left, level + 1, results);
        }
        if (null != root.right) {
            travel(root.right, level + 1, results);
        }
    }
}
