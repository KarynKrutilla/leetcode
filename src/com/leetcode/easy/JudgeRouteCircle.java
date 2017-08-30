package com.leetcode.easy;

/**
 * https://leetcode.com/problems/judge-route-circle/description/
 */
public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;

        for(int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if('L' == move) {
                horizontal++;
            }
            else if('R' == move) {
                horizontal--;
            }
            else if('U' == move) {
                vertical++;
            }
            else if('D' == move) {
                vertical--;
            }
        }

        return vertical == 0 && horizontal == 0;
    }
}
