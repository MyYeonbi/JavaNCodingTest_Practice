package codingSelfStudy.integger;

public class parse {
    public static void main(String[] args) {
        // 1. 문자열 -> 정수 (기본)
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        // 2. 진법을 지정한 변환
        String binary = "1010"; // 2진수 문자열
        int decimal = Integer.parseInt(binary, 2); //  2진수 → 10진수. 출력 : 10
        /* 두번째 매개변수는 첫번째 매개변수로 전달된 문자열이 나타내는 숫자체계(진법)을 의미한다.
        여기서는 2진법의 수를 10진법으로 바꾸려고 하는것이다.
        	예를 들어:
	•	2: 2진법 (binary)
	•	8: 8진법 (octal)
	•	10: 10진법 (decimal)
	•	16: 16진법 (hexadecimal)
         */

        //코테에서 활용법

        //1. 입력 처리 - 여러 숫자가 공백으로 구분된 문자열로 주어지는 경우가 많다. 이를 숫자로 변환할 때 사용한다.
        String input = "10 20 30";
        String[] number = input.split(" "); // 공백으로 분리: 분리의 문법은 .split
        int sum = 0;
        for (String s : number) {
            sum += Integer.parseInt(number); //문자열 -> 정수 변형 가능!
        }
        System.out.println(sum);


    }
}
