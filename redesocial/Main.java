public class Main{

    public static void main(String[] args){

    PostImg post1 = new PostImg("Muito bonita a paisagem", 4, 3, "Publica","Imagem de um campo de flores");
    PostVid post2 = new PostVid("Lindo gato ", 4, 3, "Publica","Gatinho fofo");
    PostText post3 = new PostText("Pq ?", 4, 3, "Publica","Hoje eu acordei muito entediado");
    
    System.out.println("Esses são os post do seu dia \n");
    System.out.println("-----Post 1 Imagem----");
    System.out.println("Imagem = "+ post1.getImagem());
    System.out.println("Imagem = "+ post1.getImagem());


    }
}