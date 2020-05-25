package com.br.axsilva_games.jokenpo.excecoes;

public class JokenpoDefautlException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Exce��o usada para mensagens de erro gen�ricas.
	 *
	 * @param Recebe uma String como mensagem de exce��o.
	 */
	public JokenpoDefautlException (String msg) {
		super(msg);
	}
}
