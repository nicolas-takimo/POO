public class Artista extends Pessoa{
    String sindicato;

    public Artista(String nome, int rg, int cpf, String sindicato) {
        super(nome, rg, cpf);
        this.sindicato = sindicato;
    }
}
