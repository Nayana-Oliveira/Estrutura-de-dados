package aula7;

public class No<Tipo> {
    private Tipo elemento;
    private No<Tipo> proximo;

    public No(Tipo elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No (Tipo elemento, No<Tipo> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No<Tipo> getProximo() {
        return proximo;
    }

    public void setProximo(No<Tipo> proximo) {
        this.proximo = proximo;
    }

    public Tipo getElemento() {
        return elemento;
    }

    public void setElemento(Tipo elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", próximo=" + proximo + "}";
    }
}