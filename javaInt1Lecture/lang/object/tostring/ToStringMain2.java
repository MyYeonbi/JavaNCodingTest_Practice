package javaInt1Lecture.lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이 1",2);
        Dog dog2 = new Dog("멍멍이 2",5);

        System.out.println("1, 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
    }
}
