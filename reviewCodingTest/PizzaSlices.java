package reviewCodingTest;

public class PizzaSlices {
    public static int solution(int slice, int n) {
        return (n + slice -1) / slice;
    }
    public static void main(String[] args) {
        System.out.println(solution(3, 10));
        System.out.println(solution(4, 12));
    }
}
