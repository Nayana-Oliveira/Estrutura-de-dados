import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Grafo {
    private ArrayList<Vertice> vertices = new ArrayList<>();
    private ArrayList<Aresta> arestas = new ArrayList<>();

    public void adicionarVertice(String dado) {
        vertices.add(new Vertice(dado));
    }

    public Vertice getVertice(String dado) {
        for (Vertice v : vertices) {
            if (v.getDado().equals(dado)) {
                return v;
            }
        }
        return null;
    }

    public void adicionarAresta(String origem, String destino, int peso) {
        Vertice vOrigem = getVertice(origem);
        Vertice vDestino = getVertice(destino);

        if (vOrigem != null && vDestino != null) {
            Aresta aresta = new Aresta(vOrigem, vDestino, peso);
            vOrigem.adicionarAresta(aresta);
            arestas.add(aresta);
        }
    }

    // Busca em Largura (BFS)
    public void buscaEmLargura(String inicio) {
        Vertice inicial = getVertice(inicio);

        if (inicial == null) {
            System.out.println("Vértice não encontrado!");
            return;
        }

        ArrayList<Vertice> visitados = new ArrayList<>();
        Queue<Vertice> fila = new LinkedList<>();

        fila.add(inicial);
        visitados.add(inicial);

        System.out.println("Busca em Largura:");

        while (!fila.isEmpty()) {
            Vertice atual = fila.poll();
            System.out.println(atual.getDado());

            for (Aresta aresta : atual.getArestasSaida()) {
                Vertice vizinho = aresta.getDestino();

                if (!visitados.contains(vizinho)) {
                    visitados.add(vizinho);
                    fila.add(vizinho);
                }
            }
        }
    }
}