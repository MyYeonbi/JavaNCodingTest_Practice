package codingSelfStudy.integger;

import java.util.Arrays;
import java.util.Collections;

public class MinimizeArrayProductSum {
    public int solution(int[] A, int[] B) {
        // 배열 A를 오름차순 정렬
        Arrays.sort(A);

        // 배열 B를 내림차순으로 정렬
        Integer[] BInteger = Arrays.stream(B).boxed().toArray(Integer[] :: new);
        /*
        1) 왜 내림차순으로 정렬을 위해 기본 자료형을 객체 타입 배열인 Integer[]로 변환해야 하냐면
        Collections.reverseOrder()를 사용하기 위함이다. 

        3) .toArray(Integer[] :: new )는 자바에서 stream을 사용하여 배열로 변환할 때 사용하는 방식이다.
        * */
        Arrays.sort(BInteger, Collections.reverseOrder());

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            //A의 작은 값 * B의 큰 값
            answer += A[i] * BInteger[i];
        }
        return answer;
    }
}
