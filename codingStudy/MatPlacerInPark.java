package codingStudy;

class MatPlacerInPark {
  public int solution(int[] mats, String[][] park) {
    int n = park.length;
    int m = park[0].length;

    // 1. mats 내림차순 정렬
    java.util.Arrays.sort(mats);
    for (int i = mats.length - 1; i >= 0; i--) {
      int size = mats[i];
      if (canPlace(size, park, n, m)) {
        return size;
      }
    }
    return -1;
  }

  // 2. size x size 돗자리를 놓을 수 있는지 확인
  private boolean canPlace(int size, String[][] park, int n, int m) {
    for (int i = 0; i <= n - size; i++) {
      for (int j = 0; j <= m - size; j++) {
        if (isClear(i, j, size, park)) {
          return true;
        }
      }
    }
    return false;
  }

  // 3. 특정 위치에서 size x size가 전부 "-1"인지 확인
  private boolean isClear(int row, int col, int size, String[][] park) {
    for (int i = row; i < row + size; i++) {
      for (int j = col; j < col + size; j++) {
        if (!park[i][j].equals("-1")) {
          return false;
        }
      }
    }
    return true;
  }
}