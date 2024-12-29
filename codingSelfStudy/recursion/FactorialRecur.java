package codingSelfStudy.recursion;

public class FactorialRecur {

    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number + "의 팩토리얼 값은 : " + factorial(number));
    }
}
