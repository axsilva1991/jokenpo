package com.br.axsilva_games.jokenpo.modelo;

import java.util.List;

import com.br.axsilva_games.jokenpo.util.Opcao;

public class Papel extends Escolha {
	Papel() {
		setOpcao(); 
	}

	public void setOpcao() {
		this.opcao = opcao.PAPEL;
	}

	public List<Opcao> ganhaDe() {
		this.opcaoList.add(Opcao.PEDRA);
		this.opcaoList.add(Opcao.SPOCK);
		return this.opcaoList;
	}

	public List<Opcao> perderDe() {
		this.opcaoList.add(Opcao.TESOURA);
		this.opcaoList.add(Opcao.LAGARTO);
		return this.opcaoList;
	}

}
