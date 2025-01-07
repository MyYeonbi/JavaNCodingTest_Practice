package codingSelfStudy.division;
/* 피자 한판에 6조각이 있다. 특정인원 n 를 입력받아 이들에게 최소 1조각씩 나눠주기 위해
 최소한의 피자 판 수를 계산한다.
 n명은 모두 공통된 조각수를 배분 받아야 한다.
* */
public class GcdLcm {

    /* 피자조각수와 사람수의 최소공배수를 계산하여,
    이를 피자 한 판의 조각수(6)로 나눠 피자 판수를 구한다. */
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
