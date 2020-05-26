package com.br.axsilva_games.jokenpo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.axsilva_games.jokenpo.controller.dto.request.JogadorRequestDTO;
import com.br.axsilva_games.jokenpo.controller.dto.response.JogadorResponseDTO;
import com.br.axsilva_games.jokenpo.service.JokenpoService;

@RestController
@RequestMapping("/api/v1/jokenpo")
public class JokenpoController {
	
	@Autowired
	private JokenpoService jokenposervice;
	
	@GetMapping("/jogadores")
	public ResponseEntity<JogadorResponseDTO> consultarJogadores (){
		return jokenposervice.consultarJogadores();	
	}
	@PostMapping("/jogadores")
	public ResponseEntity<JogadorResponseDTO> cadastrarJogador (@RequestBody JogadorRequestDTO jogador){
		System.out.println(jogador);
		return jokenposervice.adicionarJogador(jogador);
	}
	@DeleteMapping("/jogadores")
	public ResponseEntity<JogadorResponseDTO> removerJogador(JogadorRequestDTO jogador){
		return jokenposervice.removerJogador(jogador);	
	}
	@GetMapping("/jogar")
	public ResponseEntity<JogadorResponseDTO> jogar (){
		return jokenposervice.jogar();	
	}
}
