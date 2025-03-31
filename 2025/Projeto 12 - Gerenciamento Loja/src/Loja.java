import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Cliente> clientes;
    private List<Produto> estoque;
    private List<CarrinhoDeCompras> vendasFinalizadas;
    private CarrinhoDeCompras vendaEmAndamento;

    public Loja() {
        clientes = new ArrayList<>();
        estoque = new ArrayList<>();
        vendasFinalizadas = new ArrayList<>();
        vendaEmAndamento = null;
    }
    
    public void cadastrarCliente(Cliente novo) {
        clientes.add(novo);
    }
    
    public Cliente pesquisarCliente(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }
    
    // Cadastra um novo produto
    public void cadastrarProduto(Produto novo) {
        estoque.add(novo);
    }
    
    public Produto pesquisarProduto(int codigo) {
        for (Produto p : estoque) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }
    
    public boolean iniciarVenda(String nomeCliente) {
        Cliente cliente = pesquisarCliente(nomeCliente);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return false;
        }
        vendaEmAndamento = new CarrinhoDeCompras(cliente);
        return true;
    }
    
    public boolean adicionarProduto(int codigo, int quantidade, double desconto) {
        if (vendaEmAndamento == null) {
            System.out.println("Nenhuma venda em andamento.");
            return false;
        }
        Produto produto = pesquisarProduto(codigo);
        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return false;
        }
        vendaEmAndamento.adicionarProduto(produto, quantidade, desconto);
        return true;
    }
    
    public double fecharVenda() {
        if (vendaEmAndamento == null) {
            System.out.println("Nenhuma venda em andamento para fechar.");
            return 0;
        }
        double total = vendaEmAndamento.obterValorTotal();
        vendasFinalizadas.add(vendaEmAndamento);
        vendaEmAndamento = null;
        return total;
    }
    
    public CarrinhoDeCompras getVendaEmAndamento() {
        return vendaEmAndamento;
    }
}