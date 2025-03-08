package OOPS.Interface.Main;

//
public class Car implements Brake, Media, Engine {

    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public void start() {
        System.out.println("Start Engine");

    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");
    }

    @Override
    public void acceleration() {
        System.out.println("Accelerate");
    }

}
