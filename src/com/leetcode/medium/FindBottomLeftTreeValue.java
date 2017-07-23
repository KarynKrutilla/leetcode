package com.leetcode.medium;

import com.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/find-bottom-left-tree-value/#/description
 */
public class FindBottomLeftTreeValue {
    Queue<TreeNode> queue = new LinkedList();

    public int findBottomLeftValue(TreeNode root) {
        // Add root node
        queue.add(root);
        // Now traverse until we look at all nodes
        while(!queue.isEmpty()) {
            // Remove root node
            root = queue.poll();
            // Add right first so it will be removed first
            if(root.right != null) {
                queue.add(root.right);
            }
            if(root.left != null) {
                queue.add(root.left);
            }
        }
        // If the queue is now empty, the last poll value is the bottom left value
        return root.val;
    }
}
