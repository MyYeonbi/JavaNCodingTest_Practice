package javaInt2Lecture.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();

        Integer integer2 = (Integer) integerBox.get(); // Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String string = (String) stringBox.get(); // Object -> String 캐스팅



    }
}
