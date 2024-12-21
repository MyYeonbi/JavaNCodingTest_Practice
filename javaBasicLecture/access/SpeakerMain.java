package javaBasicLecture.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();
    }
}
