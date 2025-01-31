package codingSelfStudy.arrayy;

import java.util.*;
/* int배열 2개가 매개변수로 주어졌을때, 각 요소에서 한개씩 뽑아 서로 곱한 값을 총합 하였을때 최소값이 되게 해라.*/

public class MinValueMultiplication {
    public int solution(int[]A , int[]B) {
        //1.A를 오름차순 정렬
        Arrays.sort(A);

        //2. B를 내림차순으로 정렬하기 위해 Integer 배열로 변환.
        Integer [] BInteger = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(BInteger, Collections.reverseOrder());

        //3. A와 B를 곱한 값을 누적하여 합산
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * BInteger[i];
        }

        return sum;

    }
}
