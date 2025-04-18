package codingStudy.maratonCom;

import java.util.HashMap;

public class MarathonHashMap {
  public String solution(String[] participant, String[] completion) {
    HashMap<String, Integer> map = new HashMap<>();

    // 참가자 명단 카운트
    for (String name : participant) {
      map.put(name, map.getOrDefault(name, 0)+1);
    }

    // 완주자 명단 카운트 차감
    for (String name : completion){
      map.put(name, map.get(name)-1);
    }

    // value가 1인 사람 = 완주 못한 사람
    for (String key : map.keySet()){
      if (map.get(key) == 1) {
        return key;
      }
    }
    return "";
  }

}
