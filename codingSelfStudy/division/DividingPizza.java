package codingSelfStudy.division;

public class DividingPizza {
    public int solution(int n) {
        return (n+6) / 7;
    }

    public static void main(String[] args) {
        int num = 13;
        DividingPizza dp = new DividingPizza();
        System.out.println(dp.solution(num));
    }
}
