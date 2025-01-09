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
