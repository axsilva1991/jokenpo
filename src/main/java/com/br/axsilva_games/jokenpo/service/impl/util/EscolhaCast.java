package com.br.axsilva_games.jokenpo.service.impl.util;

import com.br.axsilva_games.jokenpo.excecoes.JokenpoDefautlException;
import com.br.axsilva_games.jokenpo.modelo.Escolha;
import com.br.axsilva_games.jokenpo.modelo.EscolhaLagarto;
import com.br.axsilva_games.jokenpo.modelo.EscolhaPapel;
import com.br.axsilva_games.jokenpo.modelo.EscolhaPedra;
import com.br.axsilva_games.jokenpo.modelo.EscolhaSpock;
import com.br.axsilva_games.jokenpo.modelo.EscolhaTesoura;

public class EscolhaCast {

    public Escolha castToObject(String jogada) throws JokenpoDefautlException {
        switch (jogada) {
            case "Pedra":
                return new EscolhaPedra();
            case "Papel":
                return new EscolhaPapel();
            case "Tesoura":
                return new EscolhaTesoura();
            case "Lagarto":
                return new EscolhaLagarto();
            case "Spock":
                return new EscolhaSpock();
            default:
                throw new JokenpoDefautlException("Formato inválido ou valor inválido"
                        + ", por favor verifique o preenchimento de "
                        + "acordo com o padrão (Primeira Letra maiúscula exemplo: Pedra).");
        }

    }

    public String castToString(Escolha escolha) throws JokenpoDefautlException {
        switch (escolha.getOpcao()) {
            case PEDRA:
                return "Pedra";
            case PAPEL:
                return "Papel";
            case TESOURA:
                return "Tesoura";
            case LAGARTO:
                return "Lagarto";
            case SPOCK:
                return "Spock";
            default:
                throw new JokenpoDefautlException("Opção não parametrizada.");
        }

    }
}
