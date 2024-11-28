package basic;

public class reversedArray {
    public static int[] solution(int[] num_list) {
        // 1. 배열 길이 확인
        int length = num_list.length;
        // 2. 새로운 배열 생성
        int[] reversedArray = new int[length];
        // 3. 배열을 거꾸로 복사
        for (int i = 0; i < length; i++) {
            reversedArray[i] = num_list[length -1 -i];
        }
        // 4. 결과 반환
        return reversedArray;
    }
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        int[] result = solution(num_list);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
