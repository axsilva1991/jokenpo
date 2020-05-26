package com.br.axsilva_games.jokenpo.controller.dto.request;

public class JogadorRequestDTO {
	private String nome;
	private String jogada;
	
	public JogadorRequestDTO() {
	}
	
	public JogadorRequestDTO(String nome, String jogada) {
		this.nome = nome;
		this.jogada = jogada;
	}

	public String getNome() {
		return nome;
	}
	public String getJogada() {
		return jogada;
	}

	@Override
	public String toString() {
		return "JogadorRequestDTO [nome=" + nome + ", jogada=" + jogada + "]";
	}

	
}
