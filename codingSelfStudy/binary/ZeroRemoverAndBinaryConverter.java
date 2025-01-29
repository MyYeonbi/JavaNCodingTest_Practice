package codingSelfStudy.binary;

import java.util.Arrays;

public class ZeroRemoverAndBinaryConverter {
    public int[] solution(String s) {
        int count = 0;
        int removeZero = 0;

        while (!s.equals("1")) {
            int lengthBefore = s.length();
            s = s.replace("0","");
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
