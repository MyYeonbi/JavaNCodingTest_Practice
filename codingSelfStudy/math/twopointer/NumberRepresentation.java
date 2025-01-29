package codingSelfStudy.math.twopointer;

public class NumberRepresentation {
    public int solution(int n) {
        int count = 0;
        // 연속된 자연수의 합으로 n을 만들 수 있는 경우의 수를 저장.

        for (int start = 1; start <= n; start++) {
            // 외부 반복문(시작 숫자 설정)
            int sum = 0;
            // 합 변수 초기화. 현재 연속된 자연수들의 합을 저장할 변수.

            for (int num = start; num <= n; num++){
                // 내부 반복문(연속된 자연수의 합 계산)- start부터 n까지 연속된 자연수를 더하면서 목표값 n과 비교. 또 다른 for 반복문을 사용하여 내부 루프 실행.
                sum += num;
                // 현재 숫자를 sum에 누적하여 연속된 합 계산.

                if (sum ==n) {
                    //합이 n과 같은 경우 처리.
                    count++;
                    break;
                    // 경우의 수 증가 및 내부 루프 종료. sum이 n과 같으므로 더 이상의 합 계산 불필요. 내부 루프 종료
                }
                if (sum > n) {
                    break;
                    // sum이 n보다 커지면 불필요한 계산을 피하기 위해 반복문 탈출.
                }
            }
        }
        return count;
        //n을 표현하는 경우의 수를 반환.

    }

    public static void main(String[] args) {
        NumberRepresentation nr = new NumberRepresentation();
        System.out.println(nr.solution(15));

    }

}
