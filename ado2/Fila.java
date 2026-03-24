package ado2;

public class Fila<T> {
    private T[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    }

    public Fila() {
        this(10);
    }

    public void enfileirar(T elemento) {
        if (tamanho == elementos.length) {
            aumentarCapacidade();
        }
        elementos[fim] = elemento;
        fim = (fim + 1) % elementos.length;
        tamanho++;
    }

    public T desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        T elemento = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return elemento;
    }

    public T espiar() {
        if (estaVazia()) {
            return null;
        }
        return elementos[inicio];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean remover(T elemento) {
        if (estaVazia()) return false;
        int index = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[index].equals(elemento)) {
                for (int j = i; j < tamanho - 1; j++) {
                    elementos[(inicio + j) % elementos.length] =
                            elementos[(inicio + j + 1) % elementos.length];
                }
                fim = (fim - 1 + elementos.length) % elementos.length;
                tamanho--;
                return true;
            }
            index = (index + 1) % elementos.length;
        }
        return false;
    }

    private void aumentarCapacidade() {
        T[] novo = (T[]) new Object[elementos.length * 2];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = elementos[(inicio + i) % elementos.length];
        }
        elementos = novo;
        inicio = 0;
        fim = tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[(inicio + i) % elementos.length]);
            if (i < tamanho - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}