public final class ProdutoEletrico extends Produtos {
    private String voltagem;
    private String marca;

    public ProdutoEletrico(String nome, int codigoBarra, float valor, String voltagem, String marca) {
        super(nome, codigoBarra, valor);
        this.voltagem = voltagem;
        this.marca = marca;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}
