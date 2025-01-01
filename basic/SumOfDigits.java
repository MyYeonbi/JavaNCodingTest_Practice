package basic;

public class SumOfDigits {
    public int solution(String my_string) {
        int sum = 0; //자연수들의 합을 저장할 변수

        for (char ch : my_string.toCharArray()) { //문자열의 각 문자 순회
            if (Character.isDigit(ch)) { // 문자가 숫자인지 확인
                sum += Character.getNumericValue(ch); // 숫자 값을 더함
            }
        }
        return sum; // 합계 반환
    }
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        System.out.println(sumOfDigits.solution("123tostrigf11"));
    }
}
