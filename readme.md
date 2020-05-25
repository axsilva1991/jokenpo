# Jokenpo

Olá seja bem vindo ao código fonte do JokenPo, da empresa Axsilva Games.


## Introdução:
- [Regras do Jogo](#regras-do-jogo)
- [Dicas](#dicas)
- [Funcionalidades](#funcionalidades)
- [Requisitos](#requisitos)
- [Download do Projeto](#download-do-projeto)
- [Como Instalar](#como-instalar)
- [Contratos API](#contratos-api)

## Regras do Jogo:
- O jogo pode ser executado para diversos players simultâneos.
- Para esta versão estamos trabalhando apenas com casos de vencedores isolados, por exemplo: 
* Caso mais de 1 jogador vença a mesma partida, estamos considerando um empate.
<br>- Possibilidades:<br><p>
<b>1.Pedra:</b><br>
1.1 Ganha de: (Lagarto e Tesoura)<br>
1.2	Perde para: (Papel e Spock)<br><p>
<b>2.Papel:</b><br>
2.1 Ganha de: (Pedra e Spock)<br>
2.2	Perde para: (Tesoura e Lagarto)<br><p>
<b>3.Tesoura:</b><br>
3.1 Ganha de: (Papel e Lagarto)<br>
3.2	Perde para: (Pedra e Spock)<br><p>
<b>4.Lagarto:</b><br>
4.1 Ganha de: (Spock e Papel)<br>
4.2	Perde para: (Pedra e Tesoura)<br><p>
<b>5.Spock:</b><br>
5.1 Ganha de: (Pedra e Tesoura)<br>
5.2	Perde para: (Papel e Lagarto)<br><p>

## Dicas:
- Apesar da abrangência para muitos jogadores, recomendamos que este jogo tenha de 2 a 4 participantes, pois de acordo com o a elevação de jogadores ocorre as chances de empates aumentam, podendo causar uma má experiência para os jogadores.

## Funcionalidades:
* <b>Jogadas e Jogadores<br></b>
1 Adicionar/Cadastrar <br>
2 Remover <br>
3 Consultar <br>
4 Excluir<br>

## Requisitos

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Gradle](https://docs.gradle.org/current/userguide/userguide.html)

## Download do Projeto
* Clone o projeto com o comando ``git clone https://github.com/axsilva1991/jokenpo.git``

## Como Instalar:
* Abra sua ide de preferencia e importe o projeto.<br>
<b>(No caso do Eclipse) File > Import > Gradle > Existing Gradle Project.</b>

## Contratos API:


##### TODO:
[] Finalizar Implementação do controller.<br>
[x] Finalizar Implementação de exeptions personalizadas. <br>
[] Iniciar e finalizar testes unitários.<br>
