package javaInt1Lecture.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 ENUM 변환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
    }
}
