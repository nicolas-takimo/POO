public class Produto {
    private String nome;
    private float peso;
    private String fornecedor;
    private int codBarras;
    private String categoria;

    public Produto(String nome, float peso, String fornecedor, int codBarras, String categoria) {
        this.nome = nome;
        this.peso = peso;
        this.fornecedor = fornecedor;
        this.codBarras = codBarras;
        this.categoria = categoria;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public int getCodBarras() {
        return codBarras;
    }
    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}