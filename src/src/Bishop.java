package src;

import java.util.*;

public class Bishop implements Piece {
    private String position;
    private char color;
    private boolean captured;

    public Bishop(String startingPosition, char color){
        position = startingPosition;
        this.color = color;
        captured = false;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public List<String> getMoves(Board board) {
        int x = Notation.Pos_To_XIndex(position);
        int y = Notation.Pos_To_YIndex(position);

        List<String> possibleMoves = new ArrayList<>();

        Piece[][] checkPos = board.getBoard();

        boolean pXY = true;
        boolean pXmY = true;
        boolean mXpY = true;
        boolean mXY = true;

        for(int i = 1; i<8; i++){
            if(x+i<8){
                if(y+i<8){
                    if(checkPos[x+i][y+i] == null && pXY){
                        int[][] temp = new int[8][8];
                        temp[x+i][y+i] = 1;
                        possibleMoves.add(""+getPiece()+Notation.Convert_To_Algebraic(temp));
                    } else if (checkPos[x+i][y+i] != null && pXY){
                        int[][] temp = new int[8][8];
                        temp[x+i][y+i] = 1;
                        pXY = false;
                        possibleMoves.add(""+getPiece()+"x"+Notation.Convert_To_Algebraic(temp));
                    }
                }
                if(y-i>=0){
                    if(checkPos[x+i][y-i] == null && pXmY){
                        int[][] temp = new int[8][8];
                        temp[x+i][y-i] = 1;
                        possibleMoves.add(""+getPiece()+Notation.Convert_To_Algebraic(temp));
                    } else if (checkPos[x+i][y-i] != null && pXmY){
                        int[][] temp = new int[8][8];
                        temp[x+i][y-i] = 1;
                        pXmY = false;
                        possibleMoves.add(""+getPiece()+"x"+Notation.Convert_To_Algebraic(temp));
                    }
                }
            }
            if(x-i>=0){
                if(y+i<8){
                    if(checkPos[x-i][y+i] == null && mXpY){
                        int[][] temp = new int[8][8];
                        temp[x-i][y+i] = 1;
                        possibleMoves.add(""+getPiece()+Notation.Convert_To_Algebraic(temp));
                    }
                    else if (checkPos[x-i][y+i] != null && mXpY){
                        int[][] temp = new int[8][8];
                        temp[x-i][y+i] = 1;
                        mXpY = false;
                        possibleMoves.add(""+getPiece()+"x"+Notation.Convert_To_Algebraic(temp));
                    }
                }
                if(y-i>=0){
                    if(checkPos[x-i][y-i] == null && mXY){
                        int[][] temp = new int[8][8];
                        temp[x-i][y-i] = 1;
                        possibleMoves.add(""+getPiece()+Notation.Convert_To_Algebraic(temp));
                    } else if(checkPos[x-i][y-i] != null && mXY){
                        int[][] temp = new int[8][8];
                        temp[x-i][y-i] = 1;
                        mXY = false;
                        possibleMoves.add(""+getPiece()+"x"+Notation.Convert_To_Algebraic(temp));
                    }
                }
            }
        }
        
        return possibleMoves;
    }

    @Override
    public boolean movePiece(String newPosition, Board board) {
        if(getMoves(board).contains(newPosition)){
            position = newPosition;
            return true;
        } return false;
    }

    @Override
    public boolean captured() {
        return captured;
    }

    @Override
    public char getColor() {
        return color;
    }

    @Override
    public char getPiece() {
        return 'B';
    }

    @Override
    public int getValue() {
        return 3;
    }

}
