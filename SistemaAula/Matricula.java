import java.util.ArrayList;

public class Matricula {
    private ArrayList<Float> notas;
    private float frequencia;
    private Estudante aluno;
    private Disciplina disciplina;
    
    Matricula(ArrayList<Float> notas, float frequencia, Estudante aluno, Disciplina disciplina) {
        this.notas = notas;
        this.frequencia = frequencia;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    
    public float calcularMedia() {
        float media = 0;
        int cont = 0;
        for (float nota : notas) {
            media += nota;
            cont++;
        }
        return media / cont;
    }
    public boolean situacaoAcademica() {
        return calcularMedia() >= 5.0 && frequencia >= 75;
    }
    //get 
    public ArrayList<Float> getNotas() {
        return notas;
    }
    public float getFrequencia() {
        return frequencia;
    }
    public Estudante getAluno() {
        return aluno;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    //set
    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }
    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }
    public void setAluno(Estudante aluno) {
        this.aluno = aluno;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

}
