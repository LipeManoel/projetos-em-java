public class ItemCarrinho {
    private Produto produto;
    private int quantidade;
    private double desconto;

    public ItemCarrinho(Produto produto, int quantidade, double desconto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public double getDesconto() {
        return desconto;
    }
    
    public double obterCusto() {
        return produto.obterValorComDesconto(desconto) * quantidade;
    }
    
    @Override
    public String toString() {
        return produto.toString() + " | Quantidade: " + quantidade +
               " | Desconto: " + desconto + "% | Custo: " + obterCusto();
    }
}
