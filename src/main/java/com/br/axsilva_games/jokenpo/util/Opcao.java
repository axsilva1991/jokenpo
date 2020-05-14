package com.br.axsilva_games.jokenpo.util;

public enum Opcao {
	PEDRA("pedra"),
	PAPEL("papel"),
	TESOURA("tesoura"),
	SPOCK("spock"),
	LAGARTO("lagarto");
	
	private String opcao;
	
	private Opcao(String opcao) {
		this.opcao = opcao;
	}

	public String getOpcao() {
		return this.opcao;
	}
}
