package codingStudy;

import java.util.*;

class MineralMining {
  public int solution(int[] picks, String[] minerals) {
    int answer = 0;
    int[][] fatigue = {
        {1, 1, 1},    // 다이아몬드 곡괭이
        {5, 1, 1},    // 철 곡괭이
        {25, 5, 1}    // 돌 곡괭이
    };

    // 광물을 5개씩 그룹화
    List<int[]> mineralGroups = new ArrayList<>();
    for (int i = 0; i < minerals.length; i += 5) {
      int[] counts = new int[3]; // 다이아, 철, 돌 개수
      for (int j = i; j < Math.min(i + 5, minerals.length); j++) {
        switch (minerals[j]) {
          case "diamond": counts[0]++; break;
          case "iron": counts[1]++; break;
          case "stone": counts[2]++; break;
        }
      }
      mineralGroups.add(counts);
    }

    // 광물 그룹을 피로도가 높은 순으로 정렬
    Collections.sort(mineralGroups, (a, b) -> {
      int aSum = a[0]*25 + a[1]*5 + a[2];
      int bSum = b[0]*25 + b[1]*5 + b[2];
      return bSum - aSum;
    });

    // 곡괭이 사용
    for (int[] group : mineralGroups) {
      if (picks[0] > 0) { // 다이아몬드 곡괭이 사용
        answer += group[0] + group[1] + group[2];
        picks[0]--;
      } else if (picks[1] > 0) { // 철 곡괭이 사용
        answer += group[0]*5 + group[1] + group[2];
        picks[1]--;
      } else if (picks[2] > 0) { // 돌 곡괭이 사용
        answer += group[0]*25 + group[1]*5 + group[2];
        picks[2]--;
      } else { // 곡괭이가 없으면 종료
        break;
      }
    }

    return answer;
  }
}
