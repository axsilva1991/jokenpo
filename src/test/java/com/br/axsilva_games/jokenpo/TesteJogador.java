package com.br.axsilva_games.jokenpo;

import java.util.ArrayList;
import java.util.List;

import com.br.axsilva_games.jokenpo.modelo.Jogador;
import com.br.axsilva_games.jokenpo.modelo.Jogo;
import com.br.axsilva_games.jokenpo.modelo.Pedra;
import com.br.axsilva_games.jokenpo.modelo.Spock;
import com.br.axsilva_games.jokenpo.util.Opcao;

public class TesteJogador {

	public static void main(String[] args) {
		List<Jogador> jogadores = new ArrayList<Jogador>();
		Jogador jogador = new Jogador("Jogador 1", new Spock());
		Jogador jogador2 = new Jogador("Anderson", new Pedra());
		jogadores.add(jogador);
		jogadores.add(jogador2);
		Jogo jogo = new Jogo(jogadores);
		System.out.println(jogo.jogadorVencedor(jogador , jogador2));
	}

}
