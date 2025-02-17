package codingSelfStudy.math;

public class SmallestDivisorWithRemainderOne {

    public int solution(int n) {
        for (int x = 2; x < n; x++) {
            //x는 2부터 시작하여 n-1까지 탐색
            if ( n % x == 1) {
                //n을 x로 나눈 나머지가 1이면
                return x; // 해당 x 반환
            }

        }
        return -1; // 일반적으로 실행되지 않는 코드 (문제 조건상 답이 항상 존재)
    }
    public static void main(String[] args) {
        SmallestDivisorWithRemainderOne sol = new SmallestDivisorWithRemainderOne();
        System.out.println(sol.solution(10)); //예시 : 10을 입력하면 3이 출력됨.
    }
}
