package ado1;

public class Pokemon {
    public String nome;
    public String tipo;
    public String treinador;
    private int hpAtual;
    private int hpMaximo;
    private double tempoRecuperacao;

    public Pokemon(String nome, String tipo, int hpAtual, String treinador, double tempoRecuperacao, int hpMaximo) {
        this.nome = nome;
        this.tipo = tipo;
        this.hpAtual = hpAtual;
        this.treinador = treinador;
        this.tempoRecuperacao = tempoRecuperacao;
        this.hpMaximo = hpMaximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }

    public double getTempoRecuperacao() {
        return tempoRecuperacao;
    }

    public void setTempoRecuperacao(double tempoRecuperacao) {
        this.tempoRecuperacao = tempoRecuperacao;
    }

    public int getHpMaximo() {
        return hpMaximo;
    }

    public void setHpMaximo(int hpMaximo) {
        this.hpMaximo = hpMaximo;
    }

    public int getHpAtual() {
        return hpAtual;
    }

    public void setHpAtual(int hpAtual) {
        this.hpAtual = hpAtual;
    }

    @Override
    public String toString() {
        return "\n-----------------------------" +
                "\nNome: " + nome +
                "\nTipo: " + tipo +
                "\nTreinador: " + treinador +
                "\nHP Atual: " + hpAtual +
                "\nHP Máximo: " + hpMaximo +
                "\nTempo de Recuperação: " + tempoRecuperacao + " horas" +
                "\n-----------------------------";
    }
}
