package com.br.axsilva_games.jokenpo.controller.dto;

import java.util.ArrayList;
import java.util.List;

public class JogadorResponseDTO {
	
	List<JogadorItemResponseDTO> jogadoresItemResponseDTO = new ArrayList<JogadorItemResponseDTO>();

	public JogadorResponseDTO(List<JogadorItemResponseDTO> jogadoresItemResponseDTO) {
		this.jogadoresItemResponseDTO = jogadoresItemResponseDTO;
	}

	public List<JogadorItemResponseDTO> getJogadoresItemResponseDTO() {
		return jogadoresItemResponseDTO;
	}

	public void setJogadoresItemResponseDTO(List<JogadorItemResponseDTO> jogadoresItemResponseDTO) {
		this.jogadoresItemResponseDTO = jogadoresItemResponseDTO;
	}
	
	
}
