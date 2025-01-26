package codingStudy.array.frequecy;

import java.util.*;

public class MapEntryExample {
    public static void main(String[] args) {
        // HashMap 생성
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        frequencyMap.put(1, 2); // 숫자 1이 2번 나옴
        frequencyMap.put(2, 4); // 숫자 2가 4번 나옴
        frequencyMap.put(3, 1); // 숫자 3이 1번 나옴

        // entrySet()으로 HashMap의 키-값 쌍 순회
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();       // 숫자
            int frequency = entry.getValue(); // 등장 횟수
            System.out.println("숫자: " + number + ", 등장 횟수: " + frequency);
        }
    }
}
