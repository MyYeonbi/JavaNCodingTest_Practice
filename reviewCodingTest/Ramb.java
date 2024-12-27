package reviewCodingTest;

public class Ramb {
    public int solution (int n, int k) {
        int totalPrice = n * 12000 + k * 2000;
        int freeDrinks = n / 10;
        int discount = freeDrinks * 2000;

        return totalPrice - discount;
    }

    public static void main (String[] args) {
        Ramb r = new Ramb();
        System.out.println(r.solution(40, 3));
    }
}
