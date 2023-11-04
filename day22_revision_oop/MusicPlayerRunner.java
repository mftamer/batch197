package day22_revision_oop;

public class MusicPlayerRunner {

    public static void main(String[] args) {

        MobilePhone myMobile = new MobilePhone();

        myMobile.pause();
        myMobile.playMusic();
        myMobile.skipBackward();
        myMobile.stop();
        myMobile.skipForward();


        Mp3Player myMP3 = new Mp3Player();

        myMP3.pause();
        myMP3.playMusic();
        myMP3.skipBackward();
        myMP3.stop();
        myMP3.skipForward();

    }

}
