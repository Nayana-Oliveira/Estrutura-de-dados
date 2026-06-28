package aula6;

public class InsertionSort {
    public static void main(String[] args) {
        //criando um vetor de numeros inteiros de 10 espaços
        int[] vetor = new int[10];

        //inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        //metodo de ordenação insertionsort
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

        System.out.println("Nosso vetor ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}