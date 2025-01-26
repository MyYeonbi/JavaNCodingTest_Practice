package codingStudy.recursion;

public class DigitSumCalculator {
    public static void main(String[] args) {
        int tc1 = 1324;
        int tc2 = 1118;
        int tc3 = 1;
        int tc4 = 123456789;

        System.out.println(solution(tc1)); // 10
        System.out.println(solution(tc2)); // 11
        System.out.println(solution(tc3)); // 1
        System.out.println(solution(tc4)); // 45
    }
 public static int solution(int num) {
        // 종료 조건 : 숫자가 한 자리수이면 그대로 반환
     if (num < 10) {
         return num;
     }
     //재귀 호출 : 마지막 자리 숫자(num % 10)를 더하고 나머지 숫자(num/10)에 대해 solution 호출
     return (num % 10) + solution(num / 10);
 }
}
