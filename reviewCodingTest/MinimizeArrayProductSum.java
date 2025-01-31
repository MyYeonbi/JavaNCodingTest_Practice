package reviewCodingTest;

import java.util.Arrays;
import java.util.Collections;
/* 두개의 int 배열을 각각 쌍으로 곱하여 모두 더한 값이 최소가 되게 하는 문제*/
public class MinimizeArrayProductSum {
    public int solution (int[]A, int[]B) {
        //1. A를 오름차순으로 정렬
        Arrays.sort(A);

        //2. B를 내림차순으로 정렬
        Integer[] BInteger = Arrays.stream(B).boxed().toArray(Integer[] :: new);
        Arrays.sort(BInteger,Collections.reverseOrder());
    }
}
