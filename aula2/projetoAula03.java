package aula2;
import java.util.ArrayList;

public class projetoAula03 {
    public static void main(String[] args) {
        ArrayList<String> vetor = new ArrayList<>();
        vetor.add("Elemento 1");
        vetor.add("Elemento 2");
        vetor.add("Elemento 3");

        System.out.println("Quantidade de dados no vetor: " + vetor.size());
        System.out.println("Informações dentro do vetor: " + vetor.toString());
    }
}
