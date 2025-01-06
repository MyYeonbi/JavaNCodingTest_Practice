package javaInt1Lecture.lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object o = dog;
        action(dog);
        action(car);
    }
    private static void action(Object obj) {

    }
}
