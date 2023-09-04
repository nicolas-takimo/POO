import java.util.ArrayList;
import java.util.List;
class Palestra extends Evento {
    List<Pessoa> palestrantes = new ArrayList<>();

    public Palestra(String nome, Pessoa responsavel, int duracao, int qtdPessoasEsperadas, List<Pessoa> palestrantes) {
        super(nome, responsavel, duracao, qtdPessoasEsperadas);
        this.palestrantes = palestrantes;
    }

    @Override
    public void adicionaParticipante(Pessoa pessoa) {
        palestrantes.add(pessoa);
    }

    @Override
    public void mostraDetalhes() {
        System.out.println("Palestrantes:");
        palestrantes.forEach(p -> System.out.println(p.getNome()));
    }
}