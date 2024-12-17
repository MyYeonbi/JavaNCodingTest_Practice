package division;
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
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 :");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("최소공배수: "+ lcm(a,b));
    }
}
