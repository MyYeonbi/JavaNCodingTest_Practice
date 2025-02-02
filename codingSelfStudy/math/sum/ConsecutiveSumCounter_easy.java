package codingSelfStudy.math.sum;

public class ConsecutiveSumCounter_easy {
    public int solution(int n) {
        int count = 0;

        for (int start = 1; start <= n; start++) {
            int sum = 0;

            for (int num = start; sum < n; num++) {
                sum += num;

                if (sum == n) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
