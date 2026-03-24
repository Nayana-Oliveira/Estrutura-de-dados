package ado2;

public class Paciente {
    private String tipo;
    private int senha;

    public Paciente(String tipo, int senha) {
        this.tipo = tipo;
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return tipo + senha;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Paciente)) return false;

        Paciente p = (Paciente) obj;
        return this.tipo.equals(p.tipo) && this.senha == p.senha;
    }
}