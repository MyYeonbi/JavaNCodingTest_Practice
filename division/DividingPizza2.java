package division;

public class DividingPizza2 {
    public int solution(int slice, int n) {
        if (slice < 2 || slice > 10) {
            throw new IllegalArgumentException("slice는 2 이상 10 이하의 값이어야 한다.");
        }
        return (n + slice -1)/ slice;
    }
    public static void main(String[] args) {
        DividingPizza2 dp = new DividingPizza2();
        System.out.println(dp.solution(20,10));
        System.out.println(dp.solution(4,12));
    }
}
