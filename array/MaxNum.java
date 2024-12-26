package array;
import java.util.Arrays;

public class MaxNum {
    public int solution( int[] numbers) {
        Arrays.sort(numbers);

        int max1 = numbers[numbers.length-1] * numbers[numbers.length-2];
        return max1;
    }
    public static void main(String[] args) {
        MaxNum maxNum = new MaxNum();
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(maxNum.solution(numbers));
    }
}
