package codingSelfStudy.collection.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static int Solution (String [] s1, String [] s2) {
        Set <String> set = new HashSet<>();

        for (String element : s1) {
            set.add(element);
        }

        int count = 0;
        for (String element : s2) {
            if (set.contains(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(Solution(s1, s2)); // 출력: 2
    }
}
