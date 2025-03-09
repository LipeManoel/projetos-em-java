package com.jogodetabuleiro.projeto.models;

import java.util.Random;

public class Dado {
    private Integer numeroAtual;

    public Dado() {
        numeroAtual = 1;
    }

    public Integer rolar() {
        Random random = new Random();
        numeroAtual = random.nextInt(6) + 1;
    }

    public Integer getNumeroAtual() {
        return numeroAtual;
    }
}

