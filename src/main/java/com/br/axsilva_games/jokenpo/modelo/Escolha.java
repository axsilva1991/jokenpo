package com.br.axsilva_games.jokenpo.modelo;

import java.util.ArrayList;
import java.util.List;

import com.br.axsilva_games.jokenpo.util.Opcao;

public class Escolha {
	protected List<Opcao> opcaoList = new ArrayList<Opcao>();
	protected Opcao opcao;
	public void setOpcao() {
		
	}
	public List<Opcao> ganhaDe() {
		return opcaoList;
	}
	public List<Opcao> perderDe() {
		return opcaoList;
	}
	
	
}
