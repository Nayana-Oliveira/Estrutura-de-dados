public class Aresta {
    private Vertice origem;
    private Vertice destino;
    private String condicao; //aqui seria o nível do pokemon

    public Aresta(Vertice origem, Vertice destino, String condicao) {
        this.origem = origem;
        this.destino = destino;
        this.condicao = condicao;
    }

    public Vertice getDestino() {
        return destino;
    }

    public String getCondicao() {
        return condicao;
    }
}
