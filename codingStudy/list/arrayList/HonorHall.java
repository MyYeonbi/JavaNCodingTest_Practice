package codingStudy.list.arrayList;

import java.util.*;
public class HonorHall {
  public int[] solution(int k, int[] score){
    List<Integer> list = new ArrayList<>();
    int[] answer = new int[score.length]; // 결과 배열 선언

    for (int i = 0; i < score.length; i++) {
      list.add(score[i]); //오늘 점수 추가
      Collections.sort(list, Collections.reverseOrder()); //내림차순 정렬

      if (list.size() > k) {
        list.remove(list.size()-1);//k명 초과시 가장 낮은 점수 제거
      }

      answer[i] = list.get(list.size()-1); // 현재 명예의 전당 최하위 점수 저장
    }

    return answer; //리턴 빠뜨리면 컴파일 에러. 
  }

}
