package boardgame;

public class Piece {

	// ATRIBUTOS
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // posicao inicial da peça sera nula pois existem metodos para atribuir posicao
	}

	public Board getTabuleiro() {
		return board;
	}
	
}
