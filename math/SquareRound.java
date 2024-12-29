package math;

public class SquareRound {
    public static void main(String[] args) {
        //양수의 제곱근
        System.out.println(Math.sqrt(25));

        //실수의 제곱근
        System.out.println(Math.sqrt(20.25));

        //음수의 제곱근
        System.out.println(Math.sqrt(-4));

        //제곱근 결과 저장
        double result = Math.sqrt(144);
        System.out.println(result);

        //정수 판별
        double sqrt = Math.sqrt(50);
        if (sqrt == (int)sqrt) {
            System.out.println("정수입니다.");
        } else {
            System.out.println("정수가 아닙니다.");
        }

    }
}
