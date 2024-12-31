package basic;

public class Discount1 {
    public int solution(int price) {
        if (price >= 500000) { //50만원 이상일 때
            price *= 0.8; //20% 할인
        } else if (price >= 300000){ //30만원 이상일 때
            price *= 0.9; // 10% 할인
        } else if (price >= 100000){ //10만원 이상일 떄
            price *= 0.95; //5% 할인
        }
        return (int)price; // 소수점 이하를 버리고 정수로 변환
    }
    public static void main(String[] args) {
        Discount1 discount1 = new Discount1();
        System.out.println(discount1.solution(450000));
    }
}
