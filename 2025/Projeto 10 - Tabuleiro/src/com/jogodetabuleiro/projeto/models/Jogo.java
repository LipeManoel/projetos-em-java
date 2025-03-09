package com.jogodetabuleiro.projeto.models;

public class Jogo {
    private Tabuleiro meuTabuleiro;
    private Jogador[] meusJogadores;
    private Dado meuDado;

    public Jogo(Integer numeroJogadores, Integer numeroCasas) {
        meuTabuleiro = new Tabuleiro(numeroCasas);
        meusJogadores = new Jogador[numeroJogadores];
        meuDado = new Dado();

        for (int i = 0; i < numeroJogadores; i++) {
            meusJogadores[i] = new Jogador(i + 1);
        }
    }

    public void proximaJogada() {
        for (Jogador jogador : meusJogadores) {
            jogador.jogar(meuDado);
            if (jogador.getCasaAtual() >= meuTabuleiro.getNumeroCasas()) {
                System.out.println("Jogador " + jogador.getMeuNumero() + " venceu!");
                return;
            }
        }
    }

    public void mostrarPosicoes() {
        meuTabuleiro.mostrarPosicoes(meusJogadores);
    }
}
