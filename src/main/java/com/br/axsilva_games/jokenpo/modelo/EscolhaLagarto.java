package com.br.axsilva_games.jokenpo.modelo;

import java.util.List;

import com.br.axsilva_games.jokenpo.modelo.util.Opcao;
/**
 * 
 * Classe responsável por representar as regras relacionadas a EscolhaLagarto.
 * @author Anderson Xavier
 * @version 1.0.0
 * 
 */
public class EscolhaLagarto extends Escolha {

	public EscolhaLagarto() {
		setOpcao(); 
	}

	public void setOpcao() {
		this.opcao = Opcao.LAGARTO;
	}
	
	public List<Opcao> ganhaDe() {
		opcaoList.add(Opcao.SPOCK);
		opcaoList.add(Opcao.PAPEL);
		return opcaoList;
	}

	
	public List<Opcao> perderDe() {
		opcaoList.add(Opcao.PEDRA);
		opcaoList.add(Opcao.TESOURA);
		return opcaoList;
	}

}
