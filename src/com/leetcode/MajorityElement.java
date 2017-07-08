package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/#/description
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        // If there is only one element, it is the majority element
        if(nums.length == 1) {
            return nums[0];
        }

        // Storage for number of times we see an element
        Map<Integer, Integer> appearances = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // If this value has already been seen, update the appearances
            if(appearances.keySet().contains(num)) {
                appearances.put(num, appearances.get(num)+1);
                // Then check if it's a majority element
                if(appearances.get(num) > nums.length / 2) {
                    return num;
                }
            }
            else {
                // Otherwise, this is the first appearance, so store it
                appearances.put(num,1);
            }
        }

        // Shouldn't happen - requirement is that the majority element always exists
        throw new IllegalArgumentException("majority element does not exist");
    }
}
