package basic;
import java.util.ArrayList;
import java.util.List;


public class oddNumber {
    public static int[] solution(int n) {
        // Step 1: 리스트를 활용해 홀수를 저장 (배열 크기 계산 불필요)
        List<Integer> oddNumbers = new ArrayList<>();

        // Step 2: 1부터 n까지 순회하며 홀수인지 확인
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // 홀수 조건
                oddNumbers.add(i);
            }
        }

        // Step 3: 리스트를 배열로 변환
        int[] answer = new int[oddNumbers.size()];
        for (int i = 0; i < oddNumbers.size(); i++) {
            answer[i] = oddNumbers.get(i);
        }

        return answer;
    }

    // 테스트 메인 메서드
    public static void main(String[] args) {
        int n = 10; // 테스트용 n 값
        int[] result = solution(n);

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
