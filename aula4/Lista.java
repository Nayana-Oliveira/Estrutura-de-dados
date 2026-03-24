package aula4;

public class Lista<T> extends EstruturaEstatica<T> {
    //metodo construtor com parametros
    public Lista(int capacidade) {
        super(capacidade);
    }

    //metodo construtor sem parametros
    public Lista() {
        super();
    }

    //metodo para adicionar elementos na lista
    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    //metodo para adicionar elementos na lista em uma posicao especifica
    public boolean adiciona(int posicao, T elemento) throws IllegalAccessException {
        return super.adiciona(posicao, elemento);
    }
}