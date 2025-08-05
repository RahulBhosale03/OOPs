package Interface.Devices;

public class SmartPhones implements Camera , MusicPlayer , Phone{
    @Override
    public void click() {
        System.out.println("click photos");
    }

    @Override
    public void play() {
        System.out.println("Play Music");
    }

    @Override
    public void call() {
        System.out.println("Make Call");
    }
}
