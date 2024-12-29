package math;

import java.util.Arrays;

public class Tri {
    public int sol(int[] sides) {
        Arrays.sort(sides);

        if(sides[2] < sides[0]+sides[1]) {
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Tri tri = new Tri();
        System.out.println(tri.sol(new int[]{1,2,7}));
    }
}
