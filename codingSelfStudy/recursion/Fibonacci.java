package codingSelfStudy.recursion;

public class Fibonacci {
    public  int count = 0;
    public int solution(int n) {
        if(n <=1) return n;

        count++;
        return solution(n-1) + solution(n-2);
    }

    public static void main(String[] args) {
        int num = 20;

        Fibonacci fibo = new Fibonacci();

        System.out.println(fibo.solution(num));
        System.out.println("총 재귀 몇 번 : " + fibo.count);
    }
}
