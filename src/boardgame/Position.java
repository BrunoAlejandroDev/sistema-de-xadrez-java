package boardgame;

public class Position {

	// ATRIBUTOS
	private int row;
	private int column;
	
	// CONSTRUTOR
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	// GETTERS E SETTERS
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	// METODOS PUBLICOS
	@Override
	public String toString() {
		return "Posição da peça [Linha: " + row + ", Coluna: " + column + "]";
	}
	
}
