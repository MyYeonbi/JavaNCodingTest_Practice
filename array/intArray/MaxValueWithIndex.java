package array.intArray;

public class MaxValueWithIndex {
    public int[] solution(int[] array) {
        int maxValue = array[0]; // 첫 번째 요소를 초기 최대값으로 설정
        int maxIndex = 0; // 첫 번째 요소의 인덱스를 초기 최대 인덱스로 설정

        for (int i = 1; i < array.length; i++) { // 배열 순회(첫 번때 요소는 이미 처리)
            if (array[i] > maxValue) { // 현재 요소가 저장된 최대값보다 크다면
                maxValue = array[i]; // 최대값 갱신
                maxIndex = i; // 인덱스 갱신
            }

        }
        return new int[]{maxValue, maxIndex}; // 최대값과 인덱스를 배열로 반환

    }
    public static void main(String[] args) {
        MaxValueWithIndex solution = new MaxValueWithIndex();

        int[] result1 = solution.solution(new int[]{1,2,3,4,5});
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
    }

}