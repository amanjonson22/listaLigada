public class Lista {
    private No inicio;

    public Lista() {
        this.inicio = null;
    }

    public void insereIncio(Object elemento) {
        No novoNo = new No(elemento, null);
        novoNo.setProximo(this.inicio);
        this.inicio = novoNo;
    }

    public Object removeInicio() {
       No auxiliar = this.inicio;
       this.inicio = auxiliar.getProximo();
       return auxiliar.getElemento(); 
    }

    public void imprimeLista() {
        No auxiliar = this.inicio;
        System.out.println("Inicio da lista ligada");
        while (auxiliar != null) {
            System.out.println(auxiliar.getElemento());
            auxiliar = auxiliar.getProximo();
        }
        System.out.println("Final da lista ligada");
    }

    public Object buscaElemento(long posicao) {
        No auxiliar = this.inicio;

        while((posicao > 0) && (auxiliar != null)) {
            if (posicao == 1) {
                return auxiliar.getElemento();
                posicao--;
                auxiliar = auxiliar.getProximo();
            }
            return null
        }
    }

    public void liberaLista() {
        while (inicio != null) {
            inicio = inicio.getProximo();
        }
    }
}

