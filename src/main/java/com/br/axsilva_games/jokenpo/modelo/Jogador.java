package com.br.axsilva_games.jokenpo.modelo;

public class Jogador {
	private String nome;
	private Escolha escolha;
	
	public Jogador(String nome, Escolha escolha) {
		this.nome = nome;
		this.escolha = escolha;
	}

	public String getNome() {
		return nome;
	}

	public Escolha getEscolha() {
		return this.escolha;
	}

	@Override
	public String toString() {
		return "Jogador [" + nome + ", Opcao:" + escolha.opcao+"]";
	}
	
	
}
