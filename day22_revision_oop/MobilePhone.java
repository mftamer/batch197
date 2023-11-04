package day22_revision_oop;

public class MobilePhone implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("Mobile Phone Plays!");
    }

    @Override
    public void pause() {
        System.out.println("Mobile Phone Pause!");
    }

    @Override
    public void stop() {
        System.out.println("Mobile Phone Stopped!");
    }

    @Override
    public void skipForward() {
        System.out.println("Mobile Phone Skipped Forward!");
    }

    @Override
    public void skipBackward() {
        System.out.println("Mobile Phone Skipped Backward!");
    }
}
