public class Main{

    public static void main(String[] args){

    PostImg  post1 = new PostImg("Muito bonita a paisagem", 4, 3, "Publica","Imagem de um campo de flores");
    PostVid  post2 = new PostVid("Lindo gato ", 4, 3, "Publica","Gatinho fofo");
    PostText post3 = new PostText("Pq ?", 4, 3, "Publica","Hoje eu acordei muito entediado");
    
    System.out.println("Esses são os post do seu dia \n");
    System.out.println("----------------------------------");
    System.out.println("-----Post 1 Imagem----");
    System.out.println("Imagem = "+ post1.getImagem());
    System.out.println("Privacidade = "+ post1.getPrivacidade());
    System.out.println("Curtida  = "+ post1.getCurtida());
    System.out.println("Comentario = "+ post1.getComentario());
    System.out.println("Compartilhamento = "+ post1.getCompartilhamento());

    System.out.println("-----Post 2 Vídeo----");
    System.out.println("Video = "+ post2.getVideo());
    System.out.println("Privacidade = "+ post2.getPrivacidade());
    System.out.println("Curtida = "+ post2.getCurtida());
    System.out.println("Comentario = "+ post2.getComentario());
    System.out.println("Compartilhamento  = "+ post2.getCompartilhamento());

    System.out.println("-----Post 3 Texto ----");
    System.out.println("Text = "+ post3.getText());
    System.out.println("Privacidade = "+ post3.getPrivacidade());
    System.out.println("Curtida = "+ post3.getCurtida());
    System.out.println("Comentario = "+ post3.getComentario());
    System.out.println("Compartilhamento = "+ post3.getCompartilhamento());

    

    



    }
}