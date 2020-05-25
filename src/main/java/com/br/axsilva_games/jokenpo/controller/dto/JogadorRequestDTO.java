package com.br.axsilva_games.jokenpo.controller.dto;

public class JogadorRequestDTO {
	private String nome;
	private String jogada;
	
	public JogadorRequestDTO(String nome, String jogada) {
		this.nome = nome;
		this.jogada = jogada;
	}
	public JogadorRequestDTO(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getJogada() {
		return jogada;
	}
	public void setJogada(String jogada) {
		this.jogada = jogada;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
