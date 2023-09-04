import java.util.ArrayList;
import java.util.List;
class ApresentacaoMusical extends Evento {
    List<Pessoa> interpretes = new ArrayList<>();
    List<Artista> musicos = new ArrayList<>();
    List<String> musicas = new ArrayList<>();

    public ApresentacaoMusical(String nome, Pessoa responsavel, int duracao, int qtdPessoasEsperadas, List<Pessoa> interpretes, List<Artista> musicos, List<String> musicas) {
        super(nome, responsavel, duracao, qtdPessoasEsperadas);
        this.interpretes = interpretes;
        this.musicos = musicos;
        this.musicas = musicas;
    }

    @Override
    public void adicionaParticipante(Pessoa pessoa) {
        if (pessoa instanceof Artista) {
            musicos.add((Artista) pessoa);
        } else {
            interpretes.add(pessoa);
        }
    }

    @Override
    public void mostraDetalhes() {
        System.out.println("Interpretes:");
        interpretes.forEach(i -> System.out.println(i.getNome()));
        System.out.println("Músicos:");
        musicos.forEach(m -> System.out.println(m.getNome()));
        System.out.println("Músicas:");
        musicas.forEach(System.out::println);
    }
}
