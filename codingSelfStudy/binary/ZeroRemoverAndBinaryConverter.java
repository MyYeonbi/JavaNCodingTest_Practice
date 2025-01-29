package codingSelfStudy.binary;

import java.util.Arrays;
/* < 문제 설명 >
* 1. 어떤 숫자가 들어오면, 숫자 안에 있는 0을 모두 없애야 한다.
* 2. 남아있는 숫자의 길이를 다시 이진수로 바꾼다.
* 3. 이 과정을 숫자가 "1"이 될 때까지 반복한다.
* 4. 과정이 끝나면, 몇 번 변환을 했는지와 얼마나 많은 0을 지웠는지 리턴해야 한다. */

public class ZeroRemoverAndBinaryConverter {
    public int[] solution(String s) {

        int count = 0;
        // 몇 번 변환을 했는지 저장하는 변수.
        int removeZero = 0;
        // 제거된 0의 개수를 저장하는 변수.

        while (!s.equals("1")) {
            // 문자열 s가 "1"이 될 때까지 반복 실행.
            int lengthBefore = s.length();
            // 변환 전에 문자열의 길이를 저장.

            s = s.replace("0","");
            // 문자열에서 "0"을 모두 제거. replace.("0","")-> "0"을 빈 문자열("")로 치환하여 삭제.

            int lengthAfter = s.length();
            removeZero += (lengthBefore - lengthAfter);
            s = Integer.toBinaryString(lengthAfter);
            count++;
        }

        return new int[]{count, removeZero};

    }

    public static void main(String[] args) {
        ZeroRemoverAndBinaryConverter c = new ZeroRemoverAndBinaryConverter();
        int[] result = c.solution("111000011110010");
        System.out.println(Arrays.toString(result));
    }
}
