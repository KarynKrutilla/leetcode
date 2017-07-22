package com.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/#/description
 */
public class AverageOfLevelsInBinaryTree {
    Queue<TreeNode> queue = new LinkedList<>();
    List<Double> averages = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        // Add root to queue
        queue.add(root);
        // Now traverse
        while(!queue.isEmpty()) {
            Double rowTotal = 0.0;
            // The size of the current row is what we have in the queue
            int rowSize = queue.size();
            // Look at each item in this row of the tree
            for(int i = 0; i < rowSize; i++) {
                // Get the current node
                TreeNode node = queue.poll();
                // Add its value to the total
                rowTotal += node.val;
                // Add its children to the queue
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            // Calculate the average and add to return list
            averages.add(rowTotal / rowSize);
        }
        return averages;
    }

}


/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}