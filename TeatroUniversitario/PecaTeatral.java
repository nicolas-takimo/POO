import java.util.ArrayList;
import java.util.List;
class PecaTeatral extends Evento {
    Pessoa diretor;
    List<Pessoa> autores = new ArrayList<>();
    List<Pessoa> produtores = new ArrayList<>();
    List<Artista> elenco = new ArrayList<>();

    public PecaTeatral(String nome, Pessoa responsavel, int duracao, int qtdPessoasEsperadas, Pessoa diretor, List<Pessoa> autores, List<Pessoa> produtores, List<Artista> elenco) {
        super(nome, responsavel, duracao, qtdPessoasEsperadas);
        this.diretor = diretor;
        this.autores = autores;
        this.produtores = produtores;
        this.elenco = elenco;
    }

    @Override
    public void adicionaParticipante(Pessoa pessoa) {
        if (pessoa instanceof Artista) {
            elenco.add((Artista) pessoa);
        } else {
            autores.add(pessoa);
        }
    }

    @Override
    public void mostraDetalhes() {
        System.out.println("Diretor: " + diretor.getNome());
        System.out.println("Autores:");
        autores.forEach(a -> System.out.println(a.getNome()));
        System.out.println("Produtores:");
        produtores.forEach(p -> System.out.println(p.getNome()));
        System.out.println("Elenco:");
        elenco.forEach(e -> System.out.println(e.getNome()));
    }
}