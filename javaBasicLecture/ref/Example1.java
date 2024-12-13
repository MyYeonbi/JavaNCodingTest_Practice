package javaBasicLecture.ref;

public class Example1 {  public static void main(String[] args) {
    int a = 10; // 기본형 변수 a
    modifyValue(a);
    System.out.println(a); // a는 여전히 10
}

    public static void modifyValue(int x) {
        x = 20; // 복사된 변수 x의 값만 변경됨
    }
}
