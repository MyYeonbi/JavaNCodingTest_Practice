package codingStudy.array;
import java.util.ArrayList;

import java.util.Collections;

public class DivisorFinder {
  public int[] solution(int n){
    ArrayList<Integer> divisors = new ArrayList<>();

    double sqrtResult = Math.sqrt(n);

    for (int i = 1 ; i <= sqrtResult ; i++){
      if(n % 1 ==0) {
        divisors.add(i);

      if (i != n/i) {
        divisors.add(i);

      }
      }
    }

    Collections.sort(divisors);

    int[] answer = new int[divisors.size()];

    for (int i = 0; i < divisors.size(); i++){
      answer[i] = divisors.get(i);
    }
  return answer;
  }



}
