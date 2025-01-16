package javaInt1Lecture.time;

import java.time.LocalDate;

public class LocalDateTime {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);

        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변)
        ofDate.plusDays(10);
        System.out.println("지정 날짜 +10d = "+ofDate);

    }
}
