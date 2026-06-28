public class Main {
    public static void main(String[] args) {
        GrafoPokemon grafo = new GrafoPokemon();

        grafo.adicionarPokemon("Charmander");
        grafo.adicionarPokemon("Charmeleon");
        grafo.adicionarPokemon("Charizard");

        grafo.adicionarPokemon("Eevee");
        grafo.adicionarPokemon("Vaporeon");
        grafo.adicionarPokemon("Jolteon");
        grafo.adicionarPokemon("Flareon");

        grafo.adicionarEvolucao("Charmander", "Charmeleon", "Nível 16");

        grafo.adicionarEvolucao("Charmeleon", "Charizard", "Nível 36");

        grafo.adicionarEvolucao("Eevee", "Vaporeon", "Pedra da Água");

        grafo.adicionarEvolucao("Eevee", "Jolteon", "Pedra do Trovão");

        grafo.adicionarEvolucao("Eevee", "Flareon", "Pedra do Fogo");

        System.out.println("=== EVOLUÇÕES ===");
        grafo.mostrarEvolucoes("Eevee");

        System.out.println("\n=== CADEIA EVOLUTIVA ===");
        grafo.mostrarCadeia("Charmander");

        System.out.println("\n=== VERIFICAR EVOLUÇÃO ===");

        boolean resultado = grafo.podeEvoluir("Charmander", "Charizard"
        );

        if (resultado) {
            System.out.println("Charmander evolui para Charizard!");
        } else {
            System.out.println("Charmander NÃO evolui para Charizard!");
        }
    }
}