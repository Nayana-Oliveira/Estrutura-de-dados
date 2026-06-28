package aula4;

public class Pilha<T> extends EstruturaEstatica<T>{
    //metodo construtor sem parametros
    public Pilha() {
        super();
    }

    //construtor com parametros
    public Pilha(int capacidade) {
        super(capacidade);
    }

    //metodo para ver a informação no topo da pilha
    public T topo() {
        if (this.estaVazia()) {
            return null;
        } else {
            return this.elementos[tamanho-1];
        }
    }

    //metodo para remover um elemento da pilha
    public T desempilha() {
        if (this.estaVazia()) {
            return null;
        }
        T elemento = this.elementos[tamanho - 1];
        tamanho--;
        return elemento;
    }
}