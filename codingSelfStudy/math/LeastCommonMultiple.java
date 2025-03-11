package codingSelfStudy.math;

import java.util.*;

class LeastCommonMultiple {
  // 최대공약수(GCD) 계산 (유클리드 호제법)
  public int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  // 최소공배수(LCM) 계산
  public int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  public int solution(int[] arr) {
    int answer = arr[0]; // 첫 번째 숫자로 초기화
    for (int i = 1; i < arr.length; i++) {
      answer = lcm(answer, arr[i]); // 배열의 모든 숫자에 대해 LCM 반복 계산
    }
    return answer;
  }
}