public class Post {
    private String comentario;
    private int curtida;
    private int compartilhamento;
    private String privacidade;


    Post(String comentario, int curtida, int compartilhamento, String privacidade) {
        this.comentario = comentario;
        this.curtida = curtida;
        this.compartilhamento = compartilhamento;
        this.privacidade = privacidade;

    }


    public String getComentario() {
        return comentario;
    }


    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    public int getCurtida() {
        return curtida;
    }


    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }


    public int getCompartilhamento() {
        return compartilhamento;
    }


    public void setCompartilhar(int compartilhamento) {
        this.compartilhamento = compartilhamento;
    }


    public String getPrivacidade() {
        return privacidade;
    }


    public void setPrivacidade(String privacidade) {
        this.privacidade = privacidade;
    }

    

}