package com.br.axsilva_games.jokenpo.modelo;

import java.util.List;

import com.br.axsilva_games.jokenpo.modelo.util.Opcao;
/**
 * 
 * Classe responsável por representar as regras relacionadas a EscolhaPedra.
 * @author Anderson Xavier
 * @version 1.0.0
 * 
 */
public class EscolhaPedra extends Escolha {

	public EscolhaPedra() {
		setOpcao(); 
	}

	public void setOpcao() {
		this.opcao = Opcao.PEDRA;
	}
	@Override
	public List<Opcao> ganhaDe() {
		this.opcaoList.add(Opcao.LAGARTO);
		this.opcaoList.add(Opcao.TESOURA);
		return this.opcaoList;
	}

	@Override
	public List<Opcao> perderDe() {
		this.opcaoList.add(Opcao.PAPEL);
		this.opcaoList.add(Opcao.SPOCK);
		return this.opcaoList;
	}

}
