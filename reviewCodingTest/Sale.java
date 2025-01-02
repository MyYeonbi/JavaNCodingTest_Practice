package reviewCodingTest;

public class Sale {
    public int solution(int price) {
        if (price >= 500000) {
            return (int)(price * 0.80); // 50만 원 이상일 경우 20% 할인
        } else if (price >= 300000) {
            return (int)(price * 0.90); // 30만 원 이상일 경우 10% 할인
        } else if (price >= 100000) {
            return (int)(price * 0.95); // 10만 원 이상일 경우 5% 할인
        }
        return price; // 할인 조건에 해당하지 않으면 원래 가격 반환
    }

    public static void main(String[] args) {
        Sale sale = new Sale();
        System.out.println(sale.solution(550000));
    }
}
