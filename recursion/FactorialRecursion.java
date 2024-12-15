package recursion;

public class FactorialRecursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {//종료 조건
            return 1;
        }
        return n * factorial(n - 1); // 작은 문제로 쪼개기
    }
    public static void main(String[] args) {
        int result = factorial(5); //5! == 120
        System.out.println("5! ="+ result);
    }
}
