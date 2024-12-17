package division;
import java.util.Scanner;

public class EuclideanGcd {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("최대공약수를 구할 첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("최대공약수를 구할 두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("최대공약수는 " + gcd(a, b));
    }
}


