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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMoves'");
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
