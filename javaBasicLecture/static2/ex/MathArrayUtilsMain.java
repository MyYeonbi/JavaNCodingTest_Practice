package javaBasicLecture.static2.ex;

import static javaBasicLecture.static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    /*
    sum(int[] array) : 배열의 모든 요소를 더하여 합계를 반환한다.
    average(int[] array) : 배열의 모든 요소의 평균값을 계산한다.
    min(int[] array) : 배열에서 최소값을 찾는다.
    max(int[] array) : 배열에서 최대값을 찾는다.

    <요구사항>
    1. MathArrayUtils은 객체를 생성하지 않고 사용해야 한다.
    누군가 실수로 MathArrayUtils의 인스턴스를 생성하지 못하게 막아라
    2. 실행 코드에 static import를 사용해도 된다.
     */
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("sum= " + MathArrayUtils.sum(values));
        System.out.println("average= " + MathArrayUtils.average(values));
        System.out.println("min= " + MathArrayUtils.min(values));
        System.out.println("max= " + MathArrayUtils.max(values));
    }
}
