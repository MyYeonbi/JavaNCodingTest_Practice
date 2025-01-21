package javaInt2Lecture.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        //생성 시점에 T의 타입 결정.
        integerBox.set(10);
        integerBox.set("문자"); // Integer 타입만 허용, 컴파일 오류
    }
}
