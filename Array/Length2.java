package Array;

public class Length2 {
    public int[] solution(int[] numbers, int num1, int num2) {
        //num1부터 num2까지의 범위를 담을 배열의 크기를 계산
        int[] answer = new int[num2- num1 +1];

        //numbers에서 num1번 째 인덱스부터 num2번 째 인덱스까지를 answer에 복사
        for (int i = num1 ; i <= num2; i++) {
            answer[i - num1] = numbers[i];//answer의 인덱스는 0부터 시작
        }
        return answer;
    }
}
