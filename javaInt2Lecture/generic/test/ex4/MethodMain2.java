package javaInt2Lecture.generic.test.ex4;


import javaInt2Lecture.generic.animal.Cat;
import javaInt2Lecture.generic.animal.Dog;
import javaInt2Lecture.generic.test.ex4.AnimalMethod;


public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog); // 타입을 맞춰줘야 함.
        System.out.println("bigger = "+ bigger);


    }
}
