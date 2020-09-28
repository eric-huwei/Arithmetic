package com.eric.leetcode;

import com.eric.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @DESCIRPTION 广度优先搜索
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/9/28 下午11:51
 */
public class BreadthFirstSerach {

    public List<List<Object>> levelOrder(TreeNode root) {
        List<List<Object>> allResults = new ArrayList<>();
        if (null == root) {
            return allResults;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Object> results = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                results.add(node.data);
                if (null != node.left) {
                    nodes.add(node.left);
                }
                if (null != node.right) {
                    nodes.add(node.right);
                }
            }
            allResults.add(results);
        }
        return allResults;
    }

}
