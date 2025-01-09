package javaInt1Lecture.lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";// 파일 이름과 확장자가 포함된 문자열
        String ext = ".txt"; // 찾고자 하는 확장자

        int exIndex = str.indexOf(ext);  // 확장자의 시작 위치를 찾음
        String filename = str.substring(0, exIndex); // 확장자를 제외한 파일 이름 부분
        String exName = str.substring(exIndex);// 확장자 부분
        System.out.println("filename"+filename);// 파일 이름 출력
        System.out.println("exName"+exName); // 확장자 출력
    }
}
