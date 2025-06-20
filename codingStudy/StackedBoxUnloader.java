package codingStudy;

public class StackedBoxUnloader {

  public int solution(int n, int w, int num) {
    // 0-based index
    int layer = (num - 1) / w;
    int col = (num - 1) % w;

    int count = 0;
    for (int i = layer + 1; ; i++) {
      int startNum = i * w + 1;
      if (startNum > n) break;

      int boxesInLayer = Math.min(w, n - i * w);
      int targetCol;

      if (i % 2 == 0) {
        targetCol = col;
      } else {
        targetCol = w - 1 - col;
      }

      if (targetCol < boxesInLayer) {
        count++;
      }
    }

    return count + 1; // 위에 쌓인 개수 + 자기 자신
  }

}
