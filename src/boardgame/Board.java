package boardgame;

public class Board {

	// ATRIBUTOS
	private int rows;
	private int columns;
	private Piece[][] pieces; // matriz de peças
	
	// CONSTRUTOR
	public Board(int rows, int columns) {
		
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro ao criar tabuleiro: é necessário ao menos uma linha e uma coluna");
		}
		
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
	
	// metodo para inserir uma posição para uma peça
	public Piece piece(int row, int column) { 
		
		if (!positionExists(row, column)) { // verifica se a posição existe
			throw new BoardException("Posição não existe no tabuleiro");
		}
		
		return pieces[row][column]; // retorno da peça via linha e coluna
	}
	
	// metodo para inserir uma posição para uma peça
	public Piece piece(Position position) {
		
		if (!positionExists(position)) { // verifica se a posição existe
			throw new BoardException("Posição não existe no tabuleiro");
		}
		
		return pieces[position.getRow()][position.getColumn()]; // retorno da peça via posição
	}
	
	// metodo para inserir uma peça no tabuleiro
	public void placePiece(Piece piece, Position position) {
		
		if (thereIsAPiece(position)) { // verifica se uma peça já existe antes de inserir na posição
			throw new BoardException("Já existe uma peça na posição " + position);
		}
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	// verificar se uma posição existe dentro do tabuleiro para determinado valor de linha e coluna
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	// verificar se uma posição existe dentro do tabuleiro para determinada posição
	private boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	// verificar se uma peça existe
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não presente no tabuleiro");
		}
		return piece(position) != null;
	}
}
