package codingStudy;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    public String[] solution(String[] todo_list, boolean[] finished) {
      List<String> result = new ArrayList<>();

      for (int i = 0; i < todo_list.length; i++) {
        if (!finished[i]) {
          result.add(todo_list[i]);
        }
      }

      return result.toArray(new String[0]);
    }
  }

