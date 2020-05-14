package com.br.axsilva_games.jokenpo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.axsilva_games.jokenpo.modelo.dto.JogadorRequest;
import com.br.axsilva_games.jokenpo.modelo.dto.JogadorResponse;
import com.br.axsilva_games.jokenpo.service.JokenpoService;
import com.br.axsilva_games.jokenpo.util.Opcao;
@Service
public class JokenpoServiceImpl implements JokenpoService {

	public JogadorResponse adicionarJogador(JogadorRequest jogador) {
		if (jogador.equals(null) 
			|| jogador.getJogada().isEmpty()
			|| jogador.getNome().isEmpty())
			return new JogadorResponse("O Jogador/Opção não podem ser nulo");	
		if(validaJogada(jogador.getJogada())) 
			return new JogadorResponse("O Jogador/Opção não podem ser válida");		
		return new JogadorResponse(jogador,"Jogador criado com sucesso");
	}

	@Override
	public JogadorResponse removerJogador(JogadorRequest jogador) {
		return new JogadorResponse("Jogador Removido com sucesso");
	}

	@Override
	public List<JogadorResponse> consultarJogadores() {
		return null;
	}

	private boolean validaJogada(String jogada){
		if(Opcao.valueOf(jogada) != null)
			return false;
		return true;	
	}
}
