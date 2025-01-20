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
        System.out.println("string = " + string);

        // 잘못된 타입의 인수 전달시
        integerBox.set("문자가 왜 integer박스에 들어가죠?");
        Integer result = (integer) integerBox.get(); //String -> Integer 캐스팅 예외
        System.out.println("result = " + result);



    }
}
