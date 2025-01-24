package codingSelfStudy.arrayy;

import java.util.Arrays;

public class MultiplesArray {
    public long[] solution(int x, int n) {
        long[] result = new long[n];

        for (int i = 0; i < n; i++){
            result[i] = (long) x * (i +1);
        }
        return result;
    }

    public static void main(String[] args) {
        MultiplesArray multiplesArray = new MultiplesArray();
        System.out.println(Arrays.toString(multiplesArray.solution(2, 5)));
    }
}
