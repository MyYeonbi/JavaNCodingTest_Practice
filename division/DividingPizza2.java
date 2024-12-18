package division;

public class DividingPizza2 {
    public int solution(int slice, int n) {
        return (n + slice -1)/ slice;
    }
    public static void main(String[] args) {
        DividingPizza2 dp = new DividingPizza2();
        System.out.println(dp.solution(7,10));
        System.out.println(dp.solution(4,12));
    }
}
