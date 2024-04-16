package com.interview.string;

public class FindWinnerInTicTokGame {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'o','o','o'},
                {'x','x','o'},
                {'x','o','x'}};

        char winner = findWinner(board);

        System.out.println("Winner:" + winner);
    }

    private static char findWinner(char[][] board) {
        // write this
        int size = board.length;
        for(int i = 0 ;  i  < size ; i++){
            if(board[i][0] ==board[i][1] &&
                    board[i][1] ==board[i][2]){
                return board[i][0];
            }
        }
        return 'x';
    }
}
