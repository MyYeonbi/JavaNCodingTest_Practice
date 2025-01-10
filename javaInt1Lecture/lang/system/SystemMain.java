package javaInt1Lecture.lang.system;

import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current time: " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("Current time nanos: " + currentTimeNano);

        // 환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());
    }
}
