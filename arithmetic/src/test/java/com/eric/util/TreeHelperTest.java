package com.eric.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @DESCIRPTION
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/7/28 下午10:41
 */
public class TreeHelperTest {

    @Test
    public void createTreeNode() {
        String treeNodeValues = "3,9,20,#,#,15,7";
        TreeHelper treeHelper = new TreeHelper();
        treeHelper.setValues(treeNodeValues);

        TreeNode root = treeHelper.createTree();
        System.out.println("创建二叉树成功！" + root.toString());
        System.out.println("二叉树深度" + treeHelper.getTreeHeight(root));
    }


    public static void main(String[] args) {
        String treeNodeValues = "1,2,#,#,3,4,#,#,5,6,#,8,#,#";
        TreeHelper treeHelper = new TreeHelper();
        treeHelper.setValues(treeNodeValues);
        try {
            TreeNode root = treeHelper.createTree();
            System.out.println("创建二叉树成功！");

            System.out.println("前序遍历二叉树：");
            treeHelper.preOrder(root);
            System.out.println();

            System.out.println("中序遍历二叉树：");
            treeHelper.inOrder(root);
            System.out.println();

            System.out.println("后序遍历二叉树：");
            treeHelper.postOrder(root);
            System.out.println();

            System.out.printf("二叉树的节点数目：%d\n", treeHelper.getNodeNum(root));

            System.out.printf("二叉树的高度：%d\n", treeHelper.getTreeHeight(root));

            System.out.println("二叉树是否为二叉搜索树：" + String.valueOf(treeHelper.isBST(root)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            TreeNode rootBST = treeHelper.createSearchTree(new int[]{2, 4, 3, 1, 9, 7, 6, 8});
            System.out.println("创建二叉搜索树成功！");

            System.out.println("二叉树是否为二叉搜索树：" + String.valueOf(treeHelper.isBST(rootBST)));

            System.out.println("中序遍历二叉搜索树：");
            treeHelper.inOrder(rootBST);
            System.out.println();

            rootBST = treeHelper.insertNode(rootBST, 5);
            System.out.println("中序遍历插入5后的二叉搜索树：");
            treeHelper.inOrder(rootBST);
            System.out.println();

            rootBST = treeHelper.deleteNode(rootBST, 6);
            System.out.println("中序遍历删除6后的二叉搜索树：");
            treeHelper.inOrder(rootBST);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}