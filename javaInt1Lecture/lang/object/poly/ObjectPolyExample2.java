package javaInt1Lecture.lang.object.poly;

import static java.nio.file.Files.size;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); //Object 인스턴스도 만들 수 있다.

        //Object 타입을 사용한 배열은 세상의 모든 객체를 담을수 있는 배열이다.
        Object [] objects = {dog,car,object};

        size(objects);

    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 : "+objects.length);
    }
}
