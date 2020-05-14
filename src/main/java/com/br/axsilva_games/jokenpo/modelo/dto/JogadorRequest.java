package com.br.axsilva_games.jokenpo.modelo.dto;

public class JogadorRequest {
	private String nome;
	private String jogada;
	
	public JogadorRequest(String nome, String jogada) {
		this.nome = nome;
		this.jogada = jogada;
	}
	
	public String getNome() {
		return nome;
	}
	public String getJogada() {
		return jogada;
	}

}
