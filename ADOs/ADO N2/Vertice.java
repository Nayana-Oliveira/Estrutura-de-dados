import java.util.ArrayList;

public class Vertice {
    private String dado;
    private ArrayList<Aresta> arestasSaida = new ArrayList<>();

    public Vertice(String dado) {
        this.dado = dado;
    }

    public String getDado() {
        return dado;
    }

    public void adicionarAresta(Aresta aresta) {
        arestasSaida.add(aresta);
    }

    public ArrayList<Aresta> getArestasSaida() {
        return arestasSaida;
    }
}