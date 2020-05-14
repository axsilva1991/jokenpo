package com.br.axsilva_games.jokenpo.service;

import java.util.List;

import com.br.axsilva_games.jokenpo.modelo.dto.JogadorRequest;
import com.br.axsilva_games.jokenpo.modelo.dto.JogadorResponse;

public interface JokenpoService {
	
	public JogadorResponse adicionarJogador(JogadorRequest jogador);
	public List<JogadorResponse> consultarJogadores();
	public JogadorResponse removerJogador(JogadorRequest jogador);

}
