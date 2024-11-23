public class Cliente {
    private long codigo;
    private String razaoSocial;
    private String endereco;
    private double previsaoVendas;

    public Cliente(long c, String r, String e, double p) {
        codigo = c;
        razaoSocial = r;
        endereco = e;
        previsaoVendas = p;
    }

    public String toString() {
        return  "Código: "+codigo+" Razão Social: "+razaoSocial;
    }

    public void atualizacaoRazaoSocial(String r) {
        razaoSocial = r;
    }
    
    public void atualizaPrevisao(double p) {
        previsaoVendas = p;
    }

    public void mudaEndereco (String e) {
        endereco = e;
    }
}
