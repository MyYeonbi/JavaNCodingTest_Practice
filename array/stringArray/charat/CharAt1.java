package array.stringArray.charat;

public class CharAt1 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        //특정 위치의 문자 가져오기
        char ch = str.charAt(0); // 인덱스 0 -> 'H'
        System.out.println(ch);

        char ch1 = str.charAt(1);
        System.out.println(ch1);

        // 문자열 끝의 문자 가져오기
        char lastChar = str.charAt(str.length()-1);
        System.out.println(lastChar);
    }
}
