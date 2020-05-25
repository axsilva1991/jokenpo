package com.br.axsilva_games.jokenpo.controller.dto;

import java.util.ArrayList;
import java.util.List;

public class JogadorResponseDTO {
	
	List<JogadorRequestDTO> jogadores = new ArrayList<JogadorRequestDTO>();
	
	public JogadorResponseDTO(List<JogadorRequestDTO> jogadores) {
		this.jogadores = jogadores;
	}
	public List<JogadorRequestDTO> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<JogadorRequestDTO> jogadores) {
		this.jogadores = jogadores;
	}
}
