package com.br.axsilva_games.jokenpo;

import java.util.ArrayList;
import java.util.List;

import com.br.axsilva_games.jokenpo.excecoes.JokenpoDefautlException;
import com.br.axsilva_games.jokenpo.modelo.Jogador;
import com.br.axsilva_games.jokenpo.modelo.Jogo;
import com.br.axsilva_games.jokenpo.modelo.EscolhaLagarto;
import com.br.axsilva_games.jokenpo.modelo.EscolhaPedra;
import com.br.axsilva_games.jokenpo.modelo.EscolhaTesoura;

public class TesteModeloJogadas {

	public static void main(String[] args) {
		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(new Jogador("Jogador 1", new EscolhaPedra()));
		jogadores.add(new Jogador("Jogador 2", new EscolhaTesoura()));
		jogadores.add(new Jogador("Jogador 3", new EscolhaLagarto()));
		jogadores.add(new Jogador("Jogador 4", new EscolhaLagarto()));
		
		Jogo jogo = new Jogo(jogadores);
		try {
			System.out.println("O Vencedor foi "+jogo.verificaVencedor(jogadores));
		} catch (JokenpoDefautlException e) {
			e.printStackTrace();
		}
	}

}
