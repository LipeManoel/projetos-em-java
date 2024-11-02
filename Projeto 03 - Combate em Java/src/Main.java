import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //INSTÂNCIAS
        Scanner scanner = new Scanner(System.in);

        Champion champion1 = new Champion();
        Champion champion2 = new Champion();

        //PRIMEIRO CAMPEÃO
        System.out.print("\nInforme os dados do primeiro campeão:\n");
        System.out.print(" |Digite o nome: ");
        champion1.name = scanner.nextLine();

        System.out.print(" |Digite a vida inicial: ");
        champion1.life = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" |Digite ataque: ");
        champion1.attack = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" |Digite armadura: ");
        champion1.armor = scanner.nextInt();
        scanner.nextLine();

        //SEGUNDO CAMPEÃO
        System.out.print("\nInforme os dados do segundo campeão:\n");
        System.out.print(" |Digite o nome: ");
        champion2.name = scanner.nextLine();

        System.out.print(" |Digite a vida inicial: ");
        champion2.life = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" |Digite ataque: ");
        champion2.attack = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" |Digite armadura: ");
        champion2.armor = scanner.nextInt();
        scanner.nextLine();

        //RODADAS
        System.out.print("\nInforme a quantidade de turnos:");
        int rounds = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        int i=1;
        do{
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);

            System.out.print("\n |Rodada "+i+":\n\n");
            System.out.print(champion1.status());
            System.out.print("\n");
            System.out.print(champion2.status());
            System.out.print("\n");
            i++;
        }while(champion1.life > 0 && champion2.life > 0 && i<rounds);

        System.out.print("\n### FIM DO COMBATE ###\n");
    }
}