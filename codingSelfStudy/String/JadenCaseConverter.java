package codingSelfStudy.String;

public class JadenCaseConverter {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();

        // 이전 문자가 공백인지 여부를 확인하기 위한 변수
        boolean isStartOfWord = true;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // 단어의 첫 문장 처리
            if (isStartOfWord) {
                if (Character.isLetter(currentChar)) {
                    result.append(Character.toUpperCase(currentChar));
                } else {
                    result.append(currentChar); // 숫자 또는 특수 문자 처리
                }
                isStartOfWord = false; // 단어가 시작었음을 표시
            } else {
                result.append(Character.toLowerCase(currentChar));
            }

            // 공백 확인
            if ( currentChar == ' ') {
                isStartOfWord = true; // 다음 단어의 시작임을 표시
            }
        }
        return result.toString();
    }

}
