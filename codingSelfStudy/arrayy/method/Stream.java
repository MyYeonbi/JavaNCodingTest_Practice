package codingSelfStudy.arrayy.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    /* Arrays.stream(B)
     * 1. 무엇을 하나 - 배열 B를 스트림으로 변환. Stream은 "연속된 데이터 흐름을 다룰 수 있는 기능"을 제공.
     * 2. 유의점 : int[]을 Stream<int[]>가 아니라 IntStream으로 변환함. 즉, 기본형 int에 특화된 IntStream 제공.
     * */
    public static void main(String[] args) {

        // 일반적인 for문 형식 - 하나씩 반복하면서 처리해야 하고, result 리스트를 따로 관리해야 함.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = new ArrayList<>();

        for (int num : list) {
            result.add(num * 2); // 각 요소를 2배로 변환
        }
        System.out.println(result);
    }
}