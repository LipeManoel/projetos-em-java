package com.jogodetabuleiro.projeto;

import java.util.Scanner;
import java.io.IOException;
import com.jogodetabuleiro.projeto.models.Jogo;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 0;
        Jogo jogo = null;
        
        do {
            System.out.println("""
                -MENU-
                1 - Iniciar nova partida
                2 - Executar jogada
                3 - Informar posições
                0 - Sair
                        
                Escolha uma opção: """);
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    if (jogo == null) {
                        System.out.println("\nIniciando nova partida...");
                        jogo = new Jogo(2, 20);
                    } else {
                        System.out.println("\nA partida já foi iniciada!");
                    }
                    break;
                case 2:
                    if (jogo != null) {
                        jogo.proximaJogada();
                    } else {
                        System.out.println("\nVocê precisa iniciar a partida primeiro!");
                    }
                    break;
                case 3:
                    if (jogo != null) {
                        jogo.mostrarPosicoes();
                    } else {
                        System.out.println("\nVocê precisa iniciar a partida primeiro!");
                    }
                    break;
                case 0:
                    System.out.print("\nVocê escolheu sair!");
                    System.exit(0);
                    break;
                default:
                    System.out.print("\nEscolha uma opção válida!");
            }
            System.out.print("\nPressione qualquer tecla para continuar...");
            System.in.read();
            
        } while(opcao != 0);
        
        scanner.close();
    }
}