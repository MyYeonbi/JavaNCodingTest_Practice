package reviewCodingTest;
import java.util.HashSet;
import java.util.Set;
public class HashSetRe {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>();
        int count = 0;

        for (String element : s1) {
            set.add(element);
        }
        for(String element : s2) {
            if(set.contains(element)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        HashSetRe solution = new HashSetRe();
        String[] s1 = {"abc", "dfdf"};
        String[] s2 = {"abc", "bsd", "dfdf", "dfdfgg"};

        System.out.println(solution.solution(s1, s2));
    }
}
