package basic;

public class letter {
    public static int solution(String message) {
        //1. 문자열의 길이를 구한다.
        int length = message.length();
        //2. 각 글자당 2cm를 곱한다.
        int totalWidth = length * 2;
        //3. 결과를 반환한다.
        return totalWidth;
    }
    public static void main(String[] args) {
        String message = "생신 축하합니다!";
        int result = solution(message);
        System.out.println("필요한 편지지의 최소 가로 길이: " + result + "cm");
    }
}
