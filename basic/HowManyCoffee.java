package basic;

import java.util.Arrays;

public class HowManyCoffee {
    public int[] solution (int money) {
        int pricePerCup = 5500;
        int cups = money / pricePerCup;
        int remainingMoney = money % pricePerCup;
        return new int[] {cups, remainingMoney};
    }

    public static void main(String[] args) {
        HowManyCoffee how = new HowManyCoffee();
        System.out.println(Arrays.toString(how.solution(55000)));
    }
}
