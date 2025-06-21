package codingStudy;

import java.util.*;

class FilteredDataSorter {
  public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
    // 열 이름에 따른 인덱스 매핑
    Map<String, Integer> columnIndex = Map.of(
        "code", 0,
        "date", 1,
        "maximum", 2,
        "remain", 3
    );

    int extIdx = columnIndex.get(ext);
    int sortIdx = columnIndex.get(sort_by);

    // 조건에 맞는 행만 필터링
    List<int[]> filtered = new ArrayList<>();
    for (int[] row : data) {
      if (row[extIdx] < val_ext) {
        filtered.add(row);
      }
    }

    // 정렬
    filtered.sort(Comparator.comparingInt(a -> a[sortIdx]));

    // 리스트를 배열로 변환
    int[][] answer = new int[filtered.size()][];
    for (int i = 0; i < filtered.size(); i++) {
      answer[i] = filtered.get(i);
    }

    return answer;
  }
}
