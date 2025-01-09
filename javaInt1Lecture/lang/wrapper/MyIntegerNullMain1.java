package javaInt1Lecture.lang.wrapper;

public class MyIntegerNullMain1 {
    // 디버깅 해결완료_ 이슈란에 해결과정 정리
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1),new MyInteger(0),new MyInteger(1)};
        System.out.println(findValue(intArr, -1)); // -1;
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); 

    }
    private static Integer findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger.getValue();
            }
        }
        return null;
    }
}
/* 기본형은 항상 값이 존재해야 한다. 숫자의 경우 0,-1 같은 값이라도 항상 존재해야 한다.
반면에 객체인 참조형은 값이 없다는 null을 사용할 수 있다.
물론 null값을 반환하는 경우 잘못하면 NullPointerException이 발생할 수 있기 때문에 주의해야 한다.
*
* */