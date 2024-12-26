package basic;
import java.util.Arrays;
public class Tri {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]){
            return 1;
        } else {
            return 2;
        }
    }
    public static void main(String[] args) {
        Tri tri = new Tri();

        int[] sides1 = {1,2,3};
        System.out.println(tri.solution(sides1));
    }
}
