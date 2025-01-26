package codingStudy.array.frequecy;

import java.util.Arrays;

public class FrequencyAnalyzer1 {
    *//*2중 for문을 사용하여 배열에서의 최대 빈도의 요소와 그 빈도수를 찾는 문제*//*
    public static void main(String[] args) {
        int[] tc1 = new int[]{1, 2, 3, 2, 2, 4, 5, 2, 6, 4};
        int[] tc2 = new int[]{1, 2, 3, 4, 5};
        int[] tc3 = new int[]{1, 2, 2, 3, 3};

        System.out.println(Arrays.toString(solution(tc1))); // [2, 4]
        System.out.println(Arrays.toString(solution(tc2))); // [1, 1]
        System.out.println(Arrays.toString(solution(tc3))); // [2, 2]
    }
    public static int[] solution(int[] arr ){
        int maxCount = 0; // 최대 등장 횟수
        int minNumber = Integer.MAX_VALUE; // 최대 등장 횟수의 숫자 중 가장 작은 값

        // 배열 순회.
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }



    }

}
