import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Criando o objeto Student
        Student student = new Student();

        //Titulo
        System.out.println("\n>> PROGRAMA - STUDENTS <<\n");

        //Entrada de dados
        System.out.print("|Nome do estudante: ");
        student.name = sc.nextLine();

        System.out.print("|Primeiro trimestre (30 pontos): ");
        student.grade1 = sc.nextDouble();

        System.out.print("|Segundo trimestre (35 pontos): ");
        student.grade2 = sc.nextDouble();

        System.out.print("|Terceiro trimestre (35 pontos): ");
        student.grade3 = sc.nextDouble();

        //Exibir resultado
        System.out.println(student);

        sc.close();
    }
}
