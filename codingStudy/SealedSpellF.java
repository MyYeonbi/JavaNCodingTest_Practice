package codingStudy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SealedSpellF {
  static final int MAX_LEN = 11;
  static long[] pow26 = new long[MAX_LEN + 1];
  static Set<String> banSet;
  static Map<String, Integer> banPrefixCountMap = new HashMap<>();

  public String solution(long n, String[] bans) {
    // 1. pow26[i] = 26^i 미리 계산
    pow26[0] = 1;
    for (int i = 1; i <= MAX_LEN; i++) {
      pow26[i] = pow26[i - 1] * 26;
    }

    // 2. bans를 Set에 저장하고 prefix별 개수 세기
    banSet = new HashSet<>(Arrays.asList(bans));
    for (String ban : bans) {
      for (int i = 1; i <= ban.length(); i++) {
        String prefix = ban.substring(0, i);
        banPrefixCountMap.put(prefix, banPrefixCountMap.getOrDefault(prefix, 0) + 1);
      }
    }

    // 3. DFS로 prefix 붙여가며 n번째 문자열 찾기
    return findNthValidString("", n);
  }

  private String findNthValidString(String prefix, long n) {
    for (char c = 'a'; c <= 'z'; c++) {
      String next = prefix + c;
      long total = countValid(next);

      if (n <= total) {
        // 이 분기에서 n번째 문자열이 존재
        if (banSet.contains(next)) {
          // 정확히 이 문자열이 ban된 경우, 무시하고 다음 문자열로 이동
          n--;
        } else if (n == 1) {
          return next;
        } else {
          return findNthValidString(next, n - 1);
        }
      } else {
        // 이 prefix로 시작하는 유효 문자열 전체 건너뜀
        n -= total;
      }
    }
    return null; // 절대 도달하지 않음 (문제 보장)
  }

  private long countValid(String prefix) {
    int len = prefix.length();
    if (len > MAX_LEN) return 0;

    long total = 0;
    for (int i = 0; i <= MAX_LEN - len; i++) {
      total += pow26[i];
    }

    // 제외할 문자열 수 빼기
    return total - banPrefixCountMap.getOrDefault(prefix, 0);
  }


}
