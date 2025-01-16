package javaInt1Lecture.time;
import java.time.LocalDateTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
   LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜시간 : " + nowDt);


    }
}
