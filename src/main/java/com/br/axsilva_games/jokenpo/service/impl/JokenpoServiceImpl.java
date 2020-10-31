package com.br.axsilva_games.jokenpo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.br.axsilva_games.jokenpo.controller.dto.request.JogadorRequestDTO;
import com.br.axsilva_games.jokenpo.controller.dto.response.JogadorItemResponseDTO;
import com.br.axsilva_games.jokenpo.controller.dto.response.JogadorResponseDTO;
import com.br.axsilva_games.jokenpo.modelo.Jogador;
import com.br.axsilva_games.jokenpo.modelo.util.Opcao;
import com.br.axsilva_games.jokenpo.service.JokenpoService;
import com.br.axsilva_games.jokenpo.service.impl.util.JogadoresCast;

@Service
public class JokenpoServiceImpl implements JokenpoService {
	@Autowired
	JogadoresCast jogadoresFile;

	@Override
	public ResponseEntity<JogadorResponseDTO> adicionarJogador(JogadorRequestDTO jogador) {
		List<Jogador> jogadores = new ArrayList<Jogador>();
		if (jogador.equals(null) || jogador.getJogada().equals(null) || jogador.getJogada().isEmpty()
				|| jogador.getNome().isEmpty())
			return null;
		return null;
	}

	@Override
	public ResponseEntity<JogadorResponseDTO> removerJogador(JogadorRequestDTO jogador) {
		return null;
	}

	@Override
	public ResponseEntity<JogadorResponseDTO> consultarJogadores() {
		JogadorResponseDTO jogadorResponseDTO = converterJogadorToDTO();
		if (jogadorResponseDTO != null)
			return new ResponseEntity<JogadorResponseDTO>(jogadorResponseDTO, HttpStatus.OK);
		return new ResponseEntity<JogadorResponseDTO>(
				new JogadorResponseDTO("N�o Foram encontrados dados para esta consulta."),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<JogadorResponseDTO> jogar() {
		return null;
	}

	private JogadorResponseDTO converterJogadorToDTO() {
		List<JogadorItemResponseDTO> jogadoresItemResponseDTO = new ArrayList<JogadorItemResponseDTO>();
		List<Jogador> listaJogadores;
		try {
			listaJogadores = jogadoresFile.castToJogadores();
			for (int i = 0; listaJogadores.size() > i; i++) {
				jogadoresItemResponseDTO.add(new JogadorItemResponseDTO(listaJogadores.get(i).getNome(),
						listaJogadores.get(i).getEscolha().getOpcao().getOpcao()));
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			return null;

		}
		return new JogadorResponseDTO(jogadoresItemResponseDTO);

	}
}
