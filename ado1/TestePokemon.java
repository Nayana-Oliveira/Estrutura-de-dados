package ado1;

public class TestePokemon {
    public static void main(String[] args) throws Exception {
        CentroPokemon centro = new CentroPokemon(5);

        Pokemon p1 = new Pokemon("Pikachu", "Elétrico", 40, "Ash", 2.5, 100);
        Pokemon p2 = new Pokemon("Charmander", "Fogo", 30, "Brock", 3.0, 90);
        Pokemon p3 = new Pokemon("Bulbasaur", "Planta", 50, "Misty", 1.5, 95);

        centro.adiciona(p1);
        centro.adiciona(p2);
        centro.adiciona(p3);

        System.out.println("Lista inicial");
        System.out.println(centro);

        int posicao = centro.buscaPorNome("Charmander");
        System.out.println("Charmander está na posição: " + posicao);

        Pokemon novoCharmander = new Pokemon("Charmander", "Fogo", 90, "Brock", 0.0, 90);
        centro.alterarInfo(posicao, novoCharmander);

        System.out.println("Após alteração: ");
        System.out.println(centro);

        centro.removePorNome("Pikachu");

        System.out.println("Após remoção: ");
        System.out.println(centro);
    }
}