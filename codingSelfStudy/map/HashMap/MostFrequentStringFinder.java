package codingSelfStudy.map.HashMap;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentStringFinder {

    public static String solution(String[] strings) {
        // Map을 사용하여 문자열과 빈도를 저장
        Map<String, Integer> frequencyMap = new HashMap<>();

        String mostFrequent = ""; // 가장 많이 등장한 문자열
        int maxFrequency = 0; // 최대 빈도

        for (String str : strings) {
            // 빈도를 Map에 추가하거나 증가
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0)+1);

            // 빈도가 더 높거나, 동일한 빈도에서 처음 등장한 문자열인 경우 갱신
            if (frequencyMap.get(str) > maxFrequency ||
                    (frequencyMap.get(str) == maxFrequency && mostFrequent.isEmpty())) {
                mostFrequent = str;
                maxFrequency = frequencyMap.get(str);
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        String[] tc1 = {"apple", "banana", "strawberry", "cherry", "grape", "apple", "apple"};
        String[] tc2 = {"연", "시", "수", "태", "규", "시", "태"};

        System.out.println(solution(tc1)); // apple
        System.out.println(solution(tc2)); // 시

    }


}
