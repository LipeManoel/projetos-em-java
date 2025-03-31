import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens;
    private Cliente cliente;

    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }
    
    public boolean adicionarProduto(Produto produto, int quantidade, double desconto) {
        ItemCarrinho item = new ItemCarrinho(produto, quantidade, desconto);
        itens.add(item);
        return true;
    }
    
    public double obterValorTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.obterCusto();
        }
        return total;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        for (ItemCarrinho item : itens) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Valor Total: ").append(obterValorTotal());
        return sb.toString();
    }
}
