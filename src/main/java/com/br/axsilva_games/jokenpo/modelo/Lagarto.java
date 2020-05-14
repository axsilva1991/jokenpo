package com.br.axsilva_games.jokenpo.modelo;

import java.util.List;

import com.br.axsilva_games.jokenpo.util.Opcao;

public class Lagarto extends Escolha {

	Lagarto() {
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
