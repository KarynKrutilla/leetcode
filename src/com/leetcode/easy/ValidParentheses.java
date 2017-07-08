package com.leetcode.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/valid-parentheses/#/description
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        // init
        List openers = Arrays.asList("(","{","[");
        LinkedList<String> list = new LinkedList<>();

        for(int i = 0; i < s.length(); i++) {
            // If current char is an opener, add to the list
            String currentChar = String.valueOf(s.charAt(i));
            if(openers.contains(currentChar)) {
                list.add(currentChar);
            }
            else { // must be a closer
                // If list is empty, we must be unbalanced
                if(list.isEmpty()) {
                    return false;
                }
                // Otherwise, check if the first element contains the complement
                String fromList = list.removeLast();
                if(!((")".equals(currentChar) && "(".equals(fromList))
                        || ("}".equals(currentChar) && "{".equals(fromList))
                        || ("]".equals(currentChar) && "[".equals(fromList)))) {
                    return false;
                }
            }
        }
        // If we reached this point, our solution is valid if all pairs have been taken care of (meaning list is empty)
        return list.isEmpty();
    }
}
