package javaBasicLecture.ref;

public class DataExampleMain {
    public static void main(String[] args) {
        DataExample data = new DataExample();
        data.value = 10; // 필드에 값 저장
        data.printValue(); // 출력: Value: 10
        data.doubleValue(); // 값 두 배로 증가
        data.printValue(); // 출력 : Value:20

    }
}
