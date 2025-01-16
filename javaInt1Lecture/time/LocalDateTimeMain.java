package javaInt1Lecture.time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
   LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜시간 : " + nowDt);
        System.out.println("지정 날짜시간 : " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("--  localDate : " + localDate);
        System.out.println("localTime : " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime : " + localDateTime);

         //계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜시간 +1000 : " + ofDtPlus);


    }
}
