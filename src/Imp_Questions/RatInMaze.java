package Imp_Questions;
import java.util.Scanner;

public class RatInMaze {
    public static boolean flag = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        char [][] maze = new char[m][n];
        boolean [][] isUsed = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        mazePathFun(0,0,maze,isUsed);
        if(!flag){
            System.out.println("NO PATH FOUND");
        }

    }

    private static void mazePathFun(int row, int col, char[][] maze, boolean [][] isUsed) {

        if(row==maze.length||col==maze[0].length||row<0||col<0||maze[row][col]=='X'||isUsed[row][col]){
            return;
        }
        if(row==maze.length-1&&col==maze[0].length-1){
            flag = true;
            isUsed[row][col] = true;

            printMaze(isUsed);
            return;
        }

        isUsed[row][col] = true;
        mazePathFun(row, col-1, maze, isUsed);
        mazePathFun(row, col+1, maze, isUsed);
        mazePathFun(row - 1, col, maze,isUsed);
        mazePathFun(row + 1, col, maze, isUsed);
        isUsed[row][col] = false;

    }

    private static void printMaze(boolean[][] isUsed) {
        for (int i = 0; i < isUsed.length; i++) {
            for (int j = 0; j < isUsed[0].length; j++) {

                if(isUsed[i][j]){
                    System.out.print(1+" ");
                }else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
