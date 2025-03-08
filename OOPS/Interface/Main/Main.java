package OOPS.Interface.Main;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.stop();

        Media carMEdia = new Car();
        carMEdia.stop(); // Engine also has stop method and media also has a stop method! (Ouput : Engine Stopped)
        //How can we fix this conflict?
        //By creating separate classes of the Interfaces
        //Something Like this

        //If not this you can also do this

        Media secMedia = new Media() {
            @Override
            public void start() {
                System.out.println("Media Started");
            }

            @Override
            public void stop() {
                System.out.println("Media Stopped");
            }
        };

        secMedia.stop();

        //Created a class CarMediaPlayer and that implements Media
        //By this you can get rid of the method conflict problem
        CarMediaPlayer newMedia = new CarMediaPlayer();
        newMedia.start(); // Media Started


        NiceCar niceCar = new NiceCar();
        niceCar.startMusic();
        niceCar.stopMusic();
        niceCar.startengine();
        niceCar.stopengine();
        niceCar.upgradeEngine();// Changes to electric Engine

        niceCar.startMusic();
        niceCar.stopMusic();
        niceCar.startengine();
        niceCar.stopengine();


    }
}
