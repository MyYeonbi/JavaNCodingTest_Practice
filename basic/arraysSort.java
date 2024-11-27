package basic;

import java.util.Arrays;
public class arraysSort {
    // int[] array = {7, 10, 3, 4, 1};

    public static int solution(int[] array) {
        Arrays.sort(array);

        int median = array.length / 2;
        return array[median];
    }
    public static void main(String[] args) {
        int [] exampleArray = {1, 3, 5, 7, 9};
        System.out.println("중앙값 : " + solution(exampleArray));
    }
}
