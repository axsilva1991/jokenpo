package com.br.axsilva_games.jokenpo.modelo;

import com.br.axsilva_games.jokenpo.util.Opcao;

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
		return "Jogador Vencedor foi: " + nome + ", escolhendo a op��o:" + escolha.opcao;
	}
	
	
}
