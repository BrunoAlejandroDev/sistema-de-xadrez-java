package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8); // definição do tamanho do tabuleiro (classe board)
	}
	
	public ChessPiece[][] getPieces() {
		
		ChessPiece[][] matrizPieces = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				matrizPieces[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return matrizPieces;
	}
	
}
