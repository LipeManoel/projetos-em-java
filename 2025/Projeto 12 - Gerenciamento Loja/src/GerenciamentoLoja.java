import java.util.Scanner;

public class GerenciamentoLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=======================================");
            System.out.println("         Gerenciamento parcial         ");
            System.out.println("              de uma loja              ");
            System.out.println("=======================================");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar produto");
            System.out.println("3 - Iniciar venda");
            System.out.println("4 - Adicionar produto ao carrinho");
            System.out.println("5 - Exibir conteúdo do carrinho");
            System.out.println("6 - Fechar venda");
            System.out.println("0 - Sair");
            System.out.println("=======================================");
            System.out.print("> Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    Cliente cliente = new Cliente(nome, cpf);
                    loja.cadastrarCliente(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Código do produto: ");
                    int codigo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Valor do produto: ");
                    double valor = Double.parseDouble(scanner.nextLine());
                    Produto produto = new Produto(codigo, valor);
                    loja.cadastrarProduto(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.print("Nome do cliente para iniciar a venda: ");
                    String nomeCliente = scanner.nextLine();
                    if (loja.iniciarVenda(nomeCliente)) {
                        System.out.println("Venda iniciada para o cliente " + nomeCliente);
                    }
                    break;
                case 4:
                    System.out.print("Código do produto: ");
                    int codProd = Integer.parseInt(scanner.nextLine());
                    System.out.print("Quantidade: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    System.out.print("Desconto (%) do produto: ");
                    double desconto = Double.parseDouble(scanner.nextLine());
                    if (loja.adicionarProduto(codProd, quantidade, desconto)) {
                        System.out.println("Produto adicionado ao carrinho.");
                    }
                    break;
                case 5:
                    if (loja.getVendaEmAndamento() != null) {
                        System.out.println("Conteúdo do carrinho:");
                        System.out.println(loja.getVendaEmAndamento());
                    } else {
                        System.out.println("Nenhuma venda em andamento.");
                    }
                    break;
                case 6:
                    double total = loja.fecharVenda();
                    System.out.println("Venda finalizada. Valor total: " + total);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }
}
