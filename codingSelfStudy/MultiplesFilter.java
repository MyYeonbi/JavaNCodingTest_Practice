package codingSelfStudy;

import java.util.ArrayList;
import java.util.List;

class MultiplesFilter {
    public int[] solution(int n, int k) {
        List<Integer> multiples = new ArrayList<>();

        // n의 배수 중에서 k 이하인 숫자를 찾음
        for (int i = n; i <= k; i += n) {
            multiples.add(i);
        }

        // 리스트를 배열로 변환하여 반환
        return multiples.stream().mapToInt(Integer::intValue).toArray();
    }

    // 실행 테스트용 main 메서드
    public static void main(String[] args) {
        MultiplesFilter filter = new MultiplesFilter();

        // 테스트 케이스 1
        int n1 = 3, k1 = 10;
        int[] result1 = filter.solution(n1, k1);
        System.out.println(java.util.Arrays.toString(result1)); // 예상 출력: [3, 6, 9]

        // 테스트 케이스 2
        int n2 = 5, k2 = 20;
        int[] result2 = filter.solution(n2, k2);
        System.out.println(java.util.Arrays.toString(result2)); // 예상 출력: [5, 10, 15, 20]

        // 테스트 케이스 3
        int n3 = 7, k3 = 30;
        int[] result3 = filter.solution(n3, k3);
        System.out.println(java.util.Arrays.toString(result3)); // 예상 출력: [7, 14, 21, 28]
    }
}