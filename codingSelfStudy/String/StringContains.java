package codingSelfStudy.String;

public class StringContains {
    public int solution(String A, String B) {
        return A.contains(B) ? 1 : 0;
    }
    public static void main(String[] args) {
        StringContains stringContains=new StringContains();
        System.out.println(stringContains.solution("abcddgdeer", "abcd"));
    }
}
