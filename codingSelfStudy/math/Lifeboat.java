package codingSelfStudy.math;

import java.util.Arrays;
/*사람들의 몸무게와 구명보트의 최대 무게 제한이 주어졌을 때, 모든 사람을 구출하기 위해 필요한 최소한의 구명보트 수를 구하는 문제*/

class Lifeboat {
  public int solution(int[] people, int limit) {
    // 사람들의 몸무게를 오름차순으로 정렬
    Arrays.sort(people);

    int left = 0; // 가장 가벼운 사람을 가리키는 포인터
    int right = people.length - 1; // 가장 무거운 사람을 가리키는 포인터
    int boats = 0; // 필요한 구명보트 수

    while (left <= right) {
      // 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있는 경우
      if (people[left] + people[right] <= limit) {
        left++; // 가장 가벼운 사람을 다음으로 이동
      }
      right--; // 가장 무거운 사람을 보트에 태움
      boats++; // 보트 수 증가
    }

    return boats;
  }
}