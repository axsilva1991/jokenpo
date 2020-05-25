package com.br.axsilva_games.jokenpo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.br.axsilva_games.jokenpo.excecoes.JokenpoDefautlException;
import com.br.axsilva_games.jokenpo.modelo.Jogador;
import com.br.axsilva_games.jokenpo.service.impl.util.EscolhaCast;

public class JogadoresFileReader {
	private static Scanner scannerFile;

	public static void main(String[] args) throws IOException, JokenpoDefautlException {
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
	}
}
