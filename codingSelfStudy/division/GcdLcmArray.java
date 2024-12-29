package codingSelfStudy.division;

public class GcdLcmArray {
    public static int gcd(int a, int b) {
        if (b ==0) return a;
        return gcd(b, a%b);
    }
    //최소공배수 구하기
    public static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        int[] arr = {12, 18, 24}; //입력 배열

        //배열의 최대공약수 구하기
        int resultGCD = arr[0];
        for (int i = 1; i<arr.length; i++) {
            resultGCD = gcd(resultGCD, arr[i]);
        }

        //배열의 최대공배수 구하기
        int resultLCM = arr[0];
        for (int i = 1; i < arr.length; i++){
            resultLCM = lcm(resultLCM, arr[i]);
        }
        System.out.println("배열의 최대공약수 : "+resultGCD);
        System.out.println("배열의 최소공배수 : " +resultLCM);
    }
}
