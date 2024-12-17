package division;

public class GcdLcm {
    public int solution(int n) {
        int gcd = gcd(6,n); //최대공약수 구하기
        int lcm = (6*n)/gcd; //최소공배수 구하기
        return lcm / 6; // 최소공배수를 6으로 나눈 값 = 필요한 피자 판수
    }

    //유클리드 호제법으로 최대공약수 구하기
    public int gcd(int a, int b) {
        if (b == 0 ) return a;
        return gcd(b, a % b);
    }
}
