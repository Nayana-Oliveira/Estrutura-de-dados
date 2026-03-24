package ado2;

public class FilaAtendimento {
    private Fila<Paciente> prioridade = new Fila<>();
    private Fila<Paciente> comum = new Fila<>();

    private int contadorPrioridade = 0;
    private int senhaP = 1;
    private int senhaC = 1;

    public void gerarSenha(String tipo) {
        if (tipo.equalsIgnoreCase("P")) {
            prioridade.enfileirar(new Paciente("P", senhaP++));
        } else {
            comum.enfileirar(new Paciente("C", senhaC++));
        }
    }

    public Paciente chamarProximo() {
        if (!prioridade.estaVazia() && contadorPrioridade < 3) {
            contadorPrioridade++;
            return prioridade.desenfileirar();
        }
        if (!comum.estaVazia()) {
            contadorPrioridade = 0;
            return comum.desenfileirar();
        }
        if (!prioridade.estaVazia()) {
            return prioridade.desenfileirar();
        }
        return null;
    }

    public Paciente verProximo() {
        if (!prioridade.estaVazia() && contadorPrioridade < 3) {
            return prioridade.espiar();
        }
        if (!comum.estaVazia()) {
            return comum.espiar();
        }
        if (!prioridade.estaVazia()) {
            return prioridade.espiar();
        }
        return null;
    }

    public void listar() {
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Comum: " + comum);
    }

    public boolean excluirSenha(String tipo, int numero) {
        Paciente p = new Paciente(tipo, numero);

        if (tipo.equalsIgnoreCase("P")) {
            return prioridade.remover(p);
        } else {
            return comum.remover(p);
        }
    }
}