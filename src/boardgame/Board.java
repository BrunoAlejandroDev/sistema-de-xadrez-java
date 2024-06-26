package boardgame;

public class Board {

	// ATRIBUTOS
	private int linhas;
	private int colunas;
	private Piece[][] pecas; // matriz de peças
	
	// CONSTRUTOR
	public Board(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Piece[linhas][colunas]; // pq pecas recebeu em seus valores de matriz linha coluna
	}

	// GETTERS E SETTERS
	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
}
