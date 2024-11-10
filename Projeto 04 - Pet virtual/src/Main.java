import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pet pet = new Pet();

        // Coleta de informações do pet
        System.out.print("\n[CRIE UM PET]\n");
        System.out.print("\t|Digite o nome do seu pet: ");
        pet.nome = scanner.nextLine();

        System.out.print("\t|Digite a classe do seu pet: ");
        pet.classe = scanner.nextLine();

        System.out.print("\t|Digite a família do seu pet: ");
        pet.familia = scanner.nextLine();

        // Imprimir informações do pet
        System.out.print("\n[INFORMAÇÕES DO PET]\n");
        pet.Nascer();
        System.out.println("\t|Seu pet se chama "+pet.nome+", da classe "+pet.classe+" e família "+pet.familia+".");
        System.out.println("\t|Possui força "+pet.forca+", caloria de "+pet.caloria+" e "+pet.idade+" idade.");

        // Menu de opções
        do{
            System.out.println("\nO que "+pet.nome+" vai fazer agora?");

            System.out.print("\n[MENU DE OPÇÕES]\n");
            System.out.println("\t|1 - Comer");
            System.out.println("\t|2 - Correr");
            System.out.println("\t|3 - Dormir");
            System.out.println("\t|4 - Morrer");
            System.out.print("\nOpção escolhida: ");

            int op = scanner.nextInt();
            scanner.nextLine();

            switch(op){
                case 1:
                    System.out.println(pet.Comer());
                break;
                case 2:
                    System.out.println(pet.Correr());
                break;
                case 3:
                    System.out.println(pet.Dormir());
                break;
                case 4:
                    System.out.println(pet.Morrer());
                break;
                default:
                    System.out.println("\nOpção inválida!");
                break;
            }

        }while(pet.estado == true);

        System.out.print("\nGAME OVER!\n");

        scanner.close();
    }
}