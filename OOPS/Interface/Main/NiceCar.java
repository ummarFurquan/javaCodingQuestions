package OOPS.Interface.Main;
//This is the final class
//In this we can see how to call function based on the type of object that is being created!
public class NiceCar {
    private Engine engine;
    private Media player = new CarMediaPlayer();

    public NiceCar(){
        engine = new PowerEngine(); // default to PowerEngine
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void startengine(){
        engine.start(); // If the engine type is power it calls power and if electric it calls electric
    }
    public void stopengine(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}

