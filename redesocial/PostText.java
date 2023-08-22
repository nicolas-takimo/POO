public class PostText extends Post{
    
    private String text;
    
    
    PostText(String comentario, int curtida, int compartilhamento, String privacidade, String text) {
        super(comentario, curtida, compartilhamento, privacidade);
        this.text = text;
    }


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }
   

}