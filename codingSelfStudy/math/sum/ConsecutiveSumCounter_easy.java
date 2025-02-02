package codingSelfStudy.math.sum;
/*숫자  n 을 연속된 자연수들의 합으로 표현할 수 있는 방법을 모두 찾고 방법의 개수를 리턴하기.!*/
public class ConsecutiveSumCounter_easy {
    public int solution(int n) {
        int count = 0;
        // 방법의 개수를 저장. n을 연속된 숫자로 만드는 방법을 찾을 때마다 count를 1씩 늘린다. 

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
