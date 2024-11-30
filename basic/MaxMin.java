package basic;


import java.util.Arrays;
import java.util.Random;

public class MaxMin {
    public int[] solution(int[] nums) {
        int[] answer = new int[2];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        answer[0] = min;
        answer[1] = max;

        return answer;
    }
    public static void main(String[] args) {
        int[] case1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};



        MaxMin maxMin = new MaxMin();
        System.out.println(Arrays.toString(maxMin.solution(case1)));;

        int numsCount = 2000;
        int[] case2 = new int[numsCount];
        Random random = new Random();

        for (int i = 0; i < numsCount; i++) {
            // 0~ 2000 사이의 무작위 정수 생성
            case2[i] = random.nextInt(numsCount);
        }
        System.out.println(Arrays.toString(maxMin.solution(case2)));

    }

}
