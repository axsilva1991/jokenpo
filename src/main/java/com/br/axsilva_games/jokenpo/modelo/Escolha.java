package com.br.axsilva_games.jokenpo.modelo;

import java.util.ArrayList;
import java.util.List;

import com.br.axsilva_games.jokenpo.modelo.util.Opcao;

/**
 * 
 * Classe generica responsável por definir o contrato de uma possível escolhas.
 * @author Anderson Xavier
 * @version 1.0.0
 * 
 */
public class Escolha {
	protected List<Opcao> opcaoList = new ArrayList<Opcao>();
	protected Opcao opcao;
	public void setOpcao() {
	}
	public Opcao getOpcao() {
		return opcao;
	}
	public List<Opcao> ganhaDe() {
		return opcaoList;
	}
	public List<Opcao> perderDe() {
		return opcaoList;
	}
	
	
}
