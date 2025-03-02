import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Titulo
        System.out.println("\n>> PROGRAMA - RECTANGLE <<\n");

        //Coleta de dados
        System.out.println("|Digite a largura do retângulo:");
        double width = sc.nextDouble();
        System.out.println("|Digite a altura do retângulo:");
        double height = sc.nextDouble();

        //Contructo
        Rectangle rect = new Rectangle(width, height);
        
        //Resultados
        System.out.println("|Resultados: ");
        System.out.printf("\tAREA = %.2f%n", rect.getArea());
        System.out.printf("\tPERIMETRO = %.2f%n", rect.getPerimeter());
        System.out.printf("\tDIAGONAL = %.2f%n", rect.getDiagonal());

        sc.close();
    }
}