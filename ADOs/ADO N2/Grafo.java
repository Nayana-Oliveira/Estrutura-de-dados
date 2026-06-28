import java.util.ArrayList;
import java.util.Collections;

public class Grafo {
    private ArrayList<Vertice> vertices = new ArrayList<>();

    public void adicionarVertice(String dado) {
        vertices.add(new Vertice(dado));
    }

    public Vertice getVertice(String dado) {
        for (int i = 0; i < vertices.size(); i++) {

            if (vertices.get(i).getDado().equalsIgnoreCase(dado)) {
                return vertices.get(i);
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
        }
    }

    public void menorCaminho(String inicio, String fim) {
        ArrayList<Vertice> naoVisitados = new ArrayList<>();
        ArrayList<Vertice> visitados = new ArrayList<>();

        ArrayList<Integer> distancias = new ArrayList<>();
        ArrayList<Vertice> anteriores = new ArrayList<>();

        for (int i = 0; i < vertices.size(); i++) {
            naoVisitados.add(vertices.get(i));
            distancias.add(Integer.MAX_VALUE);
            anteriores.add(null);

            if (vertices.get(i).getDado().equalsIgnoreCase(inicio)) {
                distancias.set(i, 0);
            }
        }

        while (!naoVisitados.isEmpty()) {
            Vertice atual = null;
            int menorDistancia = Integer.MAX_VALUE;

            for (int i = 0; i < naoVisitados.size(); i++) {
                Vertice v = naoVisitados.get(i);
                int indice = vertices.indexOf(v);
                if (distancias.get(indice) < menorDistancia) {
                    menorDistancia = distancias.get(indice);
                    atual = v;
                }
            }

            if (atual == null) {
                break;
            }

            naoVisitados.remove(atual);
            visitados.add(atual);

            for (Aresta aresta : atual.getArestasSaida()) {
                Vertice vizinho = aresta.getDestino();
                if (!visitados.contains(vizinho)) {
                    int indiceAtual = vertices.indexOf(atual);
                    int indiceVizinho = vertices.indexOf(vizinho);
                    int novaDistancia = distancias.get(indiceAtual) + aresta.getPeso();

                    if (novaDistancia < distancias.get(indiceVizinho)) {
                        distancias.set(indiceVizinho, novaDistancia);
                        anteriores.set(indiceVizinho, atual);
                    }
                }
            }
        }

        Vertice destino = getVertice(fim);
        ArrayList<String> caminho = new ArrayList<>();

        while (destino != null) {
            caminho.add(destino.getDado());
            int indice = vertices.indexOf(destino);
            destino = anteriores.get(indice);
        }

        Collections.reverse(caminho);
        System.out.println("\n===== MENOR CAMINHO =====");

        for (int i = 0; i < caminho.size(); i++) {
            if (i < caminho.size() - 1) {
                System.out.print(caminho.get(i) + " -> ");
            } else {
                System.out.print(caminho.get(i));
            }
        }

        int indiceFinal = -1;

        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getDado().equalsIgnoreCase(fim)) {
                indiceFinal = i;
            }
        }

        System.out.println("\n\nDistancia Total: " + distancias.get(indiceFinal) + " metros");
    }
}