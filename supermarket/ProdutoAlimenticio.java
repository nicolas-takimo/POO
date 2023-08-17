public class ProdutoAlimenticio extends Produto {
    private String data;
    private String temperatura;

    public ProdutoAlimenticio(String nome, float peso, String fornecedor, int codBarras, String categoria, String data, String temperatura) {
        super(nome, peso, fornecedor, codBarras, categoria);
        this.data = data;
        this.temperatura = temperatura;
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    
}
