package codingSelfStudy.arrayy;
//자연수 뒤집어 배열로 만들기
import java.util.*;
public class ReverseNumberArray {
    public int[] solution(long n) {
        String str = String.valueOf(n); //1. 숫자를 문자열로 변환
        int length = str.length();
        int[] answer = new int[length]; // 2. 결과 배열 생성

        for (int i = 0; i < length; i++) {
            answer[i] = str.charAt(length -1 -i) - '0'; //3. 뒤에서부터 숫자로 변환
         }

        return answer;
    }
    /*1. 숫자를 문자열로 변환  : String.valueOf(n)을 사용하여 n을 문자열로 변환한다.
    * 2. 배열 생성 : n의 자릿수(str.length())만큰의 크기를 가진 int[]배열을 생성한다.
    * 3. 문자열로 거꾸로 읽어 배열에 저장 : str.charAt(length -1 -i) - '0'
    *    문자열의 뒤에서부터 char값을 가져오고, '0'을 빼서 숫자로 변환한다.
    * 4. 배열 반환. */
}
