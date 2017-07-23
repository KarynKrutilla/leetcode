package com.leetcode.easy;

import com.leetcode.common.TreeNode;

/**
 * https://leetcode.com/problems/merge-two-binary-trees/#/description
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // If either tree is null, return the other
        if(t1 == null) {
            return t2;
        }
        else if(t2 == null) {
            return t1;
        }

        // Create new root node combining t1 and t2
        TreeNode node = new TreeNode(t1.val + t2.val);
        // Merge both sides of the tree
        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t1.right, t2.right);

        return node;
    }
}