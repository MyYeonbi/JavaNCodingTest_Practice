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

    }
}
