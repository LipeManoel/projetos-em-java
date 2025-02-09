import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Titulo
        System.out.println("\n>> PROGRAMA - CURRENCY CONVERTER <<\n");

        //Dados
        System.out.print("|Qual o valor do dólar? ");
        double dollarRate = sc.nextDouble();

        System.out.print("|Quantos dólares serão comprados? ");
        double amount = sc.nextDouble();

        //Cálculo do valor em reais
        double reais = CurrencyConverter.convert(dollarRate, amount);

        //Exibir resultado
        System.out.printf("\t\nValor a ser pago em reais: %.2f%n", reais);

        sc.close();
    }
}