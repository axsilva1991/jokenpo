package com.br.axsilva_games.jokenpo.modelo;

import java.util.List;

import com.br.axsilva_games.jokenpo.modelo.util.Opcao;
/**
 * 
 * Classe responsável por representar as regras relacionadas a EscolhaSpock.
 * @author Anderson Xavier
 * @version 1.0.0
 * 
 */
public class EscolhaSpock extends Escolha {
	public EscolhaSpock() {
		setOpcao();
	}

	public void setOpcao() {
		this.opcao = opcao.SPOCK;
	}

	public List<Opcao> ganhaDe() {
		opcaoList.add(Opcao.PEDRA);
		opcaoList.add(Opcao.TESOURA);
		return opcaoList;
	}

	public List<Opcao> perderDe() {
		opcaoList.add(Opcao.PAPEL);
		opcaoList.add(Opcao.LAGARTO);
		return opcaoList;
	}

}
