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

        //3. 숫자 문자열의 연산 - 입력으로 받은 숫자 문자열을 변환 후 계산이 필요한 경우.
        String input1 = "50";
        String input2 = "100";
        int re = Integer.parseInt(input1) + Integer.parseInt(input2);
        System.out.println(re);

        //4.배열 인덱스 계산 - 입력으로 주어진 숫자를 배열 인덱스 값으로 사용할 때.
        String in = "3"; // 배열에서 사용할 인덱스
        int index = Integer.parseInt(in);
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[index]);

        //코테에서 활용법

        //1. 입력 처리 - 여러 숫자가 공백으로 구분된 문자열로 주어지는 경우가 많다. 이를 숫자로 변환할 때 사용한다.
        String input = "10 20 30";
        String[] number = input.split(" "); // 공백으로 분리: 분리의 문법은 .split
        int sum = 0;
        for (String s : number) {
            sum += Integer.parseInt(s); //문자열 -> 정수 변형 가능!
        }
        System.out.println(sum); // 공백으로 구분된 문자열의 숫자들이 10+20+30으로 계산되어 출력값: 60

        //2. char[]를 int형으로 바꾸기 위해서는 중간에 String으로 바꾸는 'String.valueOf()'가 필요.
        char[] chars = {'1', '2', '3'};
        String str1 = String.valueOf(chars);
        int fi = Integer.parseInt(str1);
        System.out.println(fi);

    }
}
