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
                // start부터 숫자를 하나씩 더하면서 합계가 n에 도달하는지 확인한다. num은 start 부터 시작하고 숫자를 하나씩 늘려가며 더한다. 조건 sum < n은 합계가 n보다 작을 때까지만 계속 더한다.

                sum += num;
                // 지금까지의 합계 sum에 num을 더한다. 연속된 숫자를 하나씩 더해서 합계를 만든다.

                if (sum == n) {
                    // 합계가 n과 같아졌다면, 연속된 숫자로 n을 만드는 방법을 찾은 것.

                    count++;
                    //count를 1씩 증가시켜서 방법의 개수를 기록한다.
                    break;
                    // 더 이상 숫자를 더할 필요가 없으니 다음 시작점으로 넘어가도록 멈춘다. 
                }
            }
        }
        return count;
        // 최종적으로 방법의 개수 반환
    }
}
