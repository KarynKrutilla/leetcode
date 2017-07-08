package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/#/description
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> returnList = new ArrayList<>();
        for(int i = 1; i <= n ; i ++) {
            String s = "";
            if(i % 3 == 0) {
                s += "Fizz";
            }
            if(i % 5 == 0) {
                s += "Buzz";
            }
            if("".equals(s)) {
                s = String.valueOf(i);
            }
            returnList.add(s);
        }
        return returnList;
    }
}
