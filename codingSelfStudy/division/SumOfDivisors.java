package codingSelfStudy.division;

public class SumOfDivisors {
    //정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요
    public int solution(int n) {
        int sum = 0; //약수의 합을 저장할 변수

        //1부터 n까지 반복하면서 약수를 찾음
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        return sum; // 약수의 합 반환
    }

    public static void main(String[] args) {
        SumOfDivisors sumOfDivisors = new SumOfDivisors();

        System.out.println(sumOfDivisors.solution(4));
    }
}
