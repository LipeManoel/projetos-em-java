import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Titulo
        System.out.println("\n>> PROGRAMA - EMPLOYEE <<\n");

        //Criando objeto Employee
        Employee employee = new Employee();

        //Entrada de dados
        System.out.println("|Informe os dados do funcionário:\n");
        System.out.print("Nome: ");
        employee.name = sc.nextLine();

        System.out.print("Salário bruto: ");
        employee.GrossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        employee.Tax = sc.nextDouble();

        // Exibindo os dados iniciais
        System.out.println("Dados: "+ employee);

        // Solicitar aumento de salário
        System.out.print("Porcentagem de aumento de salário: ");
        double percentage = sc.nextDouble();

        // Aplicar o aumento
        employee.IncreaseSalary(percentage);

        // Exibir os dados atualizados
        System.out.println("Dados atualizados: " + employee);

        sc.close();
    }
}