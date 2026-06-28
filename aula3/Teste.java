package aula3;
import aula2.Contato;

import java.util.ArrayList;

public class Teste {
    static void main(String[] args) {
        VetorObjeto vetor = new VetorObjeto(5);

        aula2.Contato c1 = new aula2.Contato("Claudio", "9999-9999", "claudio123@gmail.com");
        aula2.Contato c2 = new aula2.Contato("Melissa", "9999-9999", "melissa123@gmail.com");
        aula2.Contato c3 = new Contato("Giovanni", "9999-9999", "giovanni123@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        System.out.println(vetor);

        //=============================================================================

        ArrayList<String> arrayList = new ArrayList<String>();

        //adicionando elementos no vetor
        arrayList.add("Elemento A");
        arrayList.add("Elemento C");
        System.out.println(arrayList);
        arrayList.add("Elemento B");

        System.out.println(arrayList);

        //buscando pelo indice
        System.out.println(arrayList.get(1));

        //removendo elemento do vetor
        arrayList.remove(0);
        arrayList.remove("Elemento C");
        System.out.println(arrayList);

        //vendo o tamanho
        System.out.println("Tamanho do vetor: " + arrayList.size());

        /*
        boolean existe = arrayList.contains("Elemento C");
        if (existe) {
            System.out.println("Elemento encontrado no vetor");
        } else {
            System.out.println("Elemento não encontrado no vetor");
        }

        int posicao = arrayList.indexOf("Elemento C");
        if(posicao > -1) {
            System.out.println("Elemento encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento não existe no vetor");
        }
         */
    }
}
