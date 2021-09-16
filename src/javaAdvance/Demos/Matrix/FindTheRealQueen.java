package javaAdvance.Demos.Matrix;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheRealQueen {
    public static int SIZE = 8;
    public static void main(String[] args) throws IOException {





                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                char[][] chessBoerd = new char[SIZE][SIZE];

                for (int i = 0; i < SIZE; i++) {
                    String[] line = reader.readLine().split(" ");
                    for (int j = 0; j <SIZE ; j++) {
                        chessBoerd[i][j] = line[j].charAt(0);
                    }
                }
                for (int i = 0; i < SIZE ; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (chessBoerd[i][j] == 'q'){
                            if ( isValisQueen(chessBoerd,i,j)){
                                System.out.println(i + " " + j);
                                return;
                            }
                        }
                    }
                }
            }
            private static boolean isValisQueen(char[][] board,int row,int col){
                return isQueenColumValid(board,col)&&
                        isQueenRowValid(board,row)&&
                        isQueenFirstValid(board,row,col)&&
                        isQueenSecondValid(board, row, col);
            }
            private static boolean isQueenColumValid (char[][] board,int col){
                int queenCount = 0;
                for (int i = 0; i < board.length; i++) {
                    if (board[i][col] == 'q'){
                        queenCount++;
                    }
                }
                return queenCount == 1;
            }
            private static boolean isQueenRowValid (char[][] board,int row){
                int queenCount = 0;
                for (int i = 0; i < SIZE; i++) {
                    if (board[row][i] == 'q'){
                        queenCount++;
                    }
                }
                return queenCount == 1;
            }
            private static boolean isQueenFirstValid (char[][] board,int row,int col){
                int queenCount = 0;
                for (int i = 1; row - i >= 0 && col - i >= 0 ; i++) {
                    if (board[row - i][col - i] == 'q'){
                        queenCount++;
                    }
                }
                for (int i = 1; row + i < SIZE && col + i < SIZE ; i++) {
                    if (board[row + i][col + i] == 'q'){
                        queenCount++;
                    }
                }
                return queenCount == 0;
            }
            private static boolean isQueenSecondValid (char[][] board,int row,int col){
                int queenCount = 0;
                for (int i = 1; row - i >= 0 && col + i < SIZE ; i++) {
                    if (board[row - i][col + i] == 'q'){
                        queenCount++;
                    }
                }
                for (int i = 1; row + i < SIZE && col - i >= 0; i++) {
                    if (board[row + i][col - i] == 'q'){
                        queenCount++;
                    }
                }
                return queenCount == 0;

    }
}
