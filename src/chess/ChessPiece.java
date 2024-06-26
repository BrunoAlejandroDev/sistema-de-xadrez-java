package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	// ATRIBUTOS
	private Color color;

	// CONSTRUTOR
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getCor() {
		return color;
	}
	
}
