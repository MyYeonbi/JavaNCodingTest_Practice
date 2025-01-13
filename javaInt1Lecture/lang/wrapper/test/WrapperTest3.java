package javaInt1Lecture.lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        /*Integer.valueOf()와 Integer.parseInt()는 둘 다 문자열을 숫자로 변환하는 데 사용되지만,
        반환 타입과 사용 목적이 다르다.
        1. 공통점 :
        •	둘 다 문자열에 포함된 숫자 데이터를 정수(int)로 변환할 때 사용된다.
	    •	문자열이 숫자가 아닌 경우, 둘 다 NumberFormatException을 던진다.

	    2. 차이점 :
	    Integer.valueOf() : 문자열을 Integer 객체로 변환
	    Integer.parseInt() : 문자열을 기본형 int로 변환

        */

        //Integer -> int
        int intValue = integer1.intValue();
        System.out.println("inValue = " + intValue);
        //int -> Integer
        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);
    }
}
