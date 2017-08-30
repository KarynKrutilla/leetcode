package com.leetcode.medium;

/**
 * https://leetcode.com/problems/battleships-in-a-board/description/
 */
public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int count = 0;

        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.') {
                    continue; // current spot is '.', move on
                }
                if(i > 0 &&  board[i-1][j] == 'x') {
                    continue; // middle of a horizontal ship
                }
                if(j > 0 && board[i][j-1] == 'x')
                {
                    continue; // middle of a vertical ship
                }
                count++; // otherwise, increase count
            }
        }
        return count;
    }
}
