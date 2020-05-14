package com.br.axsilva_games.jokenpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.axsilva_games.jokenpo.modelo.dto.JogadorResponse;
import com.br.axsilva_games.jokenpo.service.JokenpoService;

@RestController
@RequestMapping("/v1/jokenpo")
public class JokenpoController {
	
	@Autowired
	private JokenpoService jokenposervice;
	
	@GetMapping
	public List<JogadorResponse> consultarJogadores (){
		return jokenposervice.consultarJogadores();	
	}
}
