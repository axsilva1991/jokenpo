package com.br.axsilva_games.jokenpo.modelo;

import java.util.ArrayList;
import java.util.List;

import com.br.axsilva_games.jokenpo.util.Opcao;

public class Tesoura extends Escolha {

	Tesoura() {
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
