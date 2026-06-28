import java.util.ArrayList;

public class Vertice {
    private String nome;
    private ArrayList<Aresta> evolucoes = new ArrayList<>();

    public Vertice(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEvolucao(Aresta aresta) {
        evolucoes.add(aresta);
    }

    public ArrayList<Aresta> getEvolucoes() {
        return evolucoes;
    }
}
