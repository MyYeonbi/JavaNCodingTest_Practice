package codingSelfStudy.arrayy;

public class ArrayAverageCalculator {

    public double solution(int[] arr) {
        // 1. 합계를 저장하는 변수 초기화
        int sum = 0;

        //2. for문을 통해 배열의 요소 순회하여 sum에 더하기
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // arr[i]를 따로 변수에 저장할 필요 없이 바로 더하면 됨.
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        double solution = new ArrayAverageCalculator().solution(new int[]{1, 2, 3, 4, 5});

        System.out.println(solution);
    }
}
