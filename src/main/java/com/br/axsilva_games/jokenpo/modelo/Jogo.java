package com.br.axsilva_games.jokenpo.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.br.axsilva_games.jokenpo.excecoes.JokenpoDefautlException;

/**
 * Classe responsável por representar um jogo de Jokenpo da axisilva Games.
 * 
 * @author Anderson Xavier
 * @version 1.0.0
 * 
 */
public class Jogo {
	private Collection<Jogador> jogadores = new ArrayList<Jogador>();
	/**
	 * Constructor responsável por adicionar os jogadores no game.
	 * 
	 * @param jogadores
	 */
	public Jogo(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	/**
	 * Método responsável por executar a regra de vencedores entre 2 jogadores.
	 * 
	 * @param jogador1
	 * @param jogador2
	 */
	private Jogador disputa(Jogador jogador1, Jogador jogador2) {
		if (jogador1.getEscolha().ganhaDe().contains(jogador2.getEscolha().opcao))
			return jogador1;
		return jogador2;
	}

	/**
	 * Método responsável por retornar o jogador vencedor do jogo
	 * @param Recebe uma lista de jogadores.
	 * @return Tetorna o Jogador vencedor
	 * @throws JokenpoDefautlException Caso hajam jogadas duplicadas ou empate este
	 * metodo devolve uma JokenpoDefautlException.
	 */
	public Jogador verificaVencedor(List<Jogador> jogadores) throws JokenpoDefautlException {
		Jogador vencedor = jogadores.get(0);
		for (int i = 0; i < jogadores.size() - 1; i++) {
			vencedor = disputa(vencedor, jogadores.get(i + 1));
		}
		houveEmpate(vencedor, jogadores);
		//existemJogadasDuplicadas(jogadores);
		return vencedor;
	}

	/**
	 * Método responsável validar se houve empate.
	 * 
	 * @param Recebe uma lista de jogadores.
	 * @return Tetorna o Jogador vencedor
	 * @throws JokenpoDefautlException Caso o resultado seja empate, o sistema
	 * devolve uma JokenpoDefautlException caso hajam 2 ganhadores e caso hajam empates como todos selecionem a mesma op~
	 * apção.
	 */
	private boolean houveEmpate(Jogador jogador, List<Jogador> jogadores) throws JokenpoDefautlException {
		Jogador ganhador = null;
		for (int i = 0; i < jogadores.size(); i++) {
			ganhador = disputa(jogador, jogadores.get(i));
			if(!ganhador.equals(jogador) && 
					ganhador.getEscolha().opcao.equals(jogador.getEscolha().opcao))
				throw new JokenpoDefautlException("Houve empate na partida joguem novamente.");
		}
		if (ganhador.equals(jogador))
			return false;
		throw new JokenpoDefautlException("Houve empate na partida joguem novamente.");

	}
}
