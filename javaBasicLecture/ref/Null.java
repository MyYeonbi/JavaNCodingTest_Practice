package javaBasicLecture.ref;

public class Null {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); //null 출력

        data = new Data();
        System.out.println("2. data = " + data); // 객체의 참조 정보 출력

        data = null;
        System.out.println("3. data = " + data); // 다시 null 출력
    }
}
