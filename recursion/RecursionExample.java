package recursion;

public class RecursionExample {
    public static void printNumbers(int n) {
        if (n == 0) { // 종료 조건 : n이 0이면 멈춤
            return;
        }
        printNumbers(n - 1); // n보다 작은 숫자를 출력(작은 문제로 쪼개기)
        System.out.println(n); //숫자 출력
    }

    public static void main(String[] args) {
        printNumbers(5); // 1,2,3,4 5 출력}
    }
}
