package src;

public class Board {

    private Piece[][] board;

    public Board(boolean GameStart) {
        board = new Piece[8][8];

        if(GameStart){

        }
    }

    public boolean addPiece(Piece piece, String position){
        int x = Notation.Pos_To_XIndex(position);
        int y = Notation.Pos_To_YIndex(position);
        if(board[x][y] == null){
            board[x][y] = piece;
            return true;
        }
        return false;
    }

    public boolean movePiece(Piece piece, String position){
        if(piece.movePiece(position, this)){
            return true;
        }
        return false;
    }

    public Piece[][] getBoard(){
        return board;
    }
}
