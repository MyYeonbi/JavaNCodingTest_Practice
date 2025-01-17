package codingSelfStudy.math;

public class EvenOddCounter {
    public int[] solution(int[] num_list) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[] {evenCount, oddCount};
    }

    public static void main(String[] args) {
        EvenOddCounter counter = new EvenOddCounter();
        int[] num_list = {1, 2, 3, 4, 5, 6};
        int[] result = counter.solution(num_list);

        System.out.println("짝수 개수: " + result[0]);
        System.out.println("홀수 개수: " + result[1]);
    }
}
