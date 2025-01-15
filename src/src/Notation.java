package src;

public class Notation {
    public static String Convert_To_Algebraic(int[][] position) {
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(position[i][j] == 1){
                    return Character.toString((char)(j + 97)) + Integer.toString(8 - i);
                }
            }
        }
        return "";
    }

    public static int[][] Convert_To_Board(String position){
        int[][] board = new int[8][8];
        int x = (int)position.charAt(0) - 97;
        int y = 8 - Character.getNumericValue(position.charAt(1));
        board[y][x] = 1;
        return board;
    }
}
