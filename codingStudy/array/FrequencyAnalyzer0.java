package codingStudy.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalyzer0 {
    public static void main(String[] args) {
        int[] tc1 = new int[]{1, 2, 3, 2, 2, 4, 5, 2, 6, 4};
        int[] tc2 = new int[]{1, 2, 3, 4, 5};
        int[] tc3 = new int[]{1, 2, 2, 3, 3};

        System.out.println(Arrays.toString(solution(tc1))); // [2, 4]
        System.out.println(Arrays.toString(solution(tc2))); // [1, 1]
        System.out.println(Arrays.toString(solution(tc3))); // [2, 2]
    }

    public static int[] solution(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 배열의 각 요소의 빈도를 계산
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 가장 높은 빈도와 해당 숫자를 찾기
        int maxFrequency = 0;
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            /* frequencyMap.entrySet이란?
            * frequencyMap은 숫자(key)와 그 등장 횟수(value)를 저장한 HashMap이다.
            * entrySet()은 HashMap의 모든 키- 값 쌍을 가져온다.
            * 이 키- 값 쌍은 Map.Entry 객체로 표현된다.
            * 예를들어, frequencyMap이 {1=2, 2=4, 3=1}이라면 :
            * entrySet()은 [Map.Entry(1,2), Map.Entry(2,4), Map.Entry(3,1)]를 반환.
            * */

        }
    }
}
