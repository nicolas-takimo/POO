import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Pessoa responsavel = new Pessoa("João", 1234, 5678);
        Artista artista1 = new Artista("Maria", 4321, 8765, "Sindicato A");
        Pessoa palestrante1 = new Pessoa("Carlos", 9876, 5432);
        Pessoa formando1 = new Pessoa("Ana", 5555, 7777);
        
        List<Pessoa> interpretes = new ArrayList<>();
        List<Artista> musicos = new ArrayList<>();
        List<String> musicas = List.of("Musica 1", "Musica 2");
        
        ApresentacaoMusical show = new ApresentacaoMusical(
            "Show de Talentos", responsavel, 120, 100, interpretes, musicos, musicas
        );
        
        List<Pessoa> palestrantes = List.of(palestrante1);
        Palestra palestra = new Palestra("Palestra de Tecnologia", responsavel, 60, 50, palestrantes);
        
        List<Pessoa> formandos = List.of(formando1);
        List<String> cursos = List.of("Engenharia", "Medicina");
        Formatura formatura = new Formatura("Formatura 2023", responsavel, 180, 200, formandos, cursos);
        
        PecaTeatral peca = new PecaTeatral(
            "O Rei Leão", responsavel, 150, 300, responsavel, new ArrayList<>(), new ArrayList<>(), new ArrayList<>()
        );

        show.adicionaParticipante(artista1);
        show.adicionaParticipante(responsavel);
        
        palestra.adicionaParticipante(palestrante1);
        
        formatura.adicionaParticipante(formando1);
        
        peca.adicionaParticipante(artista1);
        

        System.out.println("Detalhes do show:");
        show.mostraDetalhes();
        
        System.out.println("\nDetalhes da palestra:");
        palestra.mostraDetalhes();
        
        System.out.println("\nDetalhes da formatura:");
        formatura.mostraDetalhes();
        
        System.out.println("\nDetalhes da peça teatral:");
        peca.mostraDetalhes();
    }
}
