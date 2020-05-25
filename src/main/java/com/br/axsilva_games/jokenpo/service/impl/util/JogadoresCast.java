package com.br.axsilva_games.jokenpo.service.impl.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.br.axsilva_games.jokenpo.excecoes.JokenpoDefautlException;
import com.br.axsilva_games.jokenpo.modelo.Jogador;
@Component
public class JogadoresCast {
	private static Scanner scannerFile;
	public List<Jogador> castToJogadores() throws FileNotFoundException, IOException, JokenpoDefautlException{
		Resource resource = new ClassPathResource("/static/jogadores.txt");
		scannerFile = new Scanner(new File(resource.getURL().getPath()), "UTF-8");
		List<Jogador> jogadores = new ArrayList<Jogador>();
		while (scannerFile.hasNextLine()) {
			String linha = scannerFile.nextLine();
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			jogadores.add(new Jogador(
					linhaScanner.next(), 
					new EscolhaCast().castToObject(linhaScanner.next())));
			linhaScanner.close();
		}
		scannerFile.close();
		return jogadores;
	}
}
