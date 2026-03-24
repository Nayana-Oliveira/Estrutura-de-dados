package aula4;
import java.util.Stack;

public class Teste {
    static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        //verificar se a pilha está vazia
        System.out.println(stack.isEmpty());

        //metodo para empilhar
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //metodo para verificar o tamanho da pilha
        System.out.println(stack.size());

        //metodo toString para exibir a pilha
        System.out.println(stack);

        //metodo para verificar o topo
        System.out.println(stack.peek());

        //metodo para desempilhar
        System.out.println(stack.pop());

        //metodo toString para exibir a pilha
        System.out.println(stack);
    }
}
