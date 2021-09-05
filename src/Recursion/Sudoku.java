package Recursion;

import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[9][9];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        solveSudoku(board, 0, 0);
    }

    public static void solveSudoku(int[][] board, int row, int col) {

        if (col == board[0].length) {
            col = 0;
            row = row + 1;
        }
        if (row == board.length) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }

        if (board[row][col] == 0) {
            for (int i = 1; i <= board.length; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = i;
                    solveSudoku(board, row, col + 1);
                    board[row][col] = 0;
                }
            }
        } else {
            solveSudoku(board, row, col + 1);
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int ele) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == ele) {
                return false;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] == ele) {
                return false;
            }
        }

        int box_r = row / 3;
        int box_c = col / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[box_r * 3 + i][box_c * 3 + j] == ele) {
                    return false;
                }
            }
        }

        return true;
    }
}
