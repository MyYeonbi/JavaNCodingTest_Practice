package javaBasicLecture.poly.ex4.ex5;

public class Cat implements InterFaceAnimal{
    @Override
    public void sound() {
        System.out.println("야옹~");
    }

    @Override
    public void move() {
        System.out.println("고양이가 걸어다닙니다.");
    }
}
