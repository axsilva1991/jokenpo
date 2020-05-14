package com.br.axsilva_games.jokenpo.modelo.dto;

public class JogadorResponse {
	JogadorRequest jogador;
	String mensagem;
	public JogadorResponse(String mensagem) {
		this.mensagem = mensagem;
	}
	public JogadorResponse(JogadorRequest jogador,String mensagem) {
		this.mensagem = mensagem;
		this.jogador = jogador;

	}
}
