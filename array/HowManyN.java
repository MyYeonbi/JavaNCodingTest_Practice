package array;

public class HowManyN {
    public int solution(int[] array, int n) {
        int count = 0; // n의 개수를 저장할 변수
        for (int num : array) { // 배열의 각 요소를 순회
            if (num == n) { // 배열의 요소가 n과 같은지 확인
                count ++; // 같다면 count 증가
            }
        }
        return count; // n의 개수를 반환
    }
    public static void main(String[] args) {
        HowManyN hm = new HowManyN();
        System.out.println(hm.solution(new int[]{1, 2, 3,3,3, 4, 5}, 3));
    }
}
