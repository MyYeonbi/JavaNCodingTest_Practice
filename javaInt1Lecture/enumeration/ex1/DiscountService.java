package javaInt1Lecture.enumeration.ex1;

public class DiscountService {


    // 오타나 설정하지 않은 등급을 입력하는 경우를 막는 경우는 인수에 String으로 된 것을 다른 타입으로 바꾸는 것이다.
    public int discount (String grade, int price){
        int discountPercent = 0;

        // 등급별로 할인액을 적용하는 if문에 새로 만든 클래스의 필드로 바꿔준다.
        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)){
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)){
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        // 10000 * (20 / 100) -> 2000원
        // 가격 * 할인율 / 100을 계산하면 할인 금액을 구할 수 있다.
        return price * discountPercent / 100;
    }
}
