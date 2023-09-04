public class Pessoa {
    String nome;
    int rg, cpf;

    public Pessoa(String nome, int rg, int cpf) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
}

