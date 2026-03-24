package aula6;

public class InsertionSortTime {
    public static void main(String[] args) {
        //criando um vetor de numeros inteiros de 10 espaços
        int[] vetor = new int[1000];

        //inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = (int) (Math.random() * vetor.length);
        }

        //variavel que registra o tempo de inicio da execução
        long inicio = System.currentTimeMillis();

        //metodo de ordenação insertionSort
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

        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execução> " + (fim-inicio));
    }
}