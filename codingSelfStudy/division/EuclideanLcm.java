package codingSelfStudy.division;
import java.util.Scanner;

public class EuclideanLcm {
    //최대공약수 구하기
    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    //최소공배수 구하기
    public static int lcm(int a, int b){
        return a * b/ gcd(a,b);
    }
    /*
    1. 최대 공약수(GCD)란? 두 숫자가 공통으로 나누어지는 가장 큰 수
    2. 최소 공배수(LCM)란? 두 숫자가 공통으로 나누어지는 가장 작은 숫자.
    3. 둘의 관계 GCD * LCM = a * b (두 숫자를 곱한 값)
    GCD는 겹치는 부분(공통 약수)를 나타내고, LCM은 겹치는 것을 한번만 계산해서 가장 작은 배수를 만드는것.
    그래서 a*b를 GCD로 나누면, 나머지 "겹치지 않은 부분"이 나온다. 그걸 LCM으로 만들 수 있다.
    * */

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 :");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("최소공배수: "+ lcm(a,b));
    }
}
