package codingStudy;

import java.util.Arrays;

public class TodoListCutter {
  public String[] solution(String[] todo_list) {
    int length = Math.min(todo_list.length, 5);
    String[] result = new String[length];
    for (int i = 0; i < length; i++) {
      result[i] = todo_list[i];
    }
    return result;
  }

  class Solution {
    public String[] solution(String[] todo_list) {
      return Arrays.stream(todo_list)
          .limit(5)
          .toArray(String[]::new);
    }
  }

}
