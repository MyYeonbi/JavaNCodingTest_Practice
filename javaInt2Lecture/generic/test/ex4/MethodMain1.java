package javaInt2Lecture.generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        Integer result = (Integer) GenericMethod.objMethod(i);

        // 타입 인자(Type Arqument) 명시적 전달
        System.out.println("명시적 타입 인자 명시적 전달");
        GenericMethod.<Integer>genericMethod(i);


    }
}