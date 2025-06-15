package codingStudy;

public class NumberManipulator {
  public int solution(int num, String[] commands) {
    for (String command : commands) {
      switch (command) {
        case "w": num += 1; break;
        case "s": num -= 1; break;
        case "d": num += 10; break;
        case "a": num -= 10; break;
      }
    }
    return num;
  }

}
