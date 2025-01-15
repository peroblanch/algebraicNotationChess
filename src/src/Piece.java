package src;

import java.util.*;

public interface Piece{

    public String getPosition();

    public List<String> getMoves(Board board);

    public boolean movePiece(String newPosition, Board board);

    public boolean captured();

    public char getColor();

    public char getPiece();

    public int getValue();
}