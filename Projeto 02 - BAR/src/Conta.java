public class Conta {
    // Preços
    private static final double PRECO_CERVEJA = 5.00;
    private static final double PRECO_REFRIGERANTE = 3.00;
    private static final double PRECO_ESPETINHO = 7.00;
    private static final double COUVERT = 4.00;

    private char sexo;
    private int quantidadeCervejas;
    private int quantidadeRefrigerantes;
    private int quantidadeEspetinhos;

    // Construtor
    public Conta(char sexo, int quantidadeCervejas, int quantidadeRefrigerantes, int quantidadeEspetinhos) {
        this.sexo = sexo;
        this.quantidadeCervejas = quantidadeCervejas;
        this.quantidadeRefrigerantes = quantidadeRefrigerantes;
        this.quantidadeEspetinhos = quantidadeEspetinhos;
    }

    // Método para calcular o ingresso
    public double calcularIngresso() {
        return (sexo == 'F' || sexo == 'f') ? 8.00 : 10.00;
    }

    // Método para calcular o consumo
    public double calcularConsumo() {
        return (quantidadeCervejas * PRECO_CERVEJA) +
               (quantidadeRefrigerantes * PRECO_REFRIGERANTE) +
               (quantidadeEspetinhos * PRECO_ESPETINHO);
    }

    // Método para calcular o valor total a pagar
    public double calcularValorTotal() {
        double consumo = calcularConsumo();
        double ingresso = calcularIngresso();

        // Se o consumo for maior que R$ 30,00, isento de couvert
        if (consumo > 30.00) {
            return ingresso + consumo; // Isento de couvert
        } else {
            return ingresso + consumo + COUVERT; // Cobrado
        }
    }

    // Método para obter relatório
    public String obterRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        double consumo = calcularConsumo();
        double ingresso = calcularIngresso();
        double valorTotal = calcularValorTotal();

        relatorio.append("RELATÓRIO:\n");
        relatorio.append(String.format("Consumo = R$ %.2f\n", consumo));
        if (consumo <= 30.00) {
            relatorio.append(String.format("Couvert = R$ %.2f\n", COUVERT));
        } else {
            relatorio.append("Isento de Couvert\n");
        }
        relatorio.append(String.format("Ingresso = R$ %.2f\n", ingresso));
        relatorio.append(String.format("Valor a pagar = R$ %.2f\n", valorTotal));

        return relatorio.toString();
    }
}
