interface Playabl{
    void playmedia();
}

interface Downloadable{
    void downloadMedia();
}

class MusicPlayer implements Playabl, Downloadable{
    
    public void downloadMedia(){
        System.out.println("Downloading music...");
    }
    
    public void playmedia(){
        System.out.println("Playing music...");
    }
}

public class Task27 {
    public static void main(String[] args) {
        MusicPlayer music = new MusicPlayer();
        music.playmedia();
        music.downloadMedia();
    }
}
