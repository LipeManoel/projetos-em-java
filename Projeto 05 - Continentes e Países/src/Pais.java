import java.util.ArrayList;
import java.util.List;

class Pais {
    private String ISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private List<Pais> fronteiras;

    // Construtor
    public Pais(String ISO, String nome, long populacao, double dimensao) {
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    // Getters
    public String getISO() {
        return ISO;
    }

    public String getNome() {
        return nome;
    }
    
    public long getPopulacao() {
        return populacao;
    }

    public long getDimensao() {
        return populacao;
    }

    // Setters
    public void setISO(String ISO) {
        this.ISO = ISO;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public void getDimensao(long dimensao) {
        this.dimensao = dimensao;
    }

    // Método de igualdade semântica - verifica se esta ISO, é igual(equals do java) a
    // ISO do país recebido no parâmetro
    public boolean igualdade(Pais outro) { 
        return this.ISO.equals(outro.ISO);
    }

    // Verifica se outro país é limítrofe - verifica se esta fronteira, tem o
    // valor(contains do java) do nome do país recebido como parâmetro
    public boolean eLimitrofe(Pais outro) {
        return fronteiras.contains(outro);
    }

    // Densidade populacional
    public double densidadePopulacional() {
        return populacao / dimensao;
    }

    // Listar países
    public List<Pais> vizinhosComuns(Pais outro) {
        List<Pais> comuns = new ArrayList<>();
        for (Pais vizinho : fronteiras) {
            if (outro.fronteiras.contains(vizinho)) {
                comuns.add(vizinho);
            }
        }
        return comuns;
    }

    // Adicionar fronteira - se o array fronteiras tiver menos de 40 países inclusos,
    // nao conter o mesmo pais recebido ou ser o mesmo
    public void adicionarFronteira(Pais outro) {
        if (fronteiras.size() < 40 && !fronteiras.contains(outro) && !outro.equals(this)) {
            fronteiras.add(outro);// será adicionado
        }
    }
}
