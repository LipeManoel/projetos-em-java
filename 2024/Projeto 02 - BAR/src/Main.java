import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os dados do cliente
        System.out.print("Sexo (F ou M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int quantidadeCervejas = scanner.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = scanner.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int quantidadeEspetinhos = scanner.nextInt();

        // Criando uma instância da classe Conta
        Conta conta = new Conta(sexo, quantidadeCervejas, quantidadeRefrigerantes, quantidadeEspetinhos);

        // Exibindo o relatório
        System.out.println(conta.obterRelatorio());

        // Fechando o scanner
        scanner.close();
    }
}
