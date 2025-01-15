package test;

public class ConverterTest {
    public static void main(String[] args) {
        int[][] board = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 1}, 
                                    new int[]{0, 0, 0, 0, 0, 0, 0, 0}, 
                                    new int[]{0, 0, 0, 0, 0, 0, 0, 0}, 
                                    new int[]{0, 0, 0, 0, 0, 0, 0, 0}, 
                                    new int[]{0, 0, 0, 0, 0, 0, 0, 0}, 
                                    new int[]{0, 0, 0, 0, 0, 0, 0, 0}, 
                                    new int[]{0, 0, 0, 0, 0, 0, 0, 0}, 
                                    new int[]{0, 0, 0, 0, 0, 0, 0, 0}};
        System.out.println(src.Notation.Convert_To_Algebraic(board));
        System.out.println(src.Notation.Convert_To_Algebraic(src.Notation.Convert_To_Board("h8")));
    }
}
