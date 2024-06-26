package boardgame;

public class BoardException extends RuntimeException { // tratamento de exceçoes do jogo

	private static final long serialVersionUID = 1L;
	
	public BoardException(String msg) { 
		super(msg);
	}
	
}

/* 
 	toda vez que uma Board Exception for lançada, a mensagem personalizada será repassada para a superClasse,
 	que é a RunTimeException 
*/
