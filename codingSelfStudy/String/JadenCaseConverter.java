package codingSelfStudy.String;

public class JadenCaseConverter {
    public String solution(String s) {
        // 변환된 결과 문자열을 저장하기에는 StringBuilder 객체를 생성하는 것이 좋다. 문자열 변경 작업에 최적화된 클래스이기 때문이다.
        StringBuilder result = new StringBuilder();


        // 단어의 시작 여부 추적하기 위한 플래그 변수.
        boolean isStartOfWord = true;

        // 입력 문자열 s를 처음부터 끝까지 탐색하기 위한 반복문
        for (int i = 0; i < s.length(); i++) {
            //현재 탐색중인 문자를 변수 currentChar에 저장.
            char currentChar = s.charAt(i);

            // 현재 문자가 단어의 시작인지 확인. 조건 기반 분기 처리를 통해 문제를 세분화(단어의 시작과 나머지 처리 분리).
            if (isStartOfWord) {
                // 현재 문자가 알파벳인지 확인. 입력값 종류에 따라 다르게 처리. 'Character.isLetter'은 문자가 알파벳인지 확인하는 자바 내장 메서드
                if (Character.isLetter(currentChar)) {
                    // StringBuilder.append메서드 사용과 Character.toUpperCase 메서드 사용을 통해 현재 문자를 대분자로 변환.
                    result.append(Character.toUpperCase(currentChar));
                } else {
                    // 알파벳이 아닌 문자는 변환 없이 그대로 결과에 추가.- 숫자와 특수 문자 예외 처리.
                    result.append(currentChar); // 숫자 또는 특수 문자 처리
                }
                // 현재 문자가 단어의 첫 문자가 아니므로 플래그를 변경 - 상태 업데이트
                isStartOfWord = false; // 단어가 시작었음을 표시
            } else {
                // 단어의 첫 문자가 아닌 나머지 소문자를 변환해 결과를 추가.Character.toLowerCase메서드 사용
                result.append(Character.toLowerCase(currentChar));
            }

            // 공백 확인. 공백일 경우 다음 문자는 단어의 시작이므로 플래그를 변경.
            if ( currentChar == ' ') {
                isStartOfWord = true; // 다음 단어의 시작임을 표시
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        JadenCaseConverter solution = new JadenCaseConverter();

        String test1 = "3people unFollowed me";
        String test2 = "for the last week";
        String test3 = "hello world ";
        String test4 = " ";

        System.out.println(solution.solution(test1)); // "3people Unfollowed Me"
        System.out.println(solution.solution(test2)); // "For The Last Week"
        System.out.println(solution.solution(test3)); // "Hello World "
        System.out.println(solution.solution(test4)); // " "
    }

}
