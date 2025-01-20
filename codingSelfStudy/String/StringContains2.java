package codingSelfStudy.String;

public class StringContains2 {
    public int solution(String A, String B) {
        return A.indexOf(B) != -1 ? 1: 0;
    }

    public static void main(String[] args) {
        StringContains2 s = new StringContains2();
        System.out.println(s.solution("abcd", "abcd"));
    }
}
