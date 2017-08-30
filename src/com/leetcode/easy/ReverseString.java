package com.leetcode.easy;

/**
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= s.length(); i++) {
            sb.append(s.charAt(s.length()-i));
        }
        return sb.toString();
    }
}
