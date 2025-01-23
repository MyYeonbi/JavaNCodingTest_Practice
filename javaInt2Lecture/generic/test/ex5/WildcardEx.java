package javaInt2Lecture.generic.test.ex5;

import javaInt2Lecture.generic.animal.Animal;

public class WildcardEx {

    /*제네릭 타입을 활용해 Box 객체 내부의 값을 출력하는 정적 메서드입니다.
    제네릭 타입을 사용함으로써 다양한 타입의 Box 객체를 처리할 수 있으며,
    코드의 재사용성과 타입 안전성을 높여줍니다.*/
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = "+ box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }
}
