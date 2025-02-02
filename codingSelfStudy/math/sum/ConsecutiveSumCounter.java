package codingSelfStudy.math.sum;

public class ConsecutiveSumCounter {
    public int solution(int n) {
        int count = 0; // 가능한 경우의 수

        for (int k = 1; k * (k - 1) < 2 * n ; k++) {
            // 연속된 자연수의 합이 n이 되는 x값을 계산
            if ((2 * n - k * (k - 1)) % (2 * k) == 0){
                count++;
            }
        }
        return count;
    }
}
