public abstract class Produtos {
    private String nome;
    private int codigoBarra;
    private float valor;

    public Produtos(String nome, int codigoBarra, float valor) {
        this.nome = nome;
        this.codigoBarra = codigoBarra;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    


}
