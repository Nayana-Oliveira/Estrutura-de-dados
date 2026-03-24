package ado1;

public class CentroPokemon {
    public Pokemon[] pokemons;
    public int tamanho;

    public CentroPokemon(int capacidade) {
        this.pokemons = new Pokemon[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Pokemon pokemon) {
        this.aumentaCapacidade();
        this.pokemons[this.tamanho] = pokemon;
        this.tamanho++;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int buscaPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (pokemons[i].nome.equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.pokemons.length) {
            Pokemon[] pokemonsNovos = new Pokemon[this.pokemons.length * 2];
            for (int i = 0; i < this.pokemons.length; i++) {
                pokemonsNovos[i] = this.pokemons[i];
            }
            this.pokemons = pokemonsNovos;
        }
    }

    public void removerPokemon(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {

            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.pokemons[i] = this.pokemons[i + 1];
            }

            this.pokemons[this.tamanho - 1] = null;
            this.tamanho--;

        } else {
            throw new Exception("Posição inválida!");
        }
    }

    public void removePorNome(String nome) throws Exception {
        int posicao = buscaPorNome(nome);

        if (posicao != -1) {
            removerPokemon(posicao);
        } else {
            throw new Exception("Pokemon não encontrado!");
        }
    }

    public void alterarInfo(int posicao, Pokemon pokemon) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            this.pokemons[posicao] = pokemon;
        } else {
            throw new Exception("Posição inválida!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokémons no Centro: ");
        for (int i = 0; i < tamanho; i++) {
            sb.append(pokemons[i]).append("\n");
        }
        return sb.toString();
    }
}