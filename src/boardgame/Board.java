package boardgame;

public class Board {

	// ATRIBUTOS
	private int rows;
	private int columns;
	private Piece[][] pieces; // matriz de peças
	
	// CONSTRUTOR
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	// GETTERS E SETTERS
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	// METODOS PUBLICOS
	public Piece piece(int row, int column) { 
		return pieces[row][column]; // retorno da peça via linha e coluna
	}
	
	public Piece piece(Position position) { // Sobrecarga de método
		return pieces[position.getRow()][position.getColumn()]; // retorno da peça via posição
	}
	
}
