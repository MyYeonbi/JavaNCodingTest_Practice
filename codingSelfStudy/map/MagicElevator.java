package codingSelfStudy.map;

class MagicElevator {
  public int solution(int storey) {
    int answer = 0;

    while (storey > 0) {
      int digit = storey % 10;
      storey /= 10;

      // 현재 자릿수가 5보다 큰 경우 올림 처리
      if (digit > 5) {
        answer += 10 - digit;
        storey++;
      }
      // 현재 자릿수가 5인 경우 다음 자릿수를 확인하여 올림 처리
      else if (digit == 5) {
        if (storey % 10 >= 5) {
          answer += 10 - digit;
          storey++;
        } else {
          answer += digit;
        }
      }
      // 현재 자릿수가 5보다 작은 경우 그대로 처리
      else {
        answer += digit;
      }
    }

    return answer;
  }
}