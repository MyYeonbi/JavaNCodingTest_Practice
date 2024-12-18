package javaBasicLecture.ref.oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volunmeup();
        player.volunmeup();
        player.volumedown();
        player.showStatus();
        player.off();
    }
}
