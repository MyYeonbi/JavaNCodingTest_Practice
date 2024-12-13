package javaBasicLecture.ref;

public class DataExample {
    int value; // 데이터 저장

    // 데이터를 출력하는 메서드
    void printValue() {
        System.out.println("Value 값은 : " + value);
    }

    //데이터를 두 배로 만드는 메서드
    void doubleValue() {
        value = value * 2;
    }
}
