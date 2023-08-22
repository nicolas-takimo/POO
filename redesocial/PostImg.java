public class PostImg extends Post {
    private String  imagem; 

    PostImg(String comentario, int curtida, int compartilhamento, String privacidade,String imagem) {
         super(comentario, curtida, compartilhamento, privacidade);
         this.imagem = imagem;
     }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

     
}