import java.util.ArrayList;
import java.util.List;

class Continente {
    private String nome;
    private List<Pais> paises;

    // Construtor
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Getter
    public String getNome() {
        return this.nome;
    }
    
    public void adicionarPais(Pais pais) {// Adicionar país
        if (!paises.contains(pais)) {
            paises.add(pais);
        }
    }

    public double dimensaoTotal() {// Dimensão total
        double total = 0;
        for (Pais pais : paises) {
            total += pais.getDimensao();
        }
        return total;
    }
    
    public long populacaoTotal() {// População total
        long total = 0;
        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }
        return total;
    }

    public double densidadePopulacional() {// Densidade populacional do continente
        double totalDimensao = dimensaoTotal();
        long totalPopulacao = populacaoTotal();
        return totalPopulacao / totalDimensao;
    }

    public Pais paisMaiorPopulacao() {// País com maior população
        Pais maiorPopulacao = paises.get(0);
        for (Pais pais : paises) {// ":" quer dizer iterando
            if (pais.getPopulacao() > maiorPopulacao.getPopulacao()) {
                maiorPopulacao = pais;
            }
        }
        return maiorPopulacao;
    }

    public Pais paisMenorPopulacao() {// País com menor população
        Pais menorPopulacao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() < menorPopulacao.getPopulacao()) {
                menorPopulacao = pais;
            }
        }
        return menorPopulacao;
    }

    public Pais paisMaiorDimensao() {// País de maior dimensão territorial
        Pais maiorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() > maiorDimensao.getDimensao()) {
                maiorDimensao = pais;
            }
        }
        return maiorDimensao;
    }
    
    public Pais paisMenorDimensao() {// País de menor dimensão territorial
        Pais menorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() < menorDimensao.getDimensao()) {
                menorDimensao = pais;
            }
        }
        return menorDimensao;
    }

    public double razaoTerritorial() {// Razão territorial do maior país em relação ao menor
        Pais maior = paisMaiorDimensao();
        Pais menor = paisMenorDimensao();
        if (maior != null && menor != null && menor.getDimensao() > 0) {
            return maior.getDimensao() / menor.getDimensao();
        }
        return 0;
    }
}