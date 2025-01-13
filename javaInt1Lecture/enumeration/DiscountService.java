package javaInt1Lecture.enumeration;

public class DiscountService {

    public int discount (String grade, int price){
        int discountPercent = 0;

        if (grade.equals("BASIC")) {
            discountPercent = 10;
        } else if (grade.equals("GOLD")){
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")){
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        // 10000 * (20 / 100) -> 2000원
        // 가격 * 할인율 / 100을 계산하면 할인 금액을 구할 수 있다. 
        return price * discountPercent / 100;
    }
}
