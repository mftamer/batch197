package day22_revision_oop;
/*
    Imagine you want to create a code for various music player devices (MobilePhone and Mp3Player)in a music playback
    application. This code should include basic functions like
            playing music,
            pausing,
            stopping.
            skipping forward,
            and skipping backward.
    Additionally, each music player device should implement these functions using their own methods.
 */
public interface MusicPlayer {

    void playMusic();

    void pause();

    void stop();

    void skipForward();

    void skipBackward();

}
