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
public class EscolhaTesoura extends Escolha {

	public EscolhaTesoura() {
		setOpcao();
	}

	public void setOpcao() {
		this.opcao = Opcao.TESOURA;
	}

	@Override
	public List<Opcao> ganhaDe() {
		opcaoList.add(Opcao.PAPEL);
		opcaoList.add(Opcao.LAGARTO);
		return opcaoList;
	}

	@Override
	public List<Opcao> perderDe() {
		opcaoList.add(Opcao.PEDRA);
		opcaoList.add(Opcao.SPOCK);
		return opcaoList;
	}

}
