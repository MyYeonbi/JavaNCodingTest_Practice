package codingSelfStudy.division;
import java.util.Scanner;

public class EuclideanGcd {
/* 유클리드 호제법을 사용해서 두 정수의 최대공약수를 계산하라. */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    /* 유클리드 호제법은 다음 규칙에 따라 두 수 GCD를 계산한다.
    1. GCD(a,b) = GCD(b, a % b);
    (큰 수 a와 작은 수 b의 최대공약수는 b와 a % b의 최대 공약수와 같다. )
    2. GCD(a, 0) = a
    (나머지가 0이 될 때의 a가 GCD이다.)
    이 함수는 재귀적으로 호출되어 나머지가 0이 될때까지 계산을 반복한다.

    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("최대공약수를 구할 첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("최대공약수를 구할 두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("최대공약수는 " + gcd(a, b));
    }
}


