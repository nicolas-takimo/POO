public class Estoque extends Produtos implements Cadastro {
    private int numPartilheira;
    private int numDaFila;
    private String nome;
    private String dataEntrada;
    private String codigo;

    public Estoque(String nome, int codigoBarra, float valor, int numPartilheira, int numDaFila) {
        super(nome, codigoBarra, valor);
        this.numPartilheira = numPartilheira;
        this.numDaFila = numDaFila;
    }

    @Override
    public String nome(String nome) {
        this.nome = nome;
        return this.nome;
    }

    @Override
    public String dataEntrada(String data) {
        this.dataEntrada = data;
        return this.dataEntrada;
    }

    @Override
    public String codigo(String codigo) {
        this.codigo = codigo;
        return this.codigo;
    }

    public int getNumPartilheira() {
        return numPartilheira;
    }

    public void setNumPartilheira(int numPartilheira) {
        this.numPartilheira = numPartilheira;
    }

    public int getNumDaFila() {
        return numDaFila;
    }

    public void setNumDaFila(int numDaFila) {
        this.numDaFila = numDaFila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
