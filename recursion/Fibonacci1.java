package recursion;

public class Fibonacci1 {
 public static int count = 0;

    public static int solution(int n) {
        if(n <=1) return n;
        count++;
        return solution(n-1) + solution(n-2);
    }

    public static void main(String[] args) {
        int num = 20;



        System.out.println(new Fibonacci1().solution(num));
        System.out.println("총 재귀 몇 번 : " + count);
    }
}
