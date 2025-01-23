package javaInt2Lecture.generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        Integer result = (Integer) GenericMethod.objMethod(i);

    }
}
