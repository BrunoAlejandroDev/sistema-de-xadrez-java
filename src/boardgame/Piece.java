package boardgame;

public class Piece {

	// ATRIBUTOS
	protected Position posicao;
	private Board tabuleiro;
	
	public Piece(Board tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null; // posicao inicial da peça sera nula pois existem metodos para atribuir posicao
	}

	public Board getTabuleiro() {
		return tabuleiro;
	}
	
}
