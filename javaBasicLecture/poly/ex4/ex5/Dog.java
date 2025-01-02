package javaBasicLecture.poly.ex4.ex5;

public class Dog implements InterFaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍~");
    }

    @Override
    public void move() {
        System.out.println("개가 걸어다닙니다.");
    }
}
