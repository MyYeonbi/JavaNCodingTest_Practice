package codingSelfStudy.division;

public class FindSmallestDivisor {
    public int solution(int n) {
        // x는 1부터 시작하여 n을 x로 나눈 나머지가 1인 경우를 찾는다.
        for (int x = 2; x < n ; x++) {
            if(n % x == 1) {
                return x; // 조건을 만족하는 x를 반환한다.
            }
        }
        return -1; // 답이 항상 존재하므로 이 코드는 실행되지 않는다.
    }
    public static void main(String[] args) {
        System.out.println(new FindSmallestDivisor().solution(7));
    }
}
