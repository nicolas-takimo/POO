import java.util.ArrayList;
import java.util.List;
class Formatura extends Evento {
    List<Pessoa> formandos = new ArrayList<>();
    List<String> cursos = new ArrayList<>();

    public Formatura(String nome, Pessoa responsavel, int duracao, int qtdPessoasEsperadas, List<Pessoa> formandos, List<String> cursos) {
        super(nome, responsavel, duracao, qtdPessoasEsperadas);
        this.formandos = formandos;
        this.cursos = cursos;
    }

    @Override
    public void adicionaParticipante(Pessoa pessoa) {
        formandos.add(pessoa);
    }

    @Override
    public void mostraDetalhes() {
        System.out.println("Formandos:");
        formandos.forEach(f -> System.out.println(f.getNome()));
        System.out.println("Cursos:");
        cursos.forEach(System.out::println);
    }
}