package codingStudy.maratonCom;
import java.util.HashSet;

public class MarathonHashSet {
  public String solution(String[] participant, String[] completion){
    HashSet<String> set = new HashSet<>();

    for (String name : participant) set.add(name);
    for (String name : completion) set.remove(name);

    for (String name : set) return name;

    return "";
  }

}
