package division;

public class GcdLcm {
    public int solution(int n) {
        int gcd = gcd(6,n); //최대공약수 구하기
        int lcm = (6*n)/gcd; //최소공배수 구하기
        return lcm / 6; // 최소공배수를 6으로 나눈 값 = 필요한 피자 판수
    }

    //유클리드 호제법으로 최대공약수 구하기
    public int gcd(int a, int b) {
        if (b == 0 ) return a;
        return gcd(b, a % b);
    }
}
 class Main {
    public static void main(String[] args) {
        GcdLcm sol = new GcdLcm();

        // 테스트 케이스 실행
        int[] testCases = {6, 10, 4, 12, 8}; // 테스트할 n 값들

        System.out.println("테스트 케이스 결과:");
        System.out.println("-----------------------------");
        for (int n : testCases) {
            int result = sol.solution(n); //solurion 함수 실행
            System.out.println("입력: " + n + " -> 필요한 피자 판 수: " + result);
        }

    }
}
