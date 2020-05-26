package com.br.axsilva_games.jokenpo.controller.dto.response;

import java.util.ArrayList;
import java.util.List;

public class JogadorResponseDTO {
	
	List<JogadorItemResponseDTO> jogadores = new ArrayList<JogadorItemResponseDTO>();
	String mensagem;
	
	public JogadorResponseDTO(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public JogadorResponseDTO(List<JogadorItemResponseDTO> jogadores) {
		this.jogadores = jogadores;
	}

	public JogadorResponseDTO(List<JogadorItemResponseDTO> jogadores, String mensagem) {
		this.jogadores = jogadores;
		this.mensagem = mensagem;
	}
	public List<JogadorItemResponseDTO> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<JogadorItemResponseDTO> jogadores) {
		this.jogadores = jogadores;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
}
