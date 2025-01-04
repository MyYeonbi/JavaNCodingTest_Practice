package javaBasicLecture.poly.car1;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("New Car Engine Started");
    }

    @Override
    public void offEngine() {
        System.out.println("New Car Engine Stopped");
    }

    @Override
    public void pressAccelerate() {
        System.out.println("New Car press Accelerate");
    }
}
