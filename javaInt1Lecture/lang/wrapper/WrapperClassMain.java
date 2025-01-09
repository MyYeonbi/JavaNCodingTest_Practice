package javaInt1Lecture.lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        // /*빨간 경고 메시지가 뜨는 이유는,
        //        * 미래에 삭제 예정, 대신에 valueOf()를 사용 */
        System.out.println("newInteger = " + newInteger);

        Integer integerObj = Integer.valueOf(10);//-128 ~ 127 자주 사용하는 숫자 값 재사용. 불변


    }
}
