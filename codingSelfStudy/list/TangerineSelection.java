package codingSelfStudy.list;

import java.util.*;

class TangerineSelection {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // 귤 크기별 개수 세기
        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }

        // 개수를 내림차순으로 정렬
        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort(Collections.reverseOrder());

        int kindCount = 0;
        int sum = 0;

        // 개수가 많은 종류부터 선택하여 k개 이상이 되도록 한다.
        for (int count : counts) {
            sum += count;
            kindCount++;
            if (sum >= k) break;
        }

        return kindCount;
    }
}