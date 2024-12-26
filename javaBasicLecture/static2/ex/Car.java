package javaBasicLecture.static2.ex;

public class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public int showTotalCars(){
        return this.model.length();
    }
}
