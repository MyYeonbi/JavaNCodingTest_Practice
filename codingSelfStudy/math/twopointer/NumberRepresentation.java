package codingSelfStudy.math.twopointer;

public class NumberRepresentation {
    public int solution(int n) {
        int count = 0;
        // 연속된 자연수의 합으로 n을 만들 수 있는 경우의 수를 저장.

        for (int start = 1; start <= n; start++) {
            // 외부 반복문(시작 숫자 설정)
            int sum = 0;

            for (int num = start; num <= n; num++){
                sum += num;

                if (sum ==n) {
                    count++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        NumberRepresentation nr = new NumberRepresentation();
        System.out.println(nr.solution(15));

    }

}
