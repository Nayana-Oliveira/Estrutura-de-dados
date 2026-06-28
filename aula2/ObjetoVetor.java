package aula2;

public class ObjetoVetor {
    public String[] elementos;
    public int tamanho;

    public void Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override //sobrescrever um metodo
    public String toString() {
        //classe para criar e manipular dados de Strings
        StringBuilder s = new StringBuilder();
        s.append("[");

        //pega o primeiro valor do vetor até o penultimo valor
        for (int i =0;i < this.tamanho-1 ;i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        //pega o ultimo valor do vetor
        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        return s.toString();
    }

    public String busca(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return this.elementos[posicao];
        } else {
            throw new Exception("Posição inválida!");
        }
    }

    public int busca1(String elemento) {
        for (int i=0; i<tamanho;i++) {
            if (elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean adicionaInicio(int posicao, String elemento) throws Exception{
        this.aumentaCapacidade();
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = this.tamanho - 1; i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        }
        else {
            throw new Exception("Posição invalida!");
        }
        return true;
    }

    public void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) throws  Exception{
        if (posicao >= 0 && posicao <= tamanho) {
            for (int i = posicao; i < this.tamanho; i++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.elementos[this.tamanho - 1] = null;
            this.tamanho--;
        } else {
            throw new Exception("Posição inválida!");
        }
    }

    public void removerInfo(String s) {
        for (int i = 0; i < this.elementos.length; i++){
            if(s.equals(elementos[i])) {
                this.elementos[i] = this.elementos[i+1];
                this.elementos[this.tamanho - 1] = null;
                this.tamanho--;
            }
        }
    }

    public void removeTexto(String elemento) throws Exception {
        int posicao = this.busca1(elemento);
        this.busca(posicao);
        this.remove(posicao);
    }

    public void alterarInfo(int posicao, String elemento) throws Exception {
        //verificar se a posicao é valida
        if(posicao >=  0 && posicao < tamanho){
            this.elementos[posicao] = elemento;
        } else {
            throw new Exception("Posição inválida!");
        }
    }
}
