package codingSelfStudy.math.sum;

public class DigitSum {
    public int solution(int n) {
        int sum = 0;

        //각 자릿수 더하기
        while (n > 0) {
            sum += n % 10; // 마지막 자릿수 더하기
            /*맨 끝 숫자를 꺼내면 나머지를 이용한다.
             숫자 10으로 나눴을 때 나머지가 바로 맨 끝 숫자.*/

            n /= 10; // 마지막 자릿수 제거
            /* 숫자를 10으로 나누면 나머지가 없어지고 앞의 숫자만 남는다.
            */
        }
        return sum;
    }
    public static void main(String[] args) {
        DigitSum digitSum = new DigitSum();
        System.out.println(digitSum.solution(134));
    }
}
