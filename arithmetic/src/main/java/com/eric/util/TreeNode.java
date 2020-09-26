package com.eric.util;

import lombok.ToString;

/**
 * @DESCIRPTION
 * @AUTHOR SCORPIO.HU
 * @DATE 2020/7/28 下午10:37
 */
@ToString
public class TreeNode {

    public Object data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Object obj) {
        this.data = obj;
    }

    @Override
    public String toString() {
        return data + " ";
    }


}
