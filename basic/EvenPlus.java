package basic;

public class EvenPlus {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
    return answer;
    }
    public static void main(String[] args) {
        EvenPlus evenPlus = new EvenPlus();
        int n = 10;
        System.out.println(evenPlus.solution(n));
    }
}
