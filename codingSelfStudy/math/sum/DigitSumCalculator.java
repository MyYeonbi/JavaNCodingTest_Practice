package codingSelfStudy.math.sum;

public class DigitSumCalculator {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(" 각 자리 숫자의 합: " + solution(n));
    }

    public static int solution(int n) {
        int sum = 0; // 합계를 저장할 변수

        while (n > 0) { //n이 0보다 클 때만 반복
            sum += n %10; // 마지막 자리 숫자를 sum에 더함
            n /= 10; // 마지막 자리 숫자를 제s
        }

        return sum;
    }
}
