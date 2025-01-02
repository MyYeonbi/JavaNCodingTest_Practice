package javaBasicLecture.poly.ex5;


public class Cow implements InterFaceAnimal {
    @Override
    public void sound() {
        System.out.println("음매~");

    }

    @Override
    public void move() {
        System.out.println("소가 걸어다닙니다. ");
    }
}
