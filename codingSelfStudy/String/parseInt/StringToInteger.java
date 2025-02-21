package codingSelfStudy.String.parseInt;

public class StringToInteger {
    public static int solution (String s) {
        // 문자열을 정수로 변환하는 방법 : Integer.parseInt() 사용
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        // 테스트 케이스
        String s1 = "1234";
        String s2 = "-1234";
        String s3 = "+567";

        System.out.println(solution(s1)); // 1234
        System.out.println(solution(s2)); // -1234
        System.out.println(solution(s3)); // 567
    }
}
