package aula4;
import java.util.Arrays;

public class EstruturaEstatica<T> {
    public T[] elementos;
    public int tamanho;

    //construtor
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //construtor sem parametros
    public EstruturaEstatica() {
        this(10);
    }

    //metodo para adicionar elementos na estrutura
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        return true;
    }

    //metodo para adicionar elementos em um posição especifica
    public boolean adiciona(int posicao, T elemento) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição inválida!");
        }
        this.aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    //metodo para aumentar a capacidade de armazenamento da estrutura
    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos =  elementosNovos;
        }
    }

    //metodo para verificar a quantidade de dados dentro da estrutura
    public int tamanho() {
        return this.tamanho;
    }

    //metodo para exibir dados da estrutura

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    //metodo para verirficar se existe elementos na estrutura
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    //metodo para remover elementos da estrutura
    public void remove(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição inválida");
        }
        for (int i = posicao; i < tamanho -1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }
}