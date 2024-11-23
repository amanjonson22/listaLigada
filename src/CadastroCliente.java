public class CadastroCliente {
    public static void main(String[] args) {
        Lista listaClientes = new Lista();
        Cliente c = new Cliente(221, "Produtos excelentes LTDA", "Rua Sem Fim, 200", 5000.0);
        
        listaClientes.insereIncio(c);
        listaClientes.insereIncio(new Cliente(185, "Negócios Importantes SA", "Avenida Principal, 10", 12000.0));

        listaClientes.insereIncio(new Cliente(443, "Parceiros Críticos LTDA", "Rua dos negócios, 2000", 7000));
    
        Cliente clienteRemovido = (Cliente) listaClientes.removeInicio();
        System.out.println(clienteRemovido);
    }
}
