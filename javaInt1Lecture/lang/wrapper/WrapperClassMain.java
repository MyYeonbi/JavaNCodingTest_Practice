package javaInt1Lecture.lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        // /*빨간 경고 메시지가 뜨는 이유는,
        //        * 미래에 삭제 예정, 대신에 valueOf()를 사용 */
        System.out.println("newInteger = " + newInteger);

        Integer integerObj = Integer.valueOf(10);//

        Long longObj = Long.valueOf(100); //기본형 long 값을 래퍼 클래스 Long의 객체로 변환하는 코드
        //
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("---- 비교 ----");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: "+ (newInteger.equals(integerObj)));


    }
}
