package codingStudy.set;
import java.util.HashSet;
public class SetQuiz1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        System.out.println(checkDuplicateLetters(str1));

    }
    static boolean checkDuplicateLetters(String s) {
        //set을 활용해서 중복 문자열이 있으면 true , 없으면 false

        // 1. HashSet 생성
        HashSet<Character> set = new HashSet<>();

        //2. 문자열의 각 문자를 검사
        for (char c : s.toCharArray()) {
            // 이미 존재하면 중복이므로 true 반환
            if (set.contains(c)){
                return true; // 중복 문자 발견
            }
            set.add(c);
        }

        // 중복 문자 없음
        return false;
    }
}
