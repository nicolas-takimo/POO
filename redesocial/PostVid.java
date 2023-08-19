public class PostVid extends Post {
    
    private String video;
    
    PostVid(String comentario, int curtida, int compartilhamento, String privacidade, String video) {
        super(comentario, curtida, compartilhamento, privacidade);
        this.video = video;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    

    
}