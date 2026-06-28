package aula7;

public class ListaEncadeada<Tipo> {
    private No inicio;
    private No fim;
    private int tamanho;

    //metodo construtor
    public ListaEncadeada() {
        this.tamanho = 0;
    }

    //metodo de acesso
    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //metodo de exibição
    @Override
    public String toString() {
        return "ListaEncadeada {" + "inicio=" + inicio + "}";
    }

    //metodo para adicionar elemento
    public void adiciona(Tipo elemento) {
        No<Tipo> celula = new No<Tipo>(elemento);
        if (this.inicio == null && this.fim == null) {
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }

    //metodo para buscar o nó
    public No get(int posicao) {
        No atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() == null) {
                return null;
            }
            atual = atual.getProximo();
        }
        return atual;
    }

    //metodo para remover o nó
    public void remover(Tipo elemento) {
        No anterior = null;
        No atual = this.inicio;

        for (int i = 0; i < this.getTamanho() && atual != null; i++) {
            if (atual.getElemento().equals(elemento)) {
                // CASO 1: único elemento
                if (this.tamanho == 1) {
                    this.inicio = null;
                    this.fim = null;
                    // CASO 2: início
                } else if (atual == inicio) {
                    this.inicio = atual.getProximo();
                    // CASO 3: fim
                } else if (atual == fim) {
                    this.fim = anterior;
                    anterior.setProximo(null);
                    // CASO 4: meio
                } else {
                    anterior.setProximo(atual.getProximo());
                }
                this.tamanho--;
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
}