public class CadastroCliente {
    public static void main(String[] args) {
        Lista listaClientes = new Lista();
        Cliente c = new Cliente(221, "Produtos excelentes LTDA", "Rua Sem Fim, 200", 5000.0);
        
        listaClientes.insereIncio(c);
        listaClientes.insereIncio(new Cliente(185, "Negocios Importantes SA", "Avenida Principal, 10", 12000.0));

        listaClientes.insereIncio(new Cliente(443, "Parceiros Criticos LTDA", "Rua dos negocios, 2000", 7000));
    
        listaClientes.imprimeLista();;
        c = (Cliente) listaClientes.buscaElemento(2);
        if (c != null) {
            System.out.println("Elemento da posicao 2 da lista ligada");
            System.out.println(c);
        }


        Cliente clienteRemovido = (Cliente) listaClientes.removeInicio();
        System.out.println("Elemento removido da Lista Ligada");
        System.out.println(c);

        listaClientes.imprimeLista();
        System.out.println("Liberando toda a lista");
        
        listaClientes.liberaLista();
        listaClientes.imprimeLista();
    }
}
