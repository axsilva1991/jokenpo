package com.br.axsilva_games.jokenpo.excecoes;

public class JokenpoDefautlException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Exceção usada para mensagens de erro genéricas.
	 *
	 * @param Recebe uma String como mensagem de exceção.
	 */
	public JokenpoDefautlException (String msg) {
		super(msg);
	}
}
