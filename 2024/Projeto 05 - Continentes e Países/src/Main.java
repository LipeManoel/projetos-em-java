public class Main {
    public static void main(String[] args) {
        // Criando os paises - números reais
        Pais brasil = new Pais("BRA", "Brasil", 216400000, 8510000);
        Pais argentina = new Pais("ARG","Argentina", 47327407, 2780000);
        Pais chile = new Pais("CHL","Chile", 19764771, 756.626);

        // Criando um continente e adicionando países
        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(chile);

        // Imprimindo os resultados
        System.out.println("> > > Continente: "+americaDoSul.getNome());
        System.out.println("\t| Dimensão total: " + americaDoSul.dimensaoTotal());
        System.out.println("\t| População total: " + americaDoSul.populacaoTotal());
        System.out.println("\t| Densidade populacional: " + americaDoSul.densidadePopulacional());
    }
}