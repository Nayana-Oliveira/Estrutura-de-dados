package ado2;
import java.util.Scanner;

public class TesteFilaAtendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaAtendimento fila = new FilaAtendimento();

        int opcao;
        do {
            System.out.println("\n1-Prioridade | 2-Comum | 3-Chamar | 4-Ver | 5-Listar | 6-Excluir | 0-Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    fila.gerarSenha("P");
                    break;
                case 2:
                    fila.gerarSenha("C");
                    break;
                case 3:
                    Paciente p = fila.chamarProximo();
                    if (p != null)
                        System.out.println("Chamando: " + p);
                    else
                        System.out.println("Fila vazia!");
                    break;
                case 4:
                    Paciente v = fila.verProximo();
                    if (v != null)
                        System.out.println("Próximo: " + v);
                    else
                        System.out.println("Fila vazia!");
                    break;
                case 5:
                    fila.listar();
                    break;
                case 6:
                    System.out.print("Digite o tipo (P/C): ");
                    String tipo = sc.next();

                    System.out.print("Digite o número da senha: ");
                    int num = sc.nextInt();

                    boolean removido = fila.excluirSenha(tipo, num);
                    if (removido)
                        System.out.println("Senha removida!");
                    else
                        System.out.println("Senha não encontrada!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}