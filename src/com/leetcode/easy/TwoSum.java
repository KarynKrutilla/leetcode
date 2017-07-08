package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/two-sum/#/description
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int requiredValue = target - nums[i];
            Set seenValues = seenNumbers.keySet();
            if(seenValues.contains(requiredValue)) {
                int otherIndex = seenNumbers.get(requiredValue);
                return new int[]{i, otherIndex};
            }
            seenNumbers.put(nums[i], i);
        }
        return null;
    }
}
