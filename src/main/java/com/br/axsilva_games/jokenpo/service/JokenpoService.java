package com.br.axsilva_games.jokenpo.service;


import org.springframework.http.ResponseEntity;

import com.br.axsilva_games.jokenpo.controller.dto.JogadorRequestDTO;
import com.br.axsilva_games.jokenpo.controller.dto.JogadorResponseDTO;

public interface JokenpoService {

	public ResponseEntity<JogadorResponseDTO> adicionarJogador(JogadorRequestDTO jogador);

	public ResponseEntity<JogadorResponseDTO> removerJogador(JogadorRequestDTO jogador);

	public ResponseEntity<JogadorResponseDTO> consultarJogadores();

	public ResponseEntity<JogadorResponseDTO> jogar();

}
