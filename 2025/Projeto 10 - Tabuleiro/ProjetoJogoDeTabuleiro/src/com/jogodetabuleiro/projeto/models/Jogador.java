package com.jogodetabuleiro.projeto.models;

public class Jogador {
    private Integer casaAtual;
    private Integer meuNumero;

    public Jogador(Integer numero) {
        this.meuNumero = numero;
        this.casaAtual = 1;
    }

    public void jogar(Dado dado) {
        Integer rolagem = dado.rolar();
        casaAtual += rolagem;
        System.out.println("Jogador " + meuNumero + " rolou " + rolagem + " e foi para a casa " + casaAtual);
    }

    public Integer getCasaAtual() {
        return casaAtual;
    }

    public Integer getMeuNumero() {
        return meuNumero;
    }
}
