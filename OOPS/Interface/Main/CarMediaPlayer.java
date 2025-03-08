package OOPS.Interface.Main;

public class  CarMediaPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Media started");
    }

    @Override
    public void stop() {
        System.out.println("Media Stopped");
    }
}
