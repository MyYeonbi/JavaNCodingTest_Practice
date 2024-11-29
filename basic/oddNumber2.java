package basic;

public class oddNumber2 {
    public static int[] solution(int n) {
        // 홀수 개수 계산
        int size = (n + 1) / 2;

        // 배열 생성
        int[] answer = new int[size];

        // 홀수 저장
        int index = 0;
        for (int i = 1; i <= n; i += 2) {
            answer[index++] = i;
        }

        return answer;
    }
}
