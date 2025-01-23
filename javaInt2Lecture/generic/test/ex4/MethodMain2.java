package javaInt2Lecture.generic.test.ex4;


import javaInt2Lecture.generic.animal.Cat;
import javaInt2Lecture.generic.animal.Dog;

public class MethodMain2 {
    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("냐옹이", 100);

    AnimalMethod.checkup(dog);
    AnimalMethod.checkup(cat);

}
