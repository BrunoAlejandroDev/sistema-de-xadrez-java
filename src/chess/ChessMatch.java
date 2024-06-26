package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	// ATRIBUTOS
	private Board board;

	// CONSTRUTOR
	public ChessMatch() {
		board = new Board(8, 8); // definição do tamanho do tabuleiro (classe board)
		initialSetup();
	}
	
	// METODOS
	public ChessPiece[][] getPieces() {
		
		ChessPiece[][] matrizPieces = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				matrizPieces[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return matrizPieces;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
	}
	
}
