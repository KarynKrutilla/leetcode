package com.leetcode.easy;

import com.leetcode.common.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */
public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + (Math.max(maxDepth(root.left), maxDepth(root.right)));
    }
}
