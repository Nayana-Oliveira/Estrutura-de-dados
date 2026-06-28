package aula6;

public class SelectionSortTime {
    public static void main(String[] args) {
        //criando um vetor de numeros inteiros de 10 espaços
        int[] vetor = new int[1000];

        //inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = (int) (Math.random() * vetor.length);
        }

        //variavel que registra o tempo de inicio da execução
        long inicio = System.currentTimeMillis();

        //metodo de ordenação selectionSort
        int menor_posicao, aux;
        for (int i = 0; i < vetor.length; i++) {
            menor_posicao = i;
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor_posicao]) {
                    menor_posicao = j;
                }
            }
            aux = vetor[menor_posicao];
            vetor[menor_posicao] = vetor[i];
            vetor[i] = aux;
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execução> " + (fim-inicio));
    }
}