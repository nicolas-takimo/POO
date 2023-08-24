public class Cliente extends Conta{
    private String nome;
    private int  cpf; 
    
    public Cliente(float deposito, float saques, int agencia, int numConta, String nome, int cpf) {
        super(deposito, saques, agencia, numConta);
        this.nome = nome;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    

    
}