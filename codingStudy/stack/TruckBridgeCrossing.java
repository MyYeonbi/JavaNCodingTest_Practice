package codingStudy.stack;

import java.util.Queue;
import java.util.LinkedList;

class TruckBridgeCrossing {
  public int solution(int bridge_length, int weight, int[] truck_weights) {
    Queue<Integer> bridge = new LinkedList<>();
    int time = 0;
    int currentWeight = 0;
    int truckIndex = 0;

    // 다리 초기 상태 (0으로 채움)
    for (int i = 0; i < bridge_length; i++) {
      bridge.offer(0);
    }

    while (truckIndex < truck_weights.length) {
      time++;
      // 다리에서 트럭 제거
      currentWeight -= bridge.poll();

      // 새 트럭 추가 가능 여부 확인
      if (currentWeight + truck_weights[truckIndex] <= weight) {
        bridge.offer(truck_weights[truckIndex]);
        currentWeight += truck_weights[truckIndex];
        truckIndex++;
      } else {
        bridge.offer(0);
      }
    }

    // 마지막 트럭이 다리를 완전히 건너는 시간 추가
    return time + bridge_length;
  }
}
