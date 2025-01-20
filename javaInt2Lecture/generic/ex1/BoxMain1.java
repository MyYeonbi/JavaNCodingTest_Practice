package javaInt2Lecture.generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // 오토박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        //인스턴스 메서드(set)를 클래스 이름을 통해 호출하여 생긴 오류_ 해결 과정은 이슈란 ✨
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

    }
}
