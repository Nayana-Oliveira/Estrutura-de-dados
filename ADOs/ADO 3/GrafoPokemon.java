import java.util.*;

public class GrafoPokemon {
    private ArrayList<Vertice> pokemons = new ArrayList<>();

    public void adicionarPokemon(String nome) {
        if (buscarPokemon(nome) == null) {
            pokemons.add(new Vertice(nome));
        }
    }

    public Vertice buscarPokemon(String nome) {
        for (Vertice v : pokemons) {
            if (v.getNome().equalsIgnoreCase(nome)) {
                return v;
            }
        }
        return null;
    }

    public void adicionarEvolucao(String origem, String destino, String condicao) {
        Vertice p1 = buscarPokemon(origem);
        Vertice p2 = buscarPokemon(destino);

        if (p1 != null && p2 != null) {
            Aresta evolucao = new Aresta(p1, p2, condicao);
            p1.adicionarEvolucao(evolucao);
        } else {
            System.out.println("Pokémon não encontrado!");
        }
    }

    public void mostrarEvolucoes(String nome) {
        Vertice p = buscarPokemon(nome);

        if (p == null) {
            System.out.println("Pokémon não encontrado!");
            return;
        }

        System.out.println("Evoluções de " + nome + ":");

        for (Aresta e : p.getEvolucoes()) {
            System.out.println("→ " + e.getDestino().getNome() + " (" + e.getCondicao() + ")");
        }
    }

    public void mostrarCadeia(String nome) {
        Vertice p = buscarPokemon(nome);

        if (p == null) {
            System.out.println("Pokémon não encontrado!");
            return;
        }

        System.out.print("Cadeia: ");
        dfs(p);
        System.out.println();
    }

    private void dfs(Vertice atual) {
        System.out.print(atual.getNome());

        if (atual.getEvolucoes().isEmpty()) return;

        for (Aresta e : atual.getEvolucoes()) {
            System.out.print(" → ");
            dfs(e.getDestino());
        }
    }

    public boolean podeEvoluir(String origem, String destino) {
        Vertice p1 = buscarPokemon(origem);
        Vertice p2 = buscarPokemon(destino);

        if (p1 == null || p2 == null) return false;

        return dfsBusca(p1, p2, new ArrayList<>());
    }

    private boolean dfsBusca(Vertice atual, Vertice alvo, ArrayList<Vertice> visitados) {
        if (atual == alvo) return true;

        visitados.add(atual);

        for (Aresta e : atual.getEvolucoes()) {
            Vertice prox = e.getDestino();
            if (!visitados.contains(prox)) {
                if (dfsBusca(prox, alvo, visitados)) {
                    return true;
                }
            }
        }
        return false;
    }
}