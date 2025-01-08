package javaInt1Lecture.lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        //int, double, boolean은 기본형
        // String은 참조형이다. 그래서 객체 생성이 가능하다.
        String str1  = "hello";
        String str2 = new String("hello");
        /* String은 클래스이다. 그리고 참조형이다.
        따라서 str1 변수에는 String 인스턴스의 참조형만 들어갈 수 있다.
        편의상 쌍따옴표로 문자열을 감싸면 자바는 'new String("hello")'와 같이 변경해준다.

         */

        System.out.println(str1 == str2);
    }
}
