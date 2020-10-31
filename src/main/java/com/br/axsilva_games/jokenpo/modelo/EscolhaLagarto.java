package com.br.axsilva_games.jokenpo.modelo;

import java.util.List;

import com.br.axsilva_games.jokenpo.modelo.util.Opcao;

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
