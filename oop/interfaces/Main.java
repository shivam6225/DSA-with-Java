package interfaces;

public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.acc();
//        car.start();
//        car.brake();
//        car.stop();
//        System.out.println("---------------");
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        System.out.println("---------------");

        car.upgradeEngine(new ElectricEngine());
        car.start();

        System.out.println("---------------");
    }
}
