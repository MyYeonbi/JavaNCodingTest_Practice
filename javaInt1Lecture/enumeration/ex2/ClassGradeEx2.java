package javaInt1Lecture.enumeration.ex2;

public class ClassGradeEx2 {
    public static void main(String[] args) {
        int price = 10000;

/*	•	문제: ClassGrade 객체는 상수(BASIC, GOLD, DIAMOND)로 선언되어 있어야만 의도한 대로 동작합니다. 그러나 위 코드처럼 new ClassGrade()로 새 객체를 생성하면, 이 객체는 BASIC, GOLD, DIAMOND 중 어느 것도 아닌 새로운 객체가 됩니다.
	•	결과: DiscountService의 discount 메서드에서 할인X가 출력되고, 할인 금액이 계산되지 않습니다.
*/
        DiscountService discountService = new DiscountService();


    }
}
