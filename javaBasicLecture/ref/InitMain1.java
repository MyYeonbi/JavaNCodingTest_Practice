package javaBasicLecture.ref;

public class InitMain1 {public static void main(String[] args) {
    int localVar; // 초기화하지 않음
    // System.out.println(localVar); // 컴파일 에러 발생
    localVar = 5; // 초기화
    System.out.println(localVar); // 정상 출력: 5
}
}
