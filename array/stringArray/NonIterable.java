package array.stringArray;
import java.util.List;
import java.util.ArrayList;
public class NonIterable {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");

        for(String name : names) { //for-each 사용 가능
            System.out.println(name);
        }
    }
}
