package javaInt2Lecture.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        //생성 시점에 T의 타입 결정.
        integerBox.set(10);
        //integerBox.set("문자"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅 할 필요 없다.)
        System.out.println("integer = "+ integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello");
        String s = stringBox.get();
        System.out.println("s = " + s);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(3.14);
        Double doubleBox = doubleBox.get();
        System.out.println("doubleBox = " + doubleBox);
    }
}
