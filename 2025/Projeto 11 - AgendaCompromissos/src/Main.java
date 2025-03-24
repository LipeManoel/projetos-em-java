package src;

import agenda.Agenda;
import agenda.Compromisso;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.println("\n============== MENU ================");
            System.out.println("\n\t1. Adicionar Compromisso");
            System.out.println("\t2. Verificar Compromissos");
            System.out.println("\t3. Créditos");
            System.out.println("\t4. Sair");
            System.out.println("\n====================================");
            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("| Data de início (formato dd/MM/yyyy): ");
                    LocalDate dataInicio = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.print("| Data de fim (formato dd/MM/yyyy): ");
                    LocalDate dataFim = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.print("| Descrição: ");
                    String descricao = scanner.nextLine();
                    agenda.adicionarCompromisso(new Compromisso(dataInicio, dataFim, descricao));
                    break;
                case 2:
                    System.out.print("Quantos dias à frente deseja verificar? ");
                    int numeroDias = scanner.nextInt();
                    agenda.verificarCompromissos(numeroDias);
                    break;
                case 3:
                    System.out.println("- Feito por Felipe Manoel.");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}