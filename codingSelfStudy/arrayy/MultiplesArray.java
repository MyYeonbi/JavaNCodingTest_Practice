package codingSelfStudy.arrayy;

public class MultiplesArray {
    public long[] solution(int x, int n) {
        long[] result = new long[n]; // 결과를 저장할 배열 생성

        for (int i = 0; i < n; i++) { // 0부터 n-1까지 반복
            result[i] = (long) x * (i + 1); // 각 요소에 x의 배수를 계산
        }

        return result; // 결과 배열 반환
    }
}
