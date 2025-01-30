package codingSelfStudy.arrayy;

import java.util.*;

public class MinValueMultiplication2 {
    public int solution(int[]A, int[]B) {
        Arrays.sort(A); // 오름차순으로 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int b : B) {
            pq.add(b);
        }

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * pq.poll(); // 가장 큰 값과 곱함
        }
        return sum;
    }
}
