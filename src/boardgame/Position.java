package boardgame;

public class Position {

	// ATRIBUTOS
	private int linha;
	private int coluna;
	
	// CONSTRUTOR
	public Position(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	// GETTERS E SETTERS
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	// METODOS PUBLICOS
	@Override
	public String toString() {
		return "Posição da peça [Linha: " + linha + ", Coluna: " + coluna + "]";
	}
	
}
