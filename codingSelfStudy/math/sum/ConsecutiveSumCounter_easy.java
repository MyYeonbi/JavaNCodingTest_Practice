package codingSelfStudy.math.sum;
/*숫자  n 을 연속된 자연수들의 합으로 표현할 수 있는 방법을 모두 찾고 방법의 개수를 리턴하기.!*/
public class ConsecutiveSumCounter_easy {
    public int solution(int n) {
        int count = 0;
        // 방법의 개수를 저장. n을 연속된 숫자로 만드는 방법을 찾을 때마다 count를 1씩 늘린다.

        for (int start = 1; start <= n; start++) {
            // n을 만들기 위해 모든 숫자를 시작점으로 본다.start라는 변수를 1로 시작해서, n까지 하나씩 증가시킨다.

            int sum = 0;
            //숫자들을 더한 결과(합계)를 저장하는 변수. 

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
