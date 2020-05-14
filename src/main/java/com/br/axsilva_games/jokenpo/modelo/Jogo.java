package com.br.axsilva_games.jokenpo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
	private List<Jogador> jogadores = new ArrayList<Jogador>();

	public Jogo(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Jogador jogadorVencedor(Jogador jogador, Jogador jogador2) {
		if(jogador.getEscolha().perderDe().contains(jogador2.getEscolha().opcao)) return jogador2;
		return jogador;
	}
}
