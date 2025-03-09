package com.jogodetabuleiro.projeto.models;

public class Tabuleiro {
    private Integer numeroCasas;

    public Tabuleiro(Integer numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

    public Integer getNumeroCasas() {
        return numeroCasas;
    }

    public void mostrarPosicoes(Jogador[] jogadores) {
        for (Jogador jogador : jogadores) {
            System.out.println("Jogador " + jogador.getMeuNumero() + " está na casa " + jogador.getCasaAtual());
        }
    }
}