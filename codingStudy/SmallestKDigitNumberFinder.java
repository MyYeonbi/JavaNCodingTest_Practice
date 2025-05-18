package codingStudy;

import java.io.*;
import java.util.*;

public class SmallestKDigitNumberFinder {
  static String N;
  static int K;
  static String result;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = st.nextToken();
    K = Integer.parseInt(st.nextToken());

    result = null;
    dfs("", 0, 0);

    System.out.println(result);
  }

  static void dfs(String current, int index, int usedDigits) {
    if (result != null) return;

    if (current.length() == N.length()) {
      if (Integer.bitCount(usedDigits) <= K && current.compareTo(N) >= 0) {
        result = current;
      }
      return;
    }

    for (int i = 0; i <= 9; i++) {
      if (current.isEmpty() && i == 0) continue;

      int newUsedDigits = usedDigits | (1 << i);
      if (Integer.bitCount(newUsedDigits) > K) continue;

      dfs(current + i, index + 1, newUsedDigits);
    }
  }
}