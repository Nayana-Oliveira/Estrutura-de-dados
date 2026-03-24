package aula1;

public class revisaoED {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");
        vetor.adiciona("Elemento 6");
        vetor.adiciona("Elemento 7");

        System.out.println("Quantidade de dados do vetor: " + vetor.tamanho());
        System.out.println("Dados do vetor: " + vetor.toString());

        vetor.remove(2);

        System.out.println("Quantidade de dados do vetor: " + vetor.tamanho());
        System.out.println("Dados do vetor: " + vetor.toString());

        vetor.removerInfo("Elemento 2");

        System.out.println("Quantidade de dados do vetor: " + vetor.tamanho());
        System.out.println("Dados do vetor: " + vetor.toString());

        vetor.alterarInfo(2, "Teste");
        System.out.println("Quantidade de dados do vetor: " + vetor.tamanho());
        System.out.println("Dados do vetor: " + vetor.toString());
    }
}
