abstract class Evento {
    String nome;
    Pessoa responsavel;
    int duracao, qtdPessoasEsperadas;

    public Evento(String nome, Pessoa responsavel, int duracao, int qtdPessoasEsperadas) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.duracao = duracao;
        this.qtdPessoasEsperadas = qtdPessoasEsperadas;
    }

    public abstract void adicionaParticipante(Pessoa pessoa);
    public abstract void mostraDetalhes();
}