import java.util.ArrayList;
import java.util.Arrays;

public class Escola {

    public static float calcularMediaGlobal(Estudante estudante, ArrayList<Matricula> matriculas) {
        float soma = 0;
        int contador = 0;
        for (Matricula matricula : matriculas) {
            if (matricula.getAluno().equals(estudante)) {
                soma += matricula.calcularMedia();
                contador++;
            }
        }
        return contador > 0 ? soma / contador : 0;
    }
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("maycon", "joao@email.com", "Engenharia", 123255665);
        Estudante estudante2 = new Estudante("Fernanda", "maria@email.com", "Matemática", 456856987);
        Estudante estudante3 = new Estudante("Pedro", "pedro@email.com", "Física", 789123586);
        Estudante estudante4 = new Estudante("Ana Julia", "ana@email.com", "Química", 321785236);
        Estudante estudante5 = new Estudante("Fábio Ruver", "Xandlendariomatadordeporco@gmail.com", "Ciência da Computação ", 777785236);

        Disciplina disciplina1 = new Disciplina("Programação", 64);
        Disciplina disciplina2 = new Disciplina("Cálculo", 96);

        ArrayList<Matricula> matriculas = new ArrayList<>();

        ArrayList<Estudante> estudantes = new ArrayList<>(Arrays.asList(estudante1, estudante2, estudante3, estudante4, estudante5));
        for (Estudante estudante : estudantes) {
            ArrayList<Float> notas1 = new ArrayList<>(Arrays.asList(5.0f, 6.0f, 7.0f));
            Matricula matricula1 = new Matricula(notas1, 80, estudante, disciplina1);
            matriculas.add(matricula1);

            ArrayList<Float> notas2 = new ArrayList<>(Arrays.asList(6.0f, 7.0f, 5.0f));
            Matricula matricula2 = new Matricula(notas2, 85, estudante, disciplina2);
            matriculas.add(matricula2);
        }

        for (Estudante estudante : estudantes) {
            float mediaGlobal = calcularMediaGlobal(estudante, matriculas);
            System.out.println("Média global de " + estudante.getNome() + ": " + mediaGlobal);
        }

        for (Matricula matricula : matriculas) {
            System.out.println("Média em " + matricula.getDisciplina().getNome() + " de " + matricula.getAluno().getNome() + ": " + matricula.calcularMedia());
            if (matricula.situacaoAcademica()) {
                System.out.println(matricula.getAluno().getNome() + " aprovado em " + matricula.getDisciplina().getNome());
            } else {
                System.out.println(matricula.getAluno().getNome() + " reprovado em " + matricula.getDisciplina().getNome());
            }
        }
    }
}

