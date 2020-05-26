package com.br.axsilva_games.jokenpo.controller.dto;

public class JogadorItemResponseDTO {
	private String nome;
	private String jogada;
	

	public JogadorItemResponseDTO(String nome, String jogada) {
		this.nome = nome;
		this.jogada = jogada;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getJogada() {
		return jogada;
	}
	public void setJogada(String jogada) {
		this.jogada = jogada;
	}
	
	
}

