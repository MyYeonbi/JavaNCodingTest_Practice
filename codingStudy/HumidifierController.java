package codingStudy;

public class HumidifierController {
  public int solution(String mode_type, int humidity, int val_set) {
    if (mode_type.equals("auto")) {
      if (humidity < 10) return 5;
      else if (humidity < 20) return 4;
      else if (humidity < 30) return 3;
      else if (humidity < 40) return 2;
      else if (humidity < 50) return 1;
      else return 0;
    } else if (mode_type.equals("target")) {
      if (humidity < val_set) return 3;
      else return 1;
    } else if (mode_type.equals("minimum")) {
      if (humidity < val_set) return 1;
      else return 0;
    } else {
      // 예외 처리: 모드 타입이 유효하지 않을 경우 -1 반환 (선택사항)
      return -1;
    }
  }

}
