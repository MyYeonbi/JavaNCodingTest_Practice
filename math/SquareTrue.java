package math;

public class SquareTrue {
    public int solution(int n) {
        //n의 제곱근을 구한다.
        double sqrt = Math.sqrt(n);

        if (sqrt == (int)sqrt) {
            return 1; //제곱수라면 1반환
        } else {
            return 2; //제곱수가 아니면 2 반환
        }
    }

    public static void main(String[] args) {
        SquareTrue s = new SquareTrue();
        System.out.println(s.solution(25));
        System.out.println(s.solution(15));
    }
}
