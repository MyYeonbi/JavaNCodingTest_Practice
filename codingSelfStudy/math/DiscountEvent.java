package codingSelfStudy.math;

import java.util.HashMap;
import java.util.Map;

class DiscountEvent {
  public int solution(String[] want, int[] number, String[] discount) {
    // 원하는 제품과 수량을 저장할 Map
    Map<String, Integer> wantMap = new HashMap<>();
    for (int i = 0; i < want.length; i++) {
      wantMap.put(want[i], number[i]);
    }

    int answer = 0;

    // 슬라이딩 윈도우를 사용하여 10일 동안의 구매 내역 확인
    for (int i = 0; i <= discount.length - 10; i++) {
      Map<String, Integer> discountMap = new HashMap<>();

      // 10일 동안의 구매 내역을 Map에 저장
      for (int j = i; j < i + 10; j++) {
        discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
      }

      // 원하는 제품과 수량이 모두 포함되는지 확인
      if (wantMap.equals(discountMap)) {
        answer++;
      }
    }

    return answer;
  }
}