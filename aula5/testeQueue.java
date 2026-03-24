package aula5;
import java.util.Queue;
import java.util.LinkedList;

public class testeQueue {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();

        fila.add(1); //adiciona
        fila.add(2);
        fila.add(3);

        System.out.println(fila.toString()); //exibe

        System.out.println(fila.peek()); // recupera, mas nao remove, o cabecalho desta fila ou retorna nulo, se a fila estiver vazia ou seja, nosso metodo espiar

        System.out.println(fila.remove()); //remove elemento da fila ou desinfileira, por conta da classe Queue
        //FIFO - First In First Out (Primeiro a entrar, primeiro a sair)
    }
}
