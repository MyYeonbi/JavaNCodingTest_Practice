package codingSelfStudy.math;

public class MultipleChecker {
    public int solution(int num, int n) {
        return (num % n == 0) ? 1:0;
    }

    public static void main(String[] args) {
        MultipleChecker checker = new MultipleChecker();
        System.out.println(checker.solution(3, 3));
    }
}
