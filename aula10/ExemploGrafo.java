public class ExemploGrafo {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();

        // Criando vértices (pessoas)
        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Claudio");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Cleusa");
        grafo.adicionarVertice("Kleber");

        // Criando conexões
        grafo.adicionarAresta("Paulo", "Claudio", 1);
        grafo.adicionarAresta("Paulo", "Lorenzo", 2);
        grafo.adicionarAresta("Claudio", "Cleusa", 3);
        grafo.adicionarAresta("Lorenzo", "Kleber", 2);

        // Teste da busca
        grafo.buscaEmLargura("Paulo");
    }
}