package day22_revision_oop;

public class Mp3Player implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("Mp3 Plays!");
    }

    @Override
    public void pause() {
        System.out.println("Mp3 Pause!");
    }

    @Override
    public void stop() {
        System.out.println("Mp3 Stops!");
    }

    @Override
    public void skipForward() {
        System.out.println("Mp3 Skipped Forward!");
    }

    @Override
    public void skipBackward() {
        System.out.println("Mp3 Skipped Backward!");
    }
}
