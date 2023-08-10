public class Estudante {
    private String nome;
    private String email;
    private String curso;
    private int numMatricula;


    Estudante(String nome, String email, String curso, int numMatricula) {
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.numMatricula = numMatricula;
    }


    //Métodos gets e sets 
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getCurso() {
        return curso;
    }
    public int getNumMatricula() {
        return numMatricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }   
    //////////////Fim get e set ////////////////

}