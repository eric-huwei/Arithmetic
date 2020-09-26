package com.eric.util;

/**
 * @DESCIRPTION 二叉树工具类
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/9/26 下午10:09
 */
public class BinaryTree {

    public TreeNode root = null;


    public BinaryTree(int[] array, int index) {
        root = createBinaryTree(array, index);
    }

    /**
     * 创建二叉树
     */
    private TreeNode createBinaryTree(int[] array, int index) {
        TreeNode treeNode = null;
        if (index < array.length) {
            treeNode = new TreeNode(array[index]);
            // 对于顺序存储的完全二叉树，如果某个节点的索引为index，其对应的左子树的索引为2*index+1，右子树为2*index+1
            treeNode.left = createBinaryTree(array, 2 * index + 1);
            treeNode.right = createBinaryTree(array, 2 * index + 2);
        }
        return treeNode;
    }

    /**
     * 前序遍历
     */
    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
